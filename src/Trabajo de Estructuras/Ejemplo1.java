import java.util.Random;
/**
 * @Eddy Fernando Ordonez
 * @Lenin Cuenca
 * @Jose David Caraguay
 */
public class Ejemplo1 {
        public static void main(String[] args) {
            Random R = new Random();
            int filas =12;
            int columnas = 4;
            int[][] ventas = new int [filas][columnas];
            System.out.println("Ingrese la cantidad de produtos");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    ventas[i][j]=R.nextInt(99)+1;
                }
            }
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(ventas[i][j]+" ");
                }
                System.out.println(" ");
            }
            calcularProductoMasVendido(ventas);
            calcularMesMasVendido(ventas);
            calcularMesMenosVendido(ventas);
        }

        public static void calcularProductoMasVendido(int[][] ventas) {
            int maxVenta = 0;
            int productoMasVendido = 0;
            for (int i = 0; i < ventas[0].length; i++) {
                int totalVentas = 0;
                for (int j = 0; j < ventas.length; j++) {
                    totalVentas += ventas[j][i];
                }
                if (totalVentas > maxVenta) {
                    maxVenta = totalVentas;
                    productoMasVendido = i + 1;
                }
            }
            System.out.println("El producto con mayor venta es el:");
            if (productoMasVendido==1){
                System.out.println("Producto A");
            } else if (productoMasVendido==2) {
                System.out.println("Producto B");
            } else if (productoMasVendido==3) {
                System.out.println("Producto C");
            } else if (productoMasVendido==4) {
                System.out.println("Producto D");
            }
            System.out.println("Con un total de " + maxVenta + " unidades vendidas.\n");
        }
        public static void calcularMesMasVendido(int[][] ventas) {
            int maxVenta = 0;
            int mesMasVendido = 0;

            for (int i = 0; i < ventas.length; i++) {
                int totalVentas = 0;
                for (int j = 0; j < ventas[i].length; j++) {
                    totalVentas += ventas[i][j];
                }
                if (totalVentas > maxVenta) {
                    maxVenta = totalVentas;
                    mesMasVendido = i + 1;

                }
            }
            System.out.println("El mes en que más se vendieron los productos es:");
            if (mesMasVendido==1){
                System.out.println("Enero");
            } else if (mesMasVendido==2) {
                System.out.println("Febrero");
            } else if (mesMasVendido==3) {
                System.out.println("Marzo");
            } else if (mesMasVendido==4) {
                System.out.println("Abril");
            } else if (mesMasVendido==5) {
                System.out.println("Mayo");
            } else if (mesMasVendido==6) {
                System.out.println("Junio");
            } else if (mesMasVendido==7) {
                System.out.println("Julio");
            } else if (mesMasVendido==8) {
                System.out.println("Agostos");
            } else if (mesMasVendido==9) {
                System.out.println("Septiembre");
            } else if (mesMasVendido==10) {
                System.out.println("Octubre");
            } else if (mesMasVendido==11) {
                System.out.println("Nobriembre");
            } else if (mesMasVendido==12) {
                System.out.println("Diciembre");
            }
            System.out.println("Con un total de " + maxVenta + " unidades vendidas.\n");
        }
        public static void calcularMesMenosVendido(int[][] ventas) {
            int minVenta = Integer.MAX_VALUE;
            int mesMenosVendido = 0;
            for (int i = 0; i < ventas.length; i++) {
                int totalVentas = 0;
                for (int j = 0; j < ventas[i].length; j++) {
                    totalVentas += ventas[i][j];
                }
                if (totalVentas < minVenta) {
                    minVenta = totalVentas;
                    mesMenosVendido = i + 1;
                }
            }
            System.out.println("El mes en que menos se vendieron los productos es:");
            if (mesMenosVendido==1){
                System.out.println("Enero");
            } else if (mesMenosVendido==2) {
                System.out.println("Febrero");
            } else if (mesMenosVendido==3) {
                System.out.println("Marzo");
            } else if (mesMenosVendido==4) {
                System.out.println("Abril");
            } else if (mesMenosVendido==5) {
                System.out.println("Mayo");
            } else if (mesMenosVendido==6) {
                System.out.println("Junio");
            } else if (mesMenosVendido==7) {
                System.out.println("Julio");
            } else if (mesMenosVendido==8) {
                System.out.println("Agostos");
            } else if (mesMenosVendido==9) {
                System.out.println("Septiembre");
            } else if (mesMenosVendido==10) {
                System.out.println("Octubre");
            } else if (mesMenosVendido==11) {
                System.out.println("Nobriembre");
            } else if (mesMenosVendido==12) {
                System.out.println("Diciembre");
            }
            System.out.println("Con un total de " + minVenta + " unidades vendidas.\n");
        }
}