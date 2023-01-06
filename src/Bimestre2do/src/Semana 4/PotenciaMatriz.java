import java.util.Scanner;

/**
     * Programa para elevar a una potencia dada los elementos de la matriz
     */
    public class PotenciaMatriz {
    public static void main(String[] args) {
        int numero [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };//Dimesion de la matriz 3x3
        int filas = numero.length;
        int colus = numero[0].length;
        int mat_potecia[][] = new int[filas][colus];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la potencia: ");
        int potencia = teclado.nextInt();
        for (int fila = 0; fila < numero.length; fila++) {
            for (int col = 0; col <numero[0].length ; col++) {
                mat_potecia[fila][col]= (int) Math.pow(numero[fila][col], potencia);
                System.out.print(mat_potecia[fila][col]+"\t");
            }
            System.out.println("\n");
        }
    }
}