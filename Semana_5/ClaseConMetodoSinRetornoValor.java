import java.sql.SQLOutput;

public class ClaseConMetodoSinRetornoValor {
    public static void main(String[] args) {
        // Crear una variable a partir de nuestra classe
        //    ClaseConMetodoSinRetornoValor llamada = new ClaseConMetodoSinRetornoValor();
        //    llamada.saludar();
        //saludar("Juan");
        saludar("Juan",10);
    }
    public static void saludar(){
        System.out.println("Bienvenido a la Creacion de Metodos");
        System.out.println("Metodo creado en java");
    }
    public static void saludar(String nombre){

        System.out.println("Bienvenid@ "+nombre.toUpperCase()+ " a la Creacion de Metodos");
        System.out.println("Metodo creado en java");
    }
    public static void saludar(String nombre,String apellido){

        System.out.println("Bienvenid@ "+nombre.toUpperCase()+ " a la Creacion de Metodos");
        System.out.println("Metodo creado en java");
    }
    public static void saludar(String nombre,int edad){

        System.out.println("Bienvenid@ "+nombre.toUpperCase()+ " a la Creacion de Metodos");
        System.out.println("Edad es: "+ edad);
        System.out.println("Metodo creado en java");

    }

}
