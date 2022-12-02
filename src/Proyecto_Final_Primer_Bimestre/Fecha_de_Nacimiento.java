package Proyecto_Final_Primer_Bimestre;

import java.util.Scanner;

public class Fecha_de_Nacimiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese sus datos de nacimiento\n");
        System.out.println("Ingrese año de nacimiento: ");
        int ano_na = teclado.nextInt();
        System.out.println("Ingrese mes de nacimiento: ");
        int mes_na = teclado.nextInt();
        System.out.println("Ingrese dia de nacimiento: ");
        int dia_na = teclado.nextInt();
        System.out.println("Ingrese los datos actuales\n");
        System.out.println("Ingrese año actual: ");
        int ano_ac = teclado.nextInt();
        System.out.println("Ingrese mes actual: ");
        int mes_ac = teclado.nextInt();
        System.out.println("Ingrese dia actual: ");
        int dia_ac = teclado.nextInt();
        int edad = ano_ac - ano_na;
        int edadmes = mes_ac - mes_na;
        int edaddia = dia_ac - dia_na;

        if ( dia_na > dia_ac){
            edaddia = edaddia +30;
        }
        if (mes_ac > mes_na) {
            edadmes = edadmes - 1;
        }
        if (mes_ac == mes_na){
            if (dia_ac==dia_na)
                System.out.println("Felicidades Hoy es tu cumpleaños " +nombre);
        }
        if (ano_ac % 4 == 0 && ano_ac % 100 != 0 || ano_ac % 400 !=0){
            edaddia = edaddia +1;
        }
        int dias_ano = edad * 365;
        int dias_mes = edadmes * 31;
        int dias = dias_ano+dias_mes+edaddia;
        int horas = dias * 24;
        System.out.println(nombre +" tiene:");
        System.out.println("Tu edad actual es: "+ edad + "años+" +edadmes+ "mes+" +edaddia+ "dias");
        System.out.println("Lo que equivale en dias: " +dias+ " Dias");
        System.out.println("Lo que equivale en horas: " +horas+ " Horas");
    }
}
