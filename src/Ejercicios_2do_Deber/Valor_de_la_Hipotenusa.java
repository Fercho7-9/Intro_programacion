package Ejercicios_2do_Deber;

import java.util.Scanner;

public class Valor_de_la_Hipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor del Cateto a:");
        double a = teclado.nextInt();
        System.out.println("Valor del Cateto b:");
        double b = teclado.nextInt();
        double exp = 2;
        double c = Math.sqrt(Math.pow(a, exp) + Math.pow(b, exp));
        System.out.println("Resultado de la Hipotenusa:\n"+ c);
    }
}

