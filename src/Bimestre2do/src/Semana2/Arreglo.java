package Semana2;

import jdk.swing.interop.SwingInterOpUtils;

public class Arreglo {
    public static void main(String[] args) {
        //operacion de arreglos con valeres predefinidos
        String universidades [] = {"utpl","unl","espol","ucuenca","usfg","ulde"};
        int tam = universidades.length;//obtenemos el tamaño del arreglo
        System.out.println("Tamano del arreglo:"+ tam);
        for (int indice =0; indice <  tam; indice++) {
            System.out.print(universidades[indice]+"\t");
        }
        System.out.println("\n");
        //creacion de un arreglo de tipo entero
        int notas[] = {7,8,5,4,10};
        for (int indice = 0; indice <notas.length; indice++) {
            System.out.print(notas[indice]+"\t");
        }
        System.out.println("\n");
        //creacion de u narreglo de tipo char
        char vocal[] ={'a','b','i','o','u'};
        for (int indice = 0; indice <vocal.length ; indice++) {
            System.out.print(vocal[indice]+"\t");
        }
        System.out.println("\n");
        //creacion de ua arreglo de tipo bollean
        boolean valores []= {true,false,false,true};
        for (int indice = 0; indice <valores.length ; indice++) {
            System.out.print(valores[indice]+"\n");
        }
        //crecion de un arreglo de tipo decimal
        double numeros[] = {1.0,2.5,3.1};
        for (int indice = 0; indice <numeros.length ; indice++) {
            System.out.print(numeros[indice]+"\t");

         }
    }
}