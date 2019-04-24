package mx.rafex.cursos.introduccion.arreglos.andres;

public class Ejercicio1 {
    public static void main(String[] args) {

        final int[] arregloNumeros = new int[4];

        arregloNumeros[0] = 1;
        arregloNumeros[1] = 2;
        arregloNumeros[2] = 3;
        arregloNumeros[3] = 4;

        int sumaArreglo = 0;
        System.out.println(arregloNumeros.length);
        for (final int arregloNumero : arregloNumeros)
            sumaArreglo += arregloNumero;

        System.out.println("La suma es de: " + sumaArreglo);

    }
}