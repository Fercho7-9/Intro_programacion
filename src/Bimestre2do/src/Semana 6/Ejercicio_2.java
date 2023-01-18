import java.util.Scanner;

public class Ejercicio_2 {
    double hipotenusa;
    double C;

    /**
     * Para encontrar la hipotenusa
     * @param a
     * @param b
     */
    public void hip (double a, double b){
        C=(a*a)+(b*b);
        hipotenusa=hipotenusa*hipotenusa;
    }

    /**
     * Aqui se se ve que clase de triangulo nos da
     */
    public void Indentificar(){
        if (hipotenusa == C){
            System.out.println("Es un triangulo rectangulo");
        }else if(hipotenusa<C){
            System.out.println("Es un triangulo acutangulo");
        } else if (hipotenusa>C) {
            System.out.println("Es un triangulo obtusangulo");
        }
    }

    public void resultado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer cateto");
        double c1 = sc.nextDouble();
        System.out.println("Ingrese el segundo cateto");
        double c2 = sc.nextDouble();
        System.out.println("Ingrese la hipotenusa");
        hipotenusa = sc.nextDouble();
        hip(c1,c2);
        Indentificar();
    }
    public static void main(String[] args) {
        Ejercicio_2 var = new Ejercicio_2();
        var.resultado();
    }
}

