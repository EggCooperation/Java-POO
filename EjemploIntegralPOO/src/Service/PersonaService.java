
package Service;

import Entidades.Persona;
import java.util.Scanner;


public class PersonaService {
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona(){
        //INSTANCIAR UN OBJETO DE TIPO PERSONA
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el peso");
        p1.setPeso(leer.nextDouble());
        return p1;
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println("El nombre es: " + p1.getNombre());
    }
    
    
}
