package mx.rafex.cursos.introduccion.clases.luis.otropaquete;

public class Principal{

    public static void main(String[] args) {
        
        // aqui empiezo creando el bojeto que crea la clase
        final operaciones1 Principal = new operaciones1();
        
        

        // Se manda a llamar a los metodos de mi objeto debido a 
        // que se encuentran como clase privada       
               
        
        System.out.println(Principal.getSuma());
        System.out.println(Principal.getResta());
        System.out.println(Principal.getMultiplicacion());
        System.out.println(Principal.getDivision());

    }
}
