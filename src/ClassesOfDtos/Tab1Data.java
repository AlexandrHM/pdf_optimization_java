/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesOfDtos;

import java.util.Date;

/**
 *
 * @author desan
 */
public class Tab1Data {
    
    private int numeroEmpleado;
    private String nombreEmp;
    private int idCarta;
    private int revision;
    private Date fechaEntrega;
    
    public Tab1Data(int numeroEmpleado, String nombreEmp, int idCarta, int revision, Date fechaEntrega) {
    this.numeroEmpleado = numeroEmpleado;
    this.nombreEmp = nombreEmp;
    this.idCarta = idCarta;
    this.revision = revision;
    this.fechaEntrega = fechaEntrega;
  }

  // Getter methods
  public int getNumeroEmpleado() {
    return numeroEmpleado;
  }

  public String getNombreEmp() {
    return nombreEmp;
  }

  public int getIdCarta() {
    return idCarta;
  }

  public int getRevision() {
    return revision;
  }

  public Date getFechaEntrega() {
    return fechaEntrega;
  }

  // Setter methods
  public void setNumeroEmpleado(int numeroEmpleado) {
    this.numeroEmpleado = numeroEmpleado;
  }

  public void setNombreEmp(String nombreEmp) {
    this.nombreEmp = nombreEmp;
  }

  public void setIdCarta(int idCarta) {
    this.idCarta = idCarta;
  }

  public void setRevision(int revision) {
    this.revision = revision;
  }

  public void setFechaEntrega(Date fechaEntrega) {
    this.fechaEntrega = fechaEntrega;
  }
    
    
    
}
