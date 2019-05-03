// Este archivo jala informacion del archivo llamado "Operacion.java"
package mx.rafex.cursos.introduccion.clases.ejercicios.Luis30de04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] lalla) {

		// 1 Declaro Scanner
		final Scanner entrada = new Scanner(System.in);

		// 2 Declaro variables
		Double entraNumero;
		Double entraNumero2;
		Double entraOpcion;
		
		

		System.out.println("Ingresa un numero: ");
		entraNumero = entrada.nextDouble();

		System.out.println("Ingresa un segundo numero ");
		entraNumero2 = entrada.nextDouble();

		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");

		System.out.println("Ingresa el numero de la operacion deseada: ");
		entraOpcion = entrada.nextDouble();

		if (entraOpcion == 1) {
			System.out.println("La suma de los números es: " + Operacion.suma(entraNumero, entraNumero2)); 
			 
		}
		
		if (entraOpcion == 2);{
			
		System.out.println("La resta de los números es: " + Operacion.resta(entraNumero, entraNumero2)); 
		
		
		}
		
		if (entraOpcion == 3);{
			
		System.out.println("La Multiplicación de los números es: " + Operacion.multiplicar(entraNumero, entraNumero2));
		
		}
		
		if (entraOpcion == 4); {
			
			System.out.println("la division es"+ Operacion.division(entraNumero, entraNumero2)); 
		//dv = Operacion.division(entraNumero, entraNumero2); 
		//System.out.println(dv); 
		}
		
	
	}
}
