/**
 * Programa para calcular el promedio de los elementos de una matriz dada.
 */
public class PromedioMatriz {
    public static void main(String[] args) {
        int numeros [][] = {
                {5,6},
                {2,7},
                {7,1},
                {3,4},
        };
        int sumat =0;
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col <numeros[0].length ; col++) {
                //sumat = sumat + numeros[fila][col];
                sumat += numeros[fila][col];
            }
        }
        int nro_ele =  numeros.length * numeros[0].length;
        double promedio = (double) sumat/nro_ele;
        System.out.println("Suma Total de la Matriz es: "+sumat);
        System.out.println("Promedio: "+promedio);
    }
}
