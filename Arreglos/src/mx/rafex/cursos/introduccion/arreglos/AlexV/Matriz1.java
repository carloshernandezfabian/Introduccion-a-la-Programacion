package mx.rafex.cursos.introduccion.arreglos.AlexV;

import java.util.Scanner;

public class Matriz1 {
	
	 public static void main(String[] args) {

		 try (final Scanner entrada = new Scanner(System.in)) {
                
	            System.out.println("Columnas");
	            final int dimensionArreglo = entrada.nextInt();

	            final int[] arregloNum = new int[dimensionArreglo];
	            	
	            for (int indice = 0; indice < arregloNum.length; indice++) {
	                System.out.println("En la posición [" + indice + "]");
	                arregloNum[indice] = entrada.nextInt();
	            }

	            System.out.println("Mostrando valores ");
	            for (int indice = 0; indice < arregloNum.length; indice++)
	                System.out.println("Valor del arreglo en la posición [" + indice + "] : "
	                        + arregloNum[indice]);
	            
	             int sumaArreglo = 0;
	             System.out.println(arregloNum.length);
	             for (final int arregloNumero : arregloNum)
	                 sumaArreglo += arregloNumero;

	             System.out.println("La suma es de: " + sumaArreglo);
	        }
	
	 }
}
