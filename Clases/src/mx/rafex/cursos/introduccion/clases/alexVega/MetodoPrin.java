package mx.rafex.cursos.introduccion.clases.alexVega;

import mx.rafex.cursos.introduccion.clases.alex.Carro;
  //Guardar cambios antes de trabajar con archivo en referencias
public class MetodoPrin {
 public static void main (String [] args) {
	 final Carro auto = new Carro (); //Declaracion
	 
	 auto.setFabricante("Alfa Romeo");
	 auto.setTipo("Automatico");
	 auto.setModelo("Giulia");
	 auto.setKilometraje(0);
	 					// Concatenar la salida y disminuir el numero de lineas
	 	// Con parentesis es acceso a metodos, sin parentesis es acceso a atributos
	 System.out.println("Este auto ha sido diseñado por: " + auto.getFabricante());
	 System.out.println("El modelo que seleccionaste es: " + auto.getModelo());
	 System.out.println("Es de tipo: " + auto.getTipo());
	 System.out.println("Y ha recorrido un total de: " + auto.getKilometraje() + " km");

 }
}
