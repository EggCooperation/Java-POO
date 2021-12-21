package atributodate;

import java.util.Date;

public class Perro {

    private Date fechaDeNacimiento; // Atributo tipo Date

    public Perro(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Perro() {
        fechaDeNacimiento = new Date(); // Esto es para que no se cree la fecha en null 
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void llenarFecha(Date fechaNacimiento) {
        this.fechaDeNacimiento = fechaNacimiento; // Lo guardamos en el atributo
    }

    public void mostrarFecha() {
        System.out.println("Dia:" + fechaDeNacimiento.getDate() // Mostramos el dia con getDate, no con getDay
                + " Mes:" + fechaDeNacimiento.getMonth() // Mostramos el mes 
                + " Año:" + fechaDeNacimiento.getYear()); // Mostramos el año
    }

    @Override
    public String toString() {
        return "Perro{" + "fechaDeNacimiento:" + "Dia:" + fechaDeNacimiento.getDate() // Mostramos el dia con getDate, no con getDay
                + " Mes:" + fechaDeNacimiento.getMonth() // Mostramos el mes 
                + " Año:" + fechaDeNacimiento.getYear();
    }
    
    

}
