import java.util.Scanner;

public class EstructuraMatriz {
    public static void main(String[] args) {
        int numeros[][]= new int [3][2];
        int filas = numeros.length;
        int columnas = numeros[1].length;
        numeros[1][1]= 5;
        numeros[2][0]= 9;
        //Operacion escritura de una matriz
        Scanner teclado = new Scanner(System.in);
        for (int fila = 0; fila < filas ; fila++) {
            System.out.println("Fila: "+fila);
            for (int columna = 0; columna < columnas ; columna++) {
                System.out.println("Ingrese una edad para numeros["+filas+"]["+columnas+"]: ");
                int edad = teclado.nextInt();
                numeros [fila][columna] = edad;
            }
        }
    //operacion lectura de una matriz
        for (int fila = 0; fila < filas ; fila++) {
            for (int columna = 0; columna < columnas ; columna++) {
                System.out.print(numeros[fila][columna]+ "\t");
            }
            System.out.println("\n");
        }
    }
}