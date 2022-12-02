package Estructura_For;
    import java.util.Scanner;

public class Tabla_Multiplicacion {

/**
 * generar un tabla de multiplicar hasta el 10 de un numero ingresado por teclado
 */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un numero para las tablas");
        int numero= teclado.nextInt();
        boolean interruptor=true;
        for (int contador=10;contador>=0&&interruptor==true;contador--){
            int mult=numero*contador;
            System.out.println(numero+"x"+contador+"="+mult);
            if (contador==5)
                interruptor=false;
        }


    }
}