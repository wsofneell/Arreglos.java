import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        //Arreglo Bidimensionales
        int matrizB[][] = {
            {1,2},
            {3,4}
        };

        System.out.println("Cantidad de filas: ");
        int CantFilas = lector.nextInt();
        System.out.println("Cantidad de columnas: ");
        int CantColumnas = lector.nextInt();
        int[][] matrizA = new int[CantFilas][CantColumnas];

        System.out.println("Ingrese los elementos de la matriz A: ");
        for (int i = 0; i < matrizA.length; i++) { //Para las filas
            for (int j = 0; j < matrizA[i].length; j++) {  //Para las columnas  de cada filas
            System.out.print("Arreglo A [" + i + "," + j + "] = ");
                matrizA[i][j] = lector.nextInt();        
            }           
        }
        System.out.println("Los datos en forma de matriz. ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.println(matrizA[i][j] + "\t");
            }
        }
        System.out.println("\n");



    }
}
