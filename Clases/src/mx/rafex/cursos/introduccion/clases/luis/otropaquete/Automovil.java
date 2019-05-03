
package mx.rafex.cursos.introduccion.clases.luis.otropaquete;

public class Automovil { //Esta es una clase

	private String modelo; //Este es un metodo
	private String marca; 
	private String paisDeOrigen;
	private Boolean estaAsegurado; 
	private String color; 
	private Integer kilometraje;
	

	public Automovil() { //Este es el constructor por default
		modelo = "2014";
		
		}
		
		public Automovil() {
			marca = "Ford"; 
			
		}
	
	


public Automovil(String marca) {
	this.marca = marca;  
	
}

	// Se hace la encapsulacion
	// metodo getter del atrubuto Modelo
	public String getModelo() {
		return modelo;
		

	}

	public String getMarca(){
		return marca; 
		
	}
	
	public String getpaisDeOrigen(){
		return paisDeOrigen;
		
	}
	
	public Boolean getestaAsegurado() {
		return estaAsegurado; 
		
	}
	
	public String getColor() {
		return color;
		
	}
	
	public Integer getKilometraje() {
		return kilometraje; 
	}
	
		
	
	// Metodo setter del atributo Modelo
	public void setModelo(String modelo) {
		this.modelo = modelo;

	}
	
	public void setMarca(String marca) {
		this.marca = marca; 
	}
	
	public void setpaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen; 
	}
	
	public void setestaAsegurado(Boolean estaAsegurado) {
		this.estaAsegurado = true; 
	}
	
	public void setColor (String color) {
		this.color = color; 
		
	}
	
	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje; 
	}
	
	

}
