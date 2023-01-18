import java.util.Scanner;

public class Ejercicio_3 {
public class Main {
    public static void main(String[] args) {
        int[][] cedulas = new int[1][5];
        Scanner sc = new Scanner(System.in);
        /**
         * Ingreso de cédulas
          */
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese cédula " + (i + 1) + ": ");
            cedulas[0][i] = sc.nextInt();
        }
        /**
         * Validacion de cédulas
         */
        for (int i = 0; i < 5; i++) {
            if (validarCedula(cedulas[0][i])) {
                System.out.println("La cédula " + cedulas[0][i] + " es válida.");
            } else {
                System.out.println("La cédula " + cedulas[0][i] + " no es válida.");
            }
        }
    }
    public static boolean validarCedula(int cedula) {
        // Lógica para validar cédula
        return true; // reemplazar con la lógica de validación
        }
    }
}