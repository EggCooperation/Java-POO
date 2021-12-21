
package entidades;

import java.util.Date;

public class Vendedor {
    //DEFINO LOS ATRIBUTOS
    private String nombre;
    private Integer dni;
    private Double sueldoBruto;
    private Date fechaInicio;
    private Double comision;
    private Double sueldoMensual;
    
    
    //CONTRUCTOR POR DEFECTO - VACÍO

    public Vendedor() {
    }
    
    //CONSTRUCTOR CON PARÁMETROS

    public Vendedor(String nombre, Integer dni, Double sueldoBruto, Double comision, Double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
        this.comision = comision;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }

    //GETTER & SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    //TO STRING -> PARA MOSTRARLO

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", dni=" + dni + ", sueldoBruto=" + sueldoBruto + ", comision=" + comision + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
}
