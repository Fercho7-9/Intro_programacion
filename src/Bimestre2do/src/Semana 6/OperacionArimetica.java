import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Programa para crear métodos para realizar operaciones arítmeticas
 */
    //Creacion de variables globales


public class OperacionArimetica {
    int n1;
    int n2;

    /**
     * Metodo para realizar la suma de dos números enteros
     * @param n1
     * @param n2
     * @return n1+n2
     */
    public int sumar(int n1,int n2){
        return (n1+n2);
    }

    /**
     * Metodo para realizar la resta de dos números enteros
     * @param n1
     * @param n2
     * @return n1-n2
     */
    public int restar(int n1,int n2){
        return (n1-n2);
    }

    /**
     * Metodo para realizar la multiplicacion de dos números enteros. No retorna valor
     * @param n1
     * @param n2
     */
    public void multiplicar (int n1,int n2){
        System.out.println("La multiplicacion es: "+ (n1*n2));
    }
    public void dividir (){
        if (n2>0){
            System.out.println("Division por cero no existe"+((double)n1/(double)n2));
        }else{
            System.out.println("Division por cero no existe"+((double)n1/(double)n2));
        }
    }
    public void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        while(interruptor){
            System.out.println("Digíte 0 para salir: ");
            System.out.println("Digíte 1 para sumar dos numeros: ");
            System.out.println("Digíte 2 para restar dos numeros: ");
            System.out.println("Digíte 3 para multipiclar dos numeros: ");
            System.out.println("Digíte 4 para dividir dos numeros: ");
            int opcion = teclado.nextInt();

            switch (opcion){
                case 0:
                    interruptor = false;
                    System.out.println("SALIR");
                    break;
                case 1:
                    ingresar_numeros();
                    System.out.println("La suma es: "+sumar(n1,n2));
                    break;
                case 2:
                    ingresar_numeros();
                    System.out.println("La resta es: "+restar(n1,n2));
                    break;
                case 3:
                    ingresar_numeros();
                    multiplicar(n1,n2);
                    break;
                case 4:
                    ingresar_numeros();
                    dividir();
                    break;
                default:
                    System.out.println("OPCION INVALIDA");

            }
        }
    }
    public void ingresar_numeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el 1er numero: ");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el 2do numero: ");
        n2 = teclado.nextInt();
    }

    public static void main(String[] args) {
        OperacionArimetica mivariable = new OperacionArimetica();
        mivariable.ejecutar();
    }
}
