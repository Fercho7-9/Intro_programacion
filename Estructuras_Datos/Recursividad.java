import java.util.Scanner;

public class Recursividad {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int n = teclado.nextInt();
        System.out.println("El numero que ingreso "+n+" es "+ suma(n));
    }
    public static int suma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * suma(n - 1));
          }
        }
    }
