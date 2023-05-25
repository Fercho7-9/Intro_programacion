
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class PrbandoFileCaracteres {
    public static void main(String[] args) throws FileNotFoundException {
            Formatter salida = new Formatter("User.csv");//Flujo de salida desde el . java hacia el archivo
        for (int i = 0; i <10 ; i++){
            salida.format("%s%d;%d;%d\n ","Estudiante",(i+1),((int)(Math.random()*10)+1),((int)(Math.random()*10)+1));
        }
            salida.close();
            Formatter salidanotas = new Formatter("Promedios.csv");
            Scanner teclado = new Scanner(new File("User.csv"));//Flujo de entrada desde el archivo hacia el programa
            for (int i = 0; i <10 ; i++){
                String linea = teclado.nextLine();
                String datos[]=linea.split(";");
                double nota1 = Double.parseDouble(datos[1]);
                double nota2 = Double.parseDouble(datos[2]);
                System.out.printf(datos[0]+" "+nota1+" "+nota2);
                salidanotas.format("%s;%.2f;%.2f;%.2f\n",datos[0],nota1,nota2,((nota1+nota2)/2));
            }
            salida.close();
            salidanotas.close();
        }
    }
