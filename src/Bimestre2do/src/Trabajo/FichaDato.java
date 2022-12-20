import java.util.Locale;
import java.util.Scanner;

public class FichaDato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean interruptor = true;
        String nombres[] = new String[100];
        String uni[] = new String[100];
        int edad[] = new int[100];
        int indice = 0;
        while (interruptor){
                System.out.println("Ingrese datos del Estudiante");
                  System.out.println("Ingrese nombre: ");
                  nombres[indice]= teclado.nextLine();
                  System.out.println("Ingrese edad: " );
                  edad[indice] = teclado.nextInt();
                  teclado.nextLine();//Para leer el enter despues de la int.edad
                  System.out.println("Ingrese universidad: ");
                  uni[indice] = teclado.nextLine();
                  indice++;
                  System.out.println("Desea ingresea un nuevo estdudiante si/no?");
                  String resp = teclado.nextLine().toLowerCase();//en minuscilas
                  if(resp.equals ("no")){
                      interruptor = false; //finalizamos ciclo while
                  }
            }
        System.out.println("Ordenar arreglo por edad");
        for (int indice2 = 1; indice2 <= edad.length-1 ; indice2++) {
            for (int elemento = 0; elemento <= edad.length-2 ; elemento++) {
                if (edad[elemento]>edad[elemento+1]){
                    int aux = edad[elemento];
                    edad[elemento]= edad[elemento+1];
                    edad[elemento]= aux;
                    //Proceso de intercambio en arreglo nombres
                    String aux_n = nombres[elemento];
                    nombres[elemento]= nombres[elemento+1];
                    nombres[elemento]= aux_n;
                    //arreglo de intercambio de arreglo uni
                    String aux_u = uni[elemento];
                    uni[elemento]= uni[elemento+1];
                    uni[elemento]= aux_u;
                }
            }
        }
        //Presentar datos de los estudiantes
        for (int pos = 0; pos < nombres.length; pos++) {
            if (nombres[pos] != null){
            System.out.println("Nombres: "+nombres[pos]);
            System.out.println("Edad: "+edad[pos]);
            System.out.println("Universidad: "+uni[pos]);
            }
        }
    }
}