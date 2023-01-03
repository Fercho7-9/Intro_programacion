public class OrdanamientoBurbuja {
    public static void main(String[] args) {
            int numeros[]={20,10,5,3,2,1};
            //controlamos el numero de pasadas generales
            for (int indice = 0; indice <= numeros.length-1 ; indice++) {
                for (int elemento = 0; elemento <= numeros.length-2 ; elemento++) {
                    //Verificamos si realizamos un intercambio
                    if (numeros[elemento]>numeros[elemento+1]){
                        int aux = numeros[elemento];
                        numeros[elemento]= numeros[elemento+1];
                        numeros[elemento]= aux;
                    }
                }
            }
            //Mostar arreglo ordenado
            for (int indice = 0; indice < numeros.length; indice++) {
                System.out.println(numeros[indice]);
            }
        }
    }