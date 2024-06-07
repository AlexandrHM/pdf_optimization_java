package com.functionalityClasses;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

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

    public MethodsPdf(String correo, String nombre, String numeroEmpleado, 
    String departamento,String descEquipo, String modeloEquipo, String activoEquipo,
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

    public MethodsPdf() {
    }

    //llenar el pdf con parámetros
    public void fillPdfForm() {
        //PDF base vacío para hacer edición
        String inputFilePath = "C:/Users/sergi/OneDrive/Escritorio/CartasResponsivas/CartaTemplate.pdf";
        //PDF modificado y añadido el numero de empleado
        String outputFilePath = "C:/Users/sergi/OneDrive/Escritorio/CartasResponsivas/CartaModificado" + numeroEmpleado + ".pdf";
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
            fields.setField("Correo", correo); //empleado
            fields.setField("NombreEmpleado", nombre);  //empleado
            fields.setField("NumeroEmpleado", numeroEmpleado); //empleado
            fields.setField("Departamento", departamento); //empleado
            fields.setField("DescEquipo", descEquipo); //Dispositivos
            fields.setField("ModeloEquipo", modeloEquipo); //Dispositivos
            fields.setField("ActivoEquipo", activoEquipo); // Dispositivos
            fields.setField("NumeroSerie", numeroSerie); //Dispositivos
            fields.setField("EtiquetaEquipo", etiquetaEquipo); // Dispositivos

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
    public void openWhitExplorer(String filePath) {
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
