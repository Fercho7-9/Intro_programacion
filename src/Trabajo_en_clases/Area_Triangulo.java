package Trabajo_en_clases;

    import java.util.Scanner;

public class Area_Triangulo {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA CALCULAR EL AREA DE UN TRIANGULO");
        Scanner teclado = new Scanner(System.in);//variable para receptar valores desde el teclado
        System.out.println("Ingrrese la base: ");
        double base = teclado.nextInt();//leemos un valor desde el teclado
        System.out.println("Ingrrese la altrura: ");
        double altura = teclado.nextInt();//leemos un valor desde el teclado
        double Area = base * altura /2;
        double Resultado = Math.round(Area);
        System.out.println("El resultado de la suma es: "+ Area);
    }
}
