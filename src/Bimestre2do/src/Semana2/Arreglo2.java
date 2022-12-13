package Semana2;

import java.sql.SQLOutput;
public class Arreglo2 {
    public static void main(String[] args) {
        //creacion de arreglos, sin valores predefinidos
        String universidades[] =new String[5];
        System.out.println("Universidades: ");
        for (int indice = 0; indice < universidades.length; indice++) {
            System.out.println(universidades[indice]+"\t");
        }
        System.out.println("\n");
        int notas[] =  new  int[4];
        System.out.println("Arreglo de notas: ");
        for (int indice = 0; indice < notas.length ; indice++) {
            System.out.println(notas[indice]+"\t");
        }
        System.out.println("\n");
        boolean valores[] = new boolean[10];
        System.out.println("Arreglo de bollean: ");
        for (int indice = 0; indice < valores.length ; indice++) {
            System.out.println(notas[indice]+"\t");
        }
        //creacion de un arreglo cuando en un inicio no conocemos su tamaño
        String nombres[]; //declaracion de un arreglo nombres
        nombres = new String[10];
    }
}
