package mx.rafex.cursos.introduccion.clases.ejercicios;
import java.util.Scanner;

public class Abel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Declaro scanner
		Scanner entrada = new Scanner (System.in);
	
		//Declaro variables
		Double entranumero ; 
		Double entranumero2 ;
		
	System.out.println("Ingresa un numero:"); 
	entranumero = entrada.nextDouble()	;
	System.out.println(entranumero);
		
	System.out.println("Ingresa numero");
	entranumero2 = entrada.nextDouble();
	System.out.println(entranumero2);
	
	Double salida ;
	salida = entranumero + entranumero2 ;
	System.out.println(salida);
	
	Double salidaresta ;
	salidaresta = entranumero + entranumero2 ;
	System.out.println(salidaresta);
	
	
	}
	

}
