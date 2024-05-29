/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalityClasses;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author desan
 */
public class FillPdf {
    
     private String correo;
    private String nombre;
    private String numeroEmpleado;
    private String departamento;
    private String descEquipo;
    private String modeloEquipo;
    private String activoEquipo;
    private String numeroSerie;
    private String etiquetaEquipo;

    public FillPdf(String correo, String nombre, String numeroEmpleado, String departamento,
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
    
    
     public void fillPdfForm() {
        try {
            String inputPdfPath = selectFile("Seleccionar archivo PDF", false);
            if (inputPdfPath != null) {
                String outputPdfPath = selectFile("Guardar archivo PDF", true);
                if (outputPdfPath != null) {
                    processPdf(inputPdfPath, outputPdfPath);
                    JOptionPane.showMessageDialog(null, "El formulario ha sido rellenado y guardado correctamente.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    /**
     * Método para procesar y rellenar el formulario PDF.
     *
     * @param inputPdfPath Ruta del PDF de entrada
     * @param outputPdfPath Ruta del PDF de salida
     * @throws Exception Si ocurre algún error durante el proceso
     */
    private void processPdf(String inputPdfPath, String outputPdfPath) throws Exception {
        PdfReader pdfReader = new PdfReader(inputPdfPath);
        PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(outputPdfPath));
        AcroFields formFields = pdfStamper.getAcroFields();

        Map<String, String> data = new HashMap<>();
        data.put("Correo", correo);
        data.put("Nombre del empleado", nombre);
        data.put("Numero de Empleado", numeroEmpleado);
        data.put("Departamento", departamento);
        data.put("DescEquipo", descEquipo);
        data.put("ModeloEquipo", modeloEquipo);
        data.put("ActivoEquipo", activoEquipo);
        data.put("NumeroSerie", numeroSerie);
        data.put("EtiquetaEquipo", etiquetaEquipo);

        for (Map.Entry<String, String> entry : data.entrySet()) {
            formFields.setField(entry.getKey(), entry.getValue());
        }

        pdfStamper.setFormFlattening(true);
        pdfStamper.close();
        pdfReader.close();
    }

    /**
     * Método para seleccionar un archivo PDF con JFileChooser.
     *
     * @param dialogTitle Título del cuadro de diálogo
     * @param saveDialog Indica si es un cuadro de diálogo de guardar
     * @return La ruta del archivo PDF seleccionado
     */
    private static String selectFile(String dialogTitle, boolean saveDialog) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle(dialogTitle);
        int userSelection = saveDialog ? fileChooser.showSaveDialog(null) : fileChooser.showOpenDialog(null);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            return file.getAbsolutePath();
        }
        JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo.");
        return null;
    }
    
}
