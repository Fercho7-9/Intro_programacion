import java.util.Scanner;

public class Area_Figura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para obeter el Area de figuras geometricas");
        System.out.println("Digite 1 para obtener el area de una circunferencia");
        System.out.println("Digite 2 para obtener el area de una rectangulo");
        System.out.println("Digite 3 para obtener el area de un cuadrado");
        System.out.println("Digite 4 para obtener el area de un cinlindro");
        int opcion = teclado.nextInt();
        seleccionar_figura(opcion);
    }
    public static void seleccionar_figura (int opcion){
        Scanner teclado = new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println("Ingrese el valor del radio: ");
                double radio = teclado.nextInt();
                double area = Resultado_de_Area_Circulo(radio);
                System.out.println("El area es: "+area);
                break;
        }

    }
    /**
     * Metodo para obtere el area de una circunferencia
     * @param radio
     * @return
     */
    public double Resultado_de_Area_Circulo (double radio){
        double area = Math.PI * Math.pow(radio,2);
        return area ;
    }

    /**
     * Metodo para obtener el area de un cuadrado
     * @param lado
     * @return
     */
    public double Resultado_Cuadrado (double lado){
        double area = lado * lado;
        return area;
    }
    public double Resultado_Cilinddro (double h,double radio){
        double area = (2 * radio * h) + (2 *Math.PI*Math.pow(radio,2)) ;
        return area;
    }
}