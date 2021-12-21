package clasesutilidad;

import java.util.Arrays;

public class ClaseArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int vector1[] = {1, 3, 2, 4, 12, 5, 6, 3};
        int vector2[] = {1, 3, 2, 4, 12, 5, 6, 3};

        int vectorVacio[] = new int[5];

        System.out.println("------------------------------------------------------");
        System.out.println("Equals: ");

        System.out.println("Los vectores son iguales: " + Arrays.equals(vector1, vector2));

        System.out.println("------------------------------------------------------");
        System.out.println("Fill: ");

        Arrays.fill(vectorVacio, 5);

        System.out.println("El arreglo vacio es igual a: " + Arrays.toString(vectorVacio));

        System.out.println("------------------------------------------------------");
        System.out.println("Sort: ");
        Arrays.sort(vector1);

        System.out.println("El arreglo ordenado queda: " + Arrays.toString(vector1));

        System.out.println("------------------------------------------------------");
        System.out.println("BinarySearch: ");
        
        System.out.println("El numero 5 se encuentra en la posicion: " + Arrays.binarySearch(vector2, 5));

    }

}
