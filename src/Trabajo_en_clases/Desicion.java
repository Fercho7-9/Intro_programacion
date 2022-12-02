package Trabajo_en_clases;

import java.util.Scanner;

public class Desicion {
    /**
     * Programam para determinar si una persona es mayor o menor de edad
     */
        public static void main(String[] args) {
            System.out.println("Programa para determinar si una persona es mayor de edad");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese su edad");
            int edad = teclado.nextInt();
            if(edad >= 18 ) {
                System.out.println("Eres mayor de edad");
            }else{
                System.out.println("Eres menor de edad");
                System.out.println("Te falta madurar");
            }

        }
    }

