package Trabajo_en_clases;

    import java.util.Scanner;
public class Operadores {public static void main(String[] args) {
    //uso de tipos de datos en java
    String nombre_estudiante = "Hugo Paz";
    int edad = 18;
    boolean valor = true;
    System.out.println("valor de variable nombre_estudiante= "+nombre_estudiante);
    System.out.println("valor de variable edad= "+edad);
    System.out.println("vallor de variable valor= "+valor);
    //USO DE LOS OPERADORES ARITMETICOS
    System.out.println("USO DE LOS OPERADORES ARITMETICOS");
    Scanner teclado = new Scanner(System.in);//variable para receptar valores desde el teclado
    System.out.println("Ingrese el primer numero: ");
    int numero1 = teclado.nextInt();
    System.out.println("Ingrese el segundo numero ");
    int numero2 = teclado.nextInt();
    System.out.println("numero1= "+ numero1);
    System.out.println("numero2= "+ numero2);
    System.out.println("OPERACION SUMA");
    int suma = numero1 + numero2;
    System.out.println("El resultado de la suma es: "+ suma);
    System.out.println("OPERACION RESTA");
    System.out.println("Resultado de la resta: "+ (numero1 - numero2) );
    System.out.println("OPERACION MULTIPLICACION");
    System.out.println("Resultado de la multiplicacion: "+ (numero1 * numero2) );
    System.out.println("OPERACION DIVISION");
    System.out.println("Resultado de la division: "+ (numero1 / numero2) );
    System.out.println("OPERACION RESIVO");
    System.out.println("Resultado de la resivo: "+ (numero1 % numero2) );
    System.out.println("Ingrese tus nombres completos");
    teclado.next();
    String nombres_completos = teclado.nextLine();
    System.out.println("Nombre Ingresado: "+nombres_completos);

    }
}
