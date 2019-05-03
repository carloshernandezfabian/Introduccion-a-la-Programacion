package mx.rafex.cursos.introduccion.clases.ejercicios;
import java.util.Scanner ;
   //Hacer calculadora para n numeros
public class Prin {
    public static void main(String[] lalla) {

    // Pedir entrada al usuario
    System.out.println("Dame un número");
    Scanner entrada = new Scanner(System.in);
    Double a = entrada.nextDouble();
	
    System.out.println("¿Que operacion va a realizar");
    Scanner entrada1 = new Scanner(System.in);
    char i = entrada1.nextChar();
    
    System.out.println("Dame un número");
    Scanner entrada2 = new Scanner(System.in);
    Double b = entrada2.nextDouble();
    if (entrada1 = "+" ) {
        System.out.println("La suma es: " + Operacion.suma(a,b));
        else if (entrada1 = "-")
        System.out.println("La resta es: " + Operacion.resta(a,b));

        
    	
    }
    
      
     System.out.println("El producto es: "+ Operacion.multiplicar (a,b) );
     System.out.println("La division es: " + Operacion.division(a,b));
     System.out.println("La potencia es: " + Operacion.exponencial(a, b.intValue()));
     System.out.println("La raiz es: " + Operacion.raiz (a,b) );
     System.out.println("La raiz cuadrada es: " + Operacion.raizCuadrada(a) );
     System.out.println("El IVA es: " + Operacion.calcularIva (a) );
    }
}
