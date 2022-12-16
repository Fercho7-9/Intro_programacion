package Trabajo;

public class UnionArreglo {
    public static void main(String[] args) {
        String marcas1 [] ={"hp","dell","assus","lenovo","toshiba"};
        String marcas2 [] ={"samsung","huawai","dere"};
        int tam_arr_resultado = marcas1.length+ marcas1.length;
        String res [] = new String[tam_arr_resultado];
        for (int indice = 0; indice < marcas1.length; indice++) {
            res[indice] = marcas1[indice];
        }
        //copiamos los valores del arreglo marcas2 en el arreglo res
        int indice2 = 0;
        for (int indice = marcas1.length; indice < res.length; indice++) {
            res[indice] = marcas2[indice2];
            indice2++;
        }
        for (int indice = 0; indice < res.length; indice++) {
            System.out.println(res[indice]);
        }
    }
}
