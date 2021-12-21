package atributovector;

public class Estudiante {

    private int notas[];

    public Estudiante(int[] notas) {
        this.notas = notas;
    }

    public Estudiante() {
        notas = new int[3]; // Le ponemos una dimension en 3 para que evitar 
        //errores de que se genere en null 
        //y porque la idea es que sean 3 notas
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public void ingresarNotas(int[] notas) {
        this.notas = notas;
    }

    public void mostrarNotas() {
        for (int i = 0; i < notas.length; i++) {

            System.out.println("[" + notas[i] + "]"); // Mostramos el vector

        }
    }
}
