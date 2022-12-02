package Ejercicios_2do_Deber;
import java.util.Scanner;
public class Formula_General {
    public class VALORFORMULAGENERAL {
        public static void main(String[] args) {
            System.out.println("Programa para el Area de una Circunferencia:\n");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el Valor de a: ");
            double a = teclado.nextInt();
            System.out.println("Ingrese el Valor de b: ");
            double b = teclado.nextInt();
            System.out.println("Ingrese el Valor de c: ");
            double c = teclado.nextInt();
            double exp = 2;
            double p = Math.sqrt(Math.pow(b, exp) - 4 * a * c);
            double X1 = (-b+p) / (2*a);
            double X2 = (-b-p) / (2*a);
            System.out.println("Resultado del valor X1:\n"+ X1);
            System.out.println("Resultado del valor X2:\n"+ X2);
        }
    }
}
