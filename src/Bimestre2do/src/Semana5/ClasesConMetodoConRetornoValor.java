import java.util.Scanner;

public class ClasesConMetodoConRetornoValor {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Progama para sumar dos numeros");
        System.out.println("Ingrese el 1er numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el 2do numero");
        int num2 = teclado.nextInt();
        int resultado =  sumar(num1,num2,6);//llamanos al metodo y recibimos el valor
        System.out.println("La suma es: "+resultado);

        //sumar_dos_numeros(num1,num2);
        //realizar el promedio de los numeros ingresados
        double promedio = obtener_promedio(resultado,2);
        System.out.println("El promedio de  los numeros es: "+promedio);
    }

    /**
     * Este metodo realiza la suma de dos numeros
     * @param n1
     * @param n2
     * @return
     */
    public static  int sumar(int n1,int n2){
        int resultado = n1 + n2;
        return resultado;
    }

    /**
     *
     * @param n1
     * @param n2
     * @param n2
     * @return
     */
    public static  int sumar(int n1,int n2,int n3){
        int resultado = n1 + n2 + n3;
        return resultado;
    }
    //public static void sumar_dos_numeros(int n1, int n2){
    //  int resultado = n1 + n2;
    //    System.out.println("La suma de los numeros es: "+resultado);
    //}

    /**
     * Metodo para obtener el promedio de una suma de valores
     * @param suma_total
     * @param cantidad_numeros
     * @return promedio
     */
    public static double obtener_promedio(int suma_total, int cantidad_numeros){
        double promedio =(double)suma_total/(double)cantidad_numeros;
        return promedio;
    }
}

