package mx.rafex.cursos.introduccion.clases.luis;

import mx.rafex.cursos.introduccion.clases.luis.otropaquete.Automovil;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear un objeto que crea la clase automovil
		final Automovil autoPrincipal = new Automovil(); 
		 
		
		// Se manda a llamar a los Metodos de mi objeto debido a que 
		// Se encuentran como clase privada. 
		
		autoPrincipal.setModelo("Modelo1");
		autoPrincipal.setMarca("Peugeot"); 
		autoPrincipal.setpaisDeOrigen("Europa"); 
		autoPrincipal.setestaAsegurado(true);
		autoPrincipal.setColor("color"); 
		autoPrincipal.setKilometraje(123456);
		
		System.out.println(autoPrincipal.getModelo());
		System.out.println(autoPrincipal.getMarca());
		System.out.println(autoPrincipal.getpaisDeOrigen());
		System.out.println(autoPrincipal.getestaAsegurado()); 
		System.out.println(autoPrincipal.getColor());
		System.out.println(autoPrincipal.getKilometraje());
		
		
		if (autoPrincipal.getestaAsegurado() != true) {
			System.out.println("No Esta Asegurado");
	
			}
		}
	
			
		}

