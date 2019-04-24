package mx.rafex.cursos.introduccion.arreglos.alex;

import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {

        try (final Scanner entrada = new Scanner(System.in)) {

            System.out.println("Columnas");
            final int dimensionArreglo = entrada.nextInt();

            final int[] arregloNumeros = new int[dimensionArreglo];

            for (int indice = 0; indice < arregloNumeros.length; indice++) {
                System.out.println("En la posición [" + indice + "]");
                arregloNumeros[indice] = entrada.nextInt();
            }

            System.out.println("Mostrando valores ");
            for (int indice = 0; indice < arregloNumeros.length; indice++)
                System.out.println("Valor del arreglo en la posición [" + indice + "] : " + arregloNumeros[indice]);

            int sumaArreglo = 0;
            System.out.println(arregloNumeros.length);
            for (final int arregloNumero : arregloNumeros)
                sumaArreglo += arregloNumero;

            System.out.println("La suma es de: " + sumaArreglo);
        }

    }
}
