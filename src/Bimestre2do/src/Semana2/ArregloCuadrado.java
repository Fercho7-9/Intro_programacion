package Trabajo;

public class ArregloCuadrado {
    public static void main(String[] args) {
        int numero [] = {2,3,5,7,9,11,13};
        int cuadrados[] = new int[numero.length];
        for (int indice = 0; indice < numero.length; indice++) {
            cuadrados[indice]= numero[indice]*numero[indice];
        }
        for (int indice = 0; indice <cuadrados.length ; indice++) {
            System.out.println(indice+1 + " su cuadrado son: "+ cuadrados[indice]);
        }
    }
}
