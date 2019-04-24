
package mx.rafex.cursos.introduccion.arreglos.Luis;

import java.util.Scanner;

/**
 * @author rafex
 */
public class EjercicioUno {

    public static void main(String[] args) {

        try (final Scanner entrada = new Scanner(System.in)) {

            System.out.println("Insertar la dimensión del arreglo");
            final int dimensionArreglo = entrada.nextInt();

            final int[] arregloNumeros = new int[dimensionArreglo];

            for (int indice = 0; indice < arregloNumeros.length; indice++) {
                System.out.println("Insertar número en la posición [" + indice + "]");
                arregloNumeros[indice] = entrada.nextInt();
            }

            System.out.println("Mostrando valores del arreglo");
            for (int indice = 0; indice < arregloNumeros.length; indice++)
                System.out.println("Valor del arreglo 'arregloNumeros' en la posición [" + indice + "] : "
                        + arregloNumeros[indice]);
            
            int numero = arregloNumeros; 
            
            while(arregloNumeros <= numero){
                
                if(arregloNumeros + numero){
                     
                
             
          
          System.out.println ("El resultado de la suma es : " + numero);
          
                }
                
            }
    }
}
            

    }

}
