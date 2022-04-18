
package Entidades;


public class Persona {
    
    public String nombre;
    public Integer edad;
    public Double peso;

    //CONTRUCTOR POR DEFECTO
    public Persona() {
    }
    
    //CONTRUCTOR POR PARAMETROS 
    public Persona(String nombre, Integer edad, Double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    //GETTER & SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
}
