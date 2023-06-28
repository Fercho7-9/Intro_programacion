package Estruturas2;
/**
 *
 * @author Lenin Cuenca-Eddy Ordoñez-Jose Caraguay
 */
import java.util.Scanner;
class Nodo {
    int ticket;
    String cedula;
    Nodo next;
    public Nodo(int ticket, String cedula) {
        this.ticket = ticket;
        this.cedula = cedula;
        this.next = null;
    }
}
class ListaEnlazada {
    Nodo cabeza;
    int contador;
    int conAten;

    public ListaEnlazada() {
        this.cabeza = null;
        this.contador = 0;
    }
    public void agregar(int ticket, String cedula) {
        Nodo nuevoNodo = new Nodo(ticket, cedula);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = nuevoNodo;
        }
        contador++;
    }
    public void atender() {
        if (cabeza != null) {
            Nodo eliminado = cabeza;
            cabeza = cabeza.next;
            eliminado.next = null;
            conAten++;
            System.out.println("Alumno atendido: " + eliminado.cedula);
        } else {
            System.out.println("No hay alumnos en la lista.");
        }
    }
    public void mostrarCedulas() {
        int num = 1;
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(num + ") " + actual.cedula);
            actual = actual.next;
            num++;
        }
    }
    public int obtenerAlumnosAtendidos() {
        return conAten;
    }
}
public class Grupal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Agregar alumno");
            System.out.println("2. Atender alumno");
            System.out.println("3. Mostrar cédulas de alumnos en espera");
            System.out.println("4. Mostrar cantidad de alumnos atendidos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de ticket: ");
                    int ticket = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingrese el número de cédula: ");
                    String cedula = teclado.nextLine();
                    lista.agregar(ticket, cedula);
                    break;
                case 2:
                    lista.atender();
                    break;
                case 3:
                    System.out.println("Cédulas de alumnos en espera:");
                    lista.mostrarCedulas();
                    break;
                case 4:
                    System.out.println("Cantidad de alumnos atendidos: " + lista.obtenerAlumnosAtendidos());
                    break;
                case 5:
                    System.out.println("Gracias por preferirnos (:");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            System.out.println();
        }
        teclado.close();
    }
}