package Trabajo_en_clases;

public class Libreria_Math {
    public static void main(String[] args) {
        int numero = 9;
        //funcion para calcular la raiz cuadrada de un numero
        System.out.println("Calculo de la raiz cuadrada: ");
        double raiz = Math.sqrt(numero);
        System.out.println("El resultado de la raiz es: " + raiz);
        //funcion para calcular la pontencia de un numero
        System.out.println("Claculo de la potencia de un numero");
        double exp = 2;
        double potencia = Math.pow(numero, exp);
        System.out.println("El resultado del numero elevado a cubo es : "+ potencia);

        int a=1;
        int b=2;
        double c;
        c= Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
