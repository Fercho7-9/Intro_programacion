public class Matriz {
    public static void main(String[] args) {
        //int matriz[][]= new int [2][3];
        //System.out.println(matriz[1][2]);
        //Creación de una matriz con valores predefinidos
        String univ[][]={
                {"utpl","ucuenca","espol"}, {"unl","uazuay","uide"}};
        //System.out.println("Dimension de la Matriz: ");
        //System.out.println("Filas = "+univ.length );
        //System.out.println("Columnas = "+univ[1].length);
        int filas = univ.length;
        int columnas = univ[1].length;

        for (int fila = 0; fila < filas ; fila++) {
            for (int columna = 0; columna < columnas ; columna++) {
                System.out.print(univ[fila][columna]+ " " + " " + "\t");
            }
            System.out.println();
        }
    }
}
