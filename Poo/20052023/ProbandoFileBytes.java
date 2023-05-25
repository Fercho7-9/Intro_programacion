
import java.io.*;

public class ProbandoFileBytes {
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{
        //Estudiante est1 = new Estudiante(("Est1",10,5);
        //Estudiante est2 = new Estudiante(("Est1",10,5);
        //Estudiante est[]={est1,est2};

        //Estudiante estudiantes[]={new Estudiante("Eddy",10,5), new Estudiante("Fabian",10,5)};
        Estudiante arrestudiante[]=new Estudiante[10];
        for (int i = 0; i <10; i++) {
            Estudiante estx = new Estudiante("Estudiante"+(i),((int)(Math.random()*10)+1),((int)(Math.random()*10)+1));
            arrestudiante [i]=estx;
        }
        //flujo basado en Bytes para SALIDA dese el programa hacia el archivo
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Bytes.bit"));
        for (int i = 0; i < 10; i++) {
            salida.writeObject(arrestudiante[i]);
        }
        salida.close();
        //FLujo basdao en Bytes para ENTRADA desde el archivo, hacia el programa
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Bytes.bit"));
        for (int i = 0; i <10 ; i++) {
            System.out.println((Estudiante)entrada.readObject());
        }
        //Estudiante est1 = (Estudiante) entrada.readObject();
        //System.out.println(est1);
        //Estudiante est2 = (Estudiante) entrada.readObject();
        //System.out.println(est2);
    }
}
class Estudiante implements Serializable{
    private  String nombre;
    private  double notas1, notas2;

    public Estudiante(String nombre, double notas1, double notas2) {
        this.nombre = nombre;
        this.notas1 = notas1;
        this.notas2 = notas2;
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", notas1=" + notas1 +
                ", notas2=" + notas2 +
                '}';
    }
}
