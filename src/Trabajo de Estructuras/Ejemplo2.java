import java.util.Scanner;
/**
 * @Eddy Fernando Ordonez
 * @Lenin Cuenca
 * @Jose David Caraguay
 */

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, m;
        boolean numeroCorrecto = false;
        do {
            System.out.println("----Piramide---");
            System.out.println("El numero de filas debe ser menor a de las colmunas");
            System.out.println("Ingrese el numero de filas(Número Impares)");
            n = teclado.nextInt();
            System.out.println("Ingrese el numero de columnas(Número Impares)");
            m = teclado.nextInt();
            if (n<m){
                if (n % 2 != 0 && m % 2 != 0) {
                    numeroCorrecto = true;
                } else {
                    System.out.println("Error Vuelva a digitir,Digite solo números impares");
                }
                System.out.println();
            }else {
                System.out.println("Error Vuelva a digitar número de fila menor a de columnas");
            }
        }while (!numeroCorrecto);
        mostrarPiramideAsteriscos(n,m);
    }
    public static void mostrarPiramideAsteriscos(int n,int m) {
        char matriz[][] = new char[n][m];
        int mitad  = matriz[0].length/2;
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[0].length; j++) {
                if ((i+j)>=mitad && (j-i)<=mitad){
                    matriz[i][j]='*';
                }else{
                    matriz[i][j]='-';
                }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}