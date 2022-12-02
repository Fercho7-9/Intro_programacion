package Trabajo_en_clases;

    import java.util.Scanner;

public class Dia_Semana {
        public static void main(String[] args) {
            System.out.println("Ingresar valor del 1 a 7");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n == 1)
                System.out.println("lunes");
            else if (n == 2)
                System.out.println("Martes");
            else if (n == 3)
                System.out.println("Miercoles");
            else if (n == 4)
                System.out.println("jueves");
            else if (n == 5)
                System.out.println("Viernes");
            else if (n == 6)
                System.out.println("Sabado");
            else if (n == 7)
                System.out.println("Domingo");

        }


    }


