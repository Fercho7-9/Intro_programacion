package Ejercicios_2do_Deber;

import java.util.Scanner;

public class Area_de_un_Triangulo {
    public class AREACIRCUNFERENCIA {
        public static void main(String[] args) {
            System.out.println("Programa para el Area de una Circunferencia:\n");
            Scanner teclado = new Scanner(System.in);
            double pi = 3.1416;
            System.out.println("Ingrese el Valor del Radio: ");
            double exp = 2;
            double radio = teclado.nextInt();
            double area = pi* Math.pow(radio, exp);
            System.out.println("El resultado del Area de una Circunferencia:\n"+ area);
        }
    }
}
