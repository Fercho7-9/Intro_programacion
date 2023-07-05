package SRP_1;
//Incrrepto
//SOLID s = Unica Resposabilidad
import java.util.ArrayList;
import java.util.List;


class  Persona{
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public  double calcularPromedioEdades(ArrayList<Persona>listaEst){
        double sumaEdades = 0;
        for (Persona estudiante:listaEst)
            sumaEdades += estudiante.edad;
     return (sumaEdades/listaEst.size());
    }
    public String toString() {
        return "Persona{"+"nombre='"+nombre + '\''+", edad=" + edad +'}';
    }
}
public class TestPersona_Incorr {
    public static void main(String[] args) {
        ArrayList<Persona> listaEstudiantes = new ArrayList<>(List.of(
                new Persona("Fabian",20),
                new Persona("Eddy",22),
                new Persona("Lenin",24)));
    for(Persona estudiante:listaEstudiantes){
        System.out.println(estudiante);
        }
        System.out.println(listaEstudiantes.get(0).calcularPromedioEdades(listaEstudiantes));
    }

}
