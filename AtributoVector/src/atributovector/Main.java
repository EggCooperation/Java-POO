package atributovector;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Llenar el vector con set
//        Estudiante e1 = new Estudiante();
//        
//        int vector[] = new int[3]; // Creamos un vector para llenar el atributo
//        
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Ingrese las 3 notas");
//
//        for (int i = 0; i < vector.length; i++) { // Usamos el vector.lenght
//
//            System.out.println("Ingrese una nota");
//            int nota = scan.nextInt();
//
//            vector[i] = nota; // Llenamos el vector
//
//        }
//        
//        e1.setNotas(vector); // Guardamos el vector lleno en el vector atributo notas.
//        
//        e1.mostrarNotas(); // Tenemos que usar un metodo para mostrar el vector, no funciona el get.

//        Llenar el vector con metodos
        Scanner scan = new Scanner(System.in);      
        
        Estudiante e1 = new Estudiante();

        int notas[] = new int[3]; // Le ponemos la dimension al vector

        System.out.println("Ingrese las 3 notas");

        for (int i = 0; i < notas.length; i++) { // Usamos el vector.lenght

            System.out.println("Ingrese una nota");
            int nota = scan.nextInt();

            notas[i] = nota; // Llenamos el vector

        }

        e1.ingresarNotas(notas);

        e1.mostrarNotas();

    }

}
