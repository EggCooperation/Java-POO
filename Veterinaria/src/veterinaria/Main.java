package veterinaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Llenar cuando lo inicializamos, usando el constructor parametrizado.
//        Esto lo podriamos usar si no queremos que se llene la informacion del perro
//        sino que haya unos valores por defecto o predeterminados, ya que 
//        el constructor se encarga de inicializar
//        Perro p1 = new Perro("Pepe", 5, "Boxer", "H", 20.5);
//
//        Llenar el objeto con setters y utilizando el constructor vacio
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");        
//        
//        Perro p1 = new Perro();
//        
//        System.out.println("Ingrese el nombre del perro");
//        String nombre = scan.next();
//        
//        System.out.println("Ingrese la edad la perro");
//        int edad = scan.nextInt();
//        
//        System.out.println("Ingrese la raza del perro");
//        String raza = scan.next();
//        
//        System.out.println("Ingrese el sexo del perro");
//        String sexo = scan.next();
//        
//        System.out.println("Ingrese el peso del perro");
//        double peso = scan.nextDouble();
//        
//        p1.setNombre(nombre);
//        p1.setEdad(edad);
//        p1.setRaza(raza);
//        p1.setSexo(sexo);
//        p1.setPeso(peso);
//
//        Mostrar atributos perro con getters
//        System.out.println("El nombre es: " + p1.getNombre());
//        System.out.println("La edad del perro es: " + p1.getEdad());
//        System.out.println("La raza del perro es:" + p1.getRaza());
//        System.out.println("El sexo del perro es: " + p1.getSexo());
//        System.out.println("El peso del perro es: " + p1.getPeso());
//      Llenar el objeto a traves de metodos creados en la clase
        Perro p1 = new Perro();

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre del perro");
        String nombre = scan.next();

        System.out.println("Ingrese la edad la perro");
        int edad = scan.nextInt();

        System.out.println("Ingrese la raza del perro");
        String raza = scan.next();

        System.out.println("Ingrese el sexo del perro");
        String sexo = scan.next();

        System.out.println("Ingrese el peso del perro");
        double peso = scan.nextDouble();

        p1.llenarPerro(nombre, edad, raza, sexo, peso);

        p1.mostrarPerro();

        Perro p2 = new Perro();

        System.out.println("Ingrese el nombre del perro");
        String nombre2 = scan.next();

        System.out.println("Ingrese la edad la perro");
        int edad2 = scan.nextInt();

        System.out.println("Ingrese la raza del perro");
        String raza2 = scan.next();

        System.out.println("Ingrese el sexo del perro");
        String sexo2 = scan.next();

        System.out.println("Ingrese el peso del perro");
        double peso2 = scan.nextDouble();

        p2.llenarPerro(nombre2, edad2, raza2, sexo2, peso2);

    }

}
