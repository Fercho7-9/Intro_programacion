package Class;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        boolean bandera;
        String opcion;
        Scanner entrada = new Scanner(System.in);
        bandera = true;
        while (bandera) { // bandera == true
            // con los datos ingresados se crea el objeto de tipo Vendedor
            System.out.println("NombreVend,#edad,#salario,#nautos,");
            Vendedor v = new Vendedor(entrada.next(), entrada.nextInt(), entrada.nextDouble(), entrada.nextInt());
            v.calcularPagoMensual();
            System.out.println(v);
            entrada.nextLine(); // limpieza del buffer
            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + "salir");
            opcion = entrada.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }
        }
    }
}