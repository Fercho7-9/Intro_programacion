package Trabajo_en_clases;

    import java.util.Scanner;

public class Switch_Area {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular Areas:\n");
        int area = teclado.nextInt();
        switch (area) {
            case 1:
                System.out.println("Ingresar base:\n");
                double b = teclado.nextInt();
                System.out.println("Ingresar altura:\n");
                double h = teclado.nextInt();
                double a = b * h /2;
                System.out.println("Area de un Triangulo es:\n"+a );
                break;
            case 2:
                System.out.println("Ingresar Radio:\n");
                double r = teclado.nextInt();
                double a2 = Math.PI * r * r;
                System.out.println("Area de un Circulo es:\n" + a2);
                break;
            case 3:
                System.out.println("Ingresar lado:\n");
                double l = teclado.nextInt();
                double a3 = l * l;
                System.out.println("Area de un Cuadrado es:\n" + a3);
            default:
                System.out.println("No Existe");
        }
        System.out.println("Fin del switch");
    }
}
