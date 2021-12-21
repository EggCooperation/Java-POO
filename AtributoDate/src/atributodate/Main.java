package atributodate;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Llenar el atributo Date con set
//        Scanner scan = new Scanner(System.in);
//        
//        Perro p1 = new Perro(); // Creamos el objeto
//        
//        System.out.println("Ingrese el dia");
//        int dia = scan.nextInt();
//        
//        System.out.println("Ingrese el mes");
//        int mes = scan.nextInt();
//        
//        System.out.println("Ingrese el año");
//        int anio = scan.nextInt();
//        
//        Date fechaNacimiento = new Date(anio, mes, dia); // Creamos el objeto tipo Date
//        
//        p1.setFechaDeNacimiento(fechaNacimiento); // Guardamos la fecha con el set
//        
//        p1.getFechaDeNacimiento(); // Mostramos la fecha con el get 
        //2 Llenar el atributo Date con metodos 
        Scanner scan = new Scanner(System.in);
        
        Perro p1 = new Perro();

        System.out.println("Ingrese el dia");
        int dia = scan.nextInt();

        System.out.println("Ingrese el mes");
        int mes = scan.nextInt();

        System.out.println("Ingrese el año");
        int anio = scan.nextInt();

        Date fechaNacimiento = new Date(); // Creamos el objeto tipo Date

        fechaNacimiento.setDate(dia); // Seteamos el dia
        fechaNacimiento.setMonth(mes); // Seteamos el mes
        fechaNacimiento.setYear(anio); // Seteamos el anio

        p1.llenarFecha(fechaNacimiento);

        //  p1.mostrarFecha();
        System.out.println(p1);

    }

}
