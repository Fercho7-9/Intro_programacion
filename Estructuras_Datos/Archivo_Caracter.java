import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Archivo_Caracter {
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
            try(FileWriter myWriter = new FileWriter("C:\\Users\\UTPL\\Ed\\hola",true)){


                myWriter.write("Ejemplo de escritura usando Write\n");
                myWriter.close();
                System.out.println("El archivo ha sido escrito");

            }catch(IOException e){

                System.out.println("Error de escritura");

            }

            //Leer el archivo

            System.out.println("Leemos el archivo");

            try(FileReader myReader = new FileReader("C:\\Users\\UTPL\\Ed\\hola")){

                int i;

                while((i = myReader.read())!= -1){

                    System.out.print((char)i);

                }

            }catch(IOException e){

                System.out.println("Error de lectura");


            }

        }
    }
