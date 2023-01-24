import java.util.Scanner;

public class Sistemas_ecuaciones {
    public static void main(String[] args) {
        /**
         * ejem
         * ax+by=c
         * 5x-4y= 2
         * 6x-y = 3
         */
        Scanner tecladp = new Scanner(System.in);

        int numero [][] = {
                {3,2,4},
                {5,-4,6},
        };


        int cambio[][]=new int[2][1];
        for (int indice = 0; indice < 2; indice++) {
            for (int indice2 = 0; indice2 < 1; indice2++) {
                cambio[indice][indice2]=numero[indice][indice2];
                System.out.println(cambio[indice][indice2]);
            }
        }

        for (int in = 0; in < 2; in++) {
            for (int indice = 0; indice < numero.length; indice++) {
                for (int indice2 = 0; indice2 < numero[0].length; indice2++) {
                    numero[indice][indice2]=numero[indice][indice2]*cambio[in][0];
                }
            }
        }
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[0].length; j++) {
                System.out.println(numero[i][j]);
            }
        }
        }

    }

