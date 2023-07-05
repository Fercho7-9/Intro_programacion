package SRP_1;
//Aplicando del Principio
//SOLID s = Unica Resposabilidad
import java.util.ArrayList;
import java.util.List;
class  Persona_{
    public String nombre;
    public int edad;
        public Persona_(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        public String toString() {
            return "Persona{"+"nombre='"+nombre + '\''+", edad=" + edad +'}';
        }
    }
    class UtilidadesEstudiantes {
        public double calcularPromedioEdades(ArrayList<Persona_> listaEst) {
            double sumaEdades = 0;
            for (Persona_ estudiante : listaEst)
                sumaEdades += estudiante.edad;
            return (sumaEdades / listaEst.size());

        }
    }

    public class TestPersona_OK {
        public static void main(String[] args) {
            ArrayList<Persona_> listaEstudiantes = new ArrayList<>(List.of(
                    new Persona_("Fabian", 20),
                    new Persona_("Eddy", 22),
                    new Persona_("Lenin", 24)));
            for (Persona_ estudiante : listaEstudiantes) {
                System.out.println(estudiante);
            }
            System.out.println("Proemdio de edades: "+ (new UtilidadesEstudiantes()).calcularPromedioEdades(listaEstudiantes));
         }
        }

