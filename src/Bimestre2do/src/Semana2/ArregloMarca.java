package Semana2;

import java.util.Scanner;

/**
 * Progrmaa que solicite el nombre de n° de marcas de vihiculos y las almacenen en un arreglo}
 * finalmente el programa debe mostrar el nombre de las marcas almacenadas en el arreglo.
 */

public class ArregloMarca {
    public static void main(String[] args) {
        String marcas [];
        System.out.println("¿Cuantas marcas de vihiculos va a ingresar:?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();
        marcas = new String[n];//creamos el arreglo con n elementos
        //OPERACION ESCRITURA DEL ARREGLO
        for (int indice = 0; indice <n; indice++) {
            System.out.println("Ingrese el nombre de la marca "+ (indice+1)+":");
            String marca = teclado.nextLine();
            marcas[indice]= marca.toUpperCase();
        }
        //OPERACION LECTURA DE UN ARREGLO
        System.out.println("Lista de Marcas Ingresadas");
        for (int indice = 0; indice < n ; indice++) {
            System.out.println(marcas[indice]+"\t");
        }
        //OPERACION DE BUSQUEDA
        System.out.println("¿Que nombre de marca desea buscar: ?");
        //toUppercase() que convierte un texto en mayusculas
        String marca_busqueda = teclado.nextLine().toUpperCase();
        System.out.println("Marca busqueda; "+marca_busqueda);
        for (int indice = 0; indice < n ; indice++){
            if (marca_busqueda.equals( marcas[indice].toUpperCase() ) ){
                System.out.println("Marca encontrada");
                System.out.println("Se encutra el puesto "+indice);
                break;
            }
        }
    }
}
