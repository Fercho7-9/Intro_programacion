import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Archivo {
    public static void main(String[] args) {
        try{
            File file = new File("data/Borrador.txt");
            //File file = new File ("C:\Users\ASUS\IP2022_Agila_Jhordy\Trabajos\Clase2\data");
            if(file.createNewFile()){
                System.out.println("Archivo creado:" + file.getName());
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch(IOException e){
            System.out.println("Error");
        }
        //Escribir en un archivo usando Write
        //true para agregar al final del archivo
        try(FileOutputStream steam = new FileOutputStream("C:\\Users\\UTPL\\Ed\\hola2",true)){
            String data = "Esto es un ejemplo de Stream con bytes";
            byte b[]=data.getBytes();
            steam.write(b);
            steam.flush();
            steam.close();
            System.out.printf("Se a escrito el archivo");
        }catch (IOException e){
            System.out.printf("Error de escritura");
        }
    try{
        FileInputStream steam = new FileInputStream("C:\\Users\\UTPL\\Ed\\hola2");
        int i;
        while ((i=steam.read())!=-1);
        System.out.print((char) i);

    }catch (IOException e){
        System.out.printf("Erro de lectura");
        }
    }
}


