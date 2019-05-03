package mx.rafex.cursos.introduccion.clases.luis.otropaquete;

	

public class operaciones1{

	
		
		private int suma; 
        private int resta; 
        private int multiplicacion; 
        private int division;

        //variables
        private int numero1 = 45;
        private int numero2 = 2;
        
        
        
      //Constructors
        
        public operaciones1() {
        	suma = numero1+numero2;
        	resta = numero1-numero2;
        	multiplicacion = numero1*numero2;
        	division = numero1/numero2;
          
        	
      

        }







	  

      // Se hace la encapsulación
    // Metodo getter del atributo suma

    public int getSuma(){
        return suma; 

    }

    public int getResta(){
        return resta; 

    }

    public int getMultiplicacion(){
        return multiplicacion; 

    }
    
    public int getDivision(){
        return division; 
    }

// Metodo Setter de los atributos suma, resta, multiplicacion y division

    public int setSuma(int suma){
        return this.suma = suma; 
    }
    public int setResta(int resta){
        return this.resta = resta; 

    }

    public int setMultiplicacion(int multiplicacion){
        return this.multiplicacion = multiplicacion; 
    }

    public int setDivision(int division){
        return this.division = division; 
    }

}

