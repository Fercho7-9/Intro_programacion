import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcepcion {
        //Creacion de variables
    double n1;
    double n2;
    public static void main(String[] args) {
        ManejoExcepcion mivar= new ManejoExcepcion();
        mivar.ejecutar();
    }
    public void ejecutar (){
        ingresear_datos();
        System.out.println("Resultado = " + dividir() );
    }
    public void  ingresear_datos(){
        //el bloque try nos ayuda a captar o detectar si ocurre la excepcion
        try{//este codio tiuene la posibilidad de presentar una excepcion
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numerardor: ");
        n1 = teclado.nextDouble();
        System.out.println("Ingrese el denominador: ");
        n2 = teclado.nextDouble();
        }catch (InputMismatchException error_de_teclado){
            System.out.println("Manejo de la excepcion con catch");
            System.out.println(error_de_teclado.getMessage());
        }catch (ArithmeticException error){
        System.out.println("Manejo de la excepcion de tipo aritmetica");
            System.out.println(error.getMessage());
        }
    }
    public double dividir (){
        double resultado = 0 ;
        try {
            //codigo en el que posiblemente puede ocurrir una excepcion
        resultado = n1/n2;
        return resultado;
        }catch (Exception error){
            //este codiog se ejecuta solo si ocurre una excepcion
            System.out.println("Error de tipo aritmetica");
            System.out.println(error.getMessage());
        return resultado;
       }
    }
}
