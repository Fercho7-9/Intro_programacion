package Trabajo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println("Ingrese la palabra: ");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.nextLine().toLowerCase();
        int tam_palabra = palabra.length();
        System.out.println("tam_palabra = "+ tam_palabra);
        char palabra_arr[] = new char[tam_palabra];
        for (int indice = 0; indice <tam_palabra ; indice++) {
            palabra_arr[indice]= palabra.charAt(indice);
        }
        //lectira del arreglo de derecha a izquieda
        String palabra_invertida = "";
        for (int indice = tam_palabra-1; indice >= 0 ; indice--) {
            palabra_invertida = palabra_invertida+palabra_arr[indice];
        }
        //determinamos is es palindomo o no
        if (palabra.equals(palabra_invertida)){
            System.out.println("Si es palabra palindromo ♥♥♥Iloveyou♥♥♥");
        }
        else {
            System.out.println("No es palabra palindromo");
        }
        System.out.println("♥");
        //pasamos los carcteres de palbra al arreglo palabras_arr


        //for (int indice = 0; indice < tam_palabra; indice++) {
        //    System.out.println(palabra_arr[indice]);
        //}
    }
}

