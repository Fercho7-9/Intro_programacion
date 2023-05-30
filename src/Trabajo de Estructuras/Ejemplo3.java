import java.util.Scanner;
/**
 * @Eddy Fernando Ordonez
 * @Lenin Cuenca
 * @Jose David Caraguay
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-----Menú de operaciones-----");
            System.out.println("1. Resta de matrices");
            System.out.println("2. Producto de matrices");
            System.out.println("3. Suma de elementos de la diagonal secundaria");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            restaMatrices();
                            break;
                        case 2:
                            productoMatrices();
                            break;
                        case 3:
                            sumaDiagonalSecundaria();
                            break;
                        case 4:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción inválida. Intente nuevamente.");
                    }
                    System.out.println();
        } while (opcion != 4);
    }
    public static void restaMatrices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Resta de matrices");
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();
                // Crear la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        int[][] matriz1 = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        // Crear la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz:");
        int[][] matriz2 = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        // Restar las matrices
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        // Mostrar el resultado
        System.out.println("El resultado de la resta de las matrices es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void productoMatrices() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Producto de matrices");
        System.out.print("Ingrese el número de filas de la primera matriz: ");
        int filasMatriz1 = teclado.nextInt();
        System.out.print("Ingrese el número de columnas de la primera matriz: ");
        int columnasMatriz1 = teclado.nextInt();
        System.out.print("Ingrese el número de filas de la segunda matriz: ");
        int filasMatriz2 = teclado.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz: ");
        int columnasMatriz2 = teclado.nextInt();
                // Verificar si las matrices se pueden multiplicar
        if (columnasMatriz1 != filasMatriz2) {
            System.out.println("Error: las matrices no se pueden multiplicar.");
            return;
        }
        // Crear las matrices
        int[][] matriz1 = new int[filasMatriz1][columnasMatriz1];
        int[][] matriz2 = new int[filasMatriz2][columnasMatriz2];
                // Pedir elementos de la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < filasMatriz1; i++) {
            for (int j = 0; j < columnasMatriz1; j++) {
                System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matriz1[i][j] = teclado.nextInt();
            }
        }
        // Pedir elementos de la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < filasMatriz2; i++) {
            for (int j = 0; j < columnasMatriz2; j++) {
                System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matriz2[i][j] = teclado.nextInt();
            }
        }
        // Calcular el producto de las matrices
        int[][] producto = new int[filasMatriz1][columnasMatriz2];
        for (int i = 0; i < filasMatriz1; i++) {
            for (int j = 0; j < columnasMatriz2; j++) {
                for (int k = 0; k < columnasMatriz1; k++) {
                    producto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        // Mostrar el resultado
        System.out.println("El resultado del producto de las matrices es:");
        for (int i = 0; i < filasMatriz1; i++) {
            for (int j = 0; j < columnasMatriz2; j++) {
                System.out.print(producto[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sumaDiagonalSecundaria() {
        Scanner scanner = new Scanner(System.in);
        // Pedir dimensiones de la matriz cuadrada
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = scanner.nextInt();
        // Crear la matriz
        int[][] matriz = new int[n][n];
        // Pedir elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        // Calcular la suma de la diagonal secundaria
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - i - 1];
        }
        // Mostrar el resultado
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz.length ; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("La suma de los elementos de la diagonal secundaria es: " + suma);
    }
}