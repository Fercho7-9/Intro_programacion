import java.util.Scanner;

public class MatrizMultiplicacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las filas de la primera matriz que usted desea poner: ");
        int f1 = teclado.nextInt();
        System.out.println("Ingrese las columnas de la primera matriz que usted desea poner: \"");
        int c1= teclado.nextInt();
        System.out.println("Ingrese las filas de la segunda matriz que usted desea poner: \"");
        int f2 = teclado.nextInt();
        System.out.println("Ingrese las columnas de la segunda matriz que usted desea poner: \"");
        int c2= teclado.nextInt();
        int matriz1 [][]= new int[f1][c1];
        int matriz2[][]= new int[f2][c2];
        int matriz3[][]=new int[matriz1.length][matriz2[0].length];
        if (f1==c2 && c1==f2){
            System.out.println("Ingrese los datos de la primera matriz");
            for (int indice1 = 0; indice1 < matriz1.length; indice1++) {
                for (int indice2 = 0; indice2 < matriz1[0].length; indice2++) {
                    matriz1[indice1][indice2]= teclado.nextInt();
                }
            }
            System.out.println("Ingrese los datos de la segunda matriz");
            for (int indice1 = 0; indice1 < matriz2.length; indice1++) {
                for (int indice2 = 0; indice2 < matriz2[0].length; indice2++) {
                    matriz2[indice1][indice2]= teclado.nextInt();
                }
            }
            System.out.println("Primer Matriz");
            for (int indice = 0; indice < matriz1.length; indice++) {
                for (int indice2 = 0; indice2 < matriz1[0].length; indice2++) {
                    System.out.print(matriz1[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
            System.out.println("Segunda Matriz");
            System.out.println("\t");
            for (int indice = 0; indice < matriz2.length; indice++) {
                for (int indice2 = 0; indice2 < matriz2[0].length; indice2++) {
                    System.out.print(matriz2[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
            for (int fila = 0; fila < matriz1.length; fila++) {
                for (int columna = 0; columna < matriz2[0].length; columna++) {
                    for (int mov = 0; mov < matriz1[0].length; mov++) {
                        matriz3[fila][columna] =matriz3[fila][columna]+(matriz1[fila][mov] * matriz2[mov][columna]);
                    }
                }
            }
            System.out.println("\t");
            System.out.println("Tercer Matriz");
            for (int indice = 0; indice < matriz3.length; indice++) {
                for (int indice2 = 0; indice2 < matriz3[0].length; indice2++) {
                    System.out.print(matriz3[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
        }else{
            System.out.println("Imposible hacer la operacion");
        }
    }
}
