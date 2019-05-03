package mx.rafex.cursos.introduccion.clases.alex;
    //POJO Planed Objet Java
public class Carro {
		
	//Se construye el objeto al definir sus caracteristicas en atributos privados
		private String fabricante; 	//  Bentley	Honda 
		private String modelo;      //  
		private String tipo;        //   Deportivo, etc...
		private Integer kilometraje;  // Recorrido...

	// Crear getter (metodo de acceso) & setters(metodo de modificacion) de los atributos de clase
	public String getFabricante () {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		   //se declara y se asigna
		this.fabricante = fabricante;
	}
	
	public String getModelo () {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getTipo () {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Integer getKilometraje () {
		return kilometraje;
	}
	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	
}
