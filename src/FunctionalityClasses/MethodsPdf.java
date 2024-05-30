package FunctionalityClasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.AcroFields.Item;
import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfString;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author desan
 */
public class MethodsPdf {
    
     private String correo;
    private String nombre;
    private String numeroEmpleado;
    private String departamento;
    private String descEquipo;
    private String modeloEquipo;
    private String activoEquipo;
    private String numeroSerie;
    private String etiquetaEquipo;

    public MethodsPdf(String correo, String nombre, String numeroEmpleado, String departamento,
                    String descEquipo, String modeloEquipo, String activoEquipo,
                    String numeroSerie, String etiquetaEquipo) {
        this.correo = correo;
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.descEquipo = descEquipo;
        this.modeloEquipo = modeloEquipo;
        this.activoEquipo = activoEquipo;
        this.numeroSerie = numeroSerie;
        this.etiquetaEquipo = etiquetaEquipo;
    }
    public MethodsPdf(){}
    
    
     public void fillPdfForm() {
         String inputFilePath = "C:/Users/desan/OneDrive/Documentos/CartaDatos.pdf";
        String outputFilePath = "C:/Users/desan/OneDrive/Documentos/CartaResponsivaRellenada"+numeroEmpleado+".pdf";

        File inputFile = new File(inputFilePath);
        if (!inputFile.exists()) {
            System.out.println("El archivo de entrada no se encuentra en la ruta especificada: " + inputFilePath);
            return;
        }

        try {
            // Abrir el PDF plantilla
            PdfReader reader = new PdfReader(inputFilePath);
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(outputFilePath));
            
            // Obtener el diccionario de campos del PDF
            AcroFields fields = stamper.getAcroFields();
            
            // Rellenar los campos
            fields.setField("Correo", correo);
            fields.setField("NombreEmpleado", nombre);
            fields.setField("NumeroEmpleado", numeroEmpleado);
            fields.setField("Departamento", departamento);
            fields.setField("DescEquipo", descEquipo);
            fields.setField("ModeloEquipo", modeloEquipo);
            fields.setField("ActivoEquipo", activoEquipo);
            fields.setField("NumeroSerie", numeroSerie);
            fields.setField("EtiquetaEquipo", etiquetaEquipo);

            // Eliminar los rectángulos alrededor del texto
            Map<String, AcroFields.Item> fieldsMap = fields.getFields();
            for (String key : fieldsMap.keySet()) {
                AcroFields.Item item = fieldsMap.get(key);
                for (int i = 0; i < item.size(); i++) {
                    PdfDictionary widget = item.getWidget(i);
                    PdfDictionary appearance = widget.getAsDict(PdfName.AP);
                    if (appearance != null) {
                        PdfDictionary normalAppearance = appearance.getAsDict(PdfName.N);
                        if (normalAppearance != null) {
                            normalAppearance.remove(PdfName.RECT);
                        }
                    }
                    widget.remove(PdfName.BORDER);
                    widget.remove(PdfName.BS);
                }
            }

            // Aplanar campos y generar PDF de salida
            stamper.setFormFlattening(true);
            stamper.close();
            reader.close();
            
            System.out.println("¡PDF generado con campos rellenados!");
        } catch (IOException | com.itextpdf.text.DocumentException e) {
            e.printStackTrace();
        }
        
    }
     
     
     //Abre el archivo pdf en su navegador por defecto 
     public void openWhitExplorer(String filePath){
    
        ;

        // Detectar el sistema operativo y ejecutar el comando adecuado
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("win")) {
                // Comando para Windows
                Runtime.getRuntime().exec(new String[]{"rundll32", "url.dll,FileProtocolHandler", filePath});
            } else if (os.contains("mac")) {
                // Comando para macOS
                Runtime.getRuntime().exec(new String[]{"open", filePath});
            } else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
                // Comando para Linux/Unix
                Runtime.getRuntime().exec(new String[]{"xdg-open", filePath});
            } else {
                System.out.println("Sistema operativo no soportado");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    
    
}
}