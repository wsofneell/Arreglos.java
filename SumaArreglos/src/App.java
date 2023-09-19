import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);        
        System.out.print("Ingrese el tamaño de los arreglos: ");
        int tamaño = lector.nextInt();
        //Validar los tamaños no sean <= 0
        while (tamaño <= 0) {
        System.out.println("El tamaño de los arreglos no puede ser menor o igual a cero");
        System.out.print("Ingrese el tamaño de los arreglos: ");
        tamaño = lector.nextInt();   
        }
        //Declarar los arreglos
        int[] arregloA = new int[tamaño];
        int[] arregloB = new int[tamaño];
        int[] arregloSuma = new int[tamaño];
        //Pedir los elementos del arreglo al usuario
        System.out.println("Ingrese los elementos del arreglo A");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print("Elementos [" + (i+1) + "] = ");
            arregloA[i] = lector.nextInt();
        }
        System.out.println("Ingrese los elementos del arreglo B");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print("Elementos [" + (i+1) + "] = ");
            arregloB[i] = lector.nextInt();
        }
        for (int i = 0; i < arregloSuma.length; i++) {
            arregloSuma[i] = arregloA[i] + arregloB[i];
        }
        System.out.println("Elementos del arreglo A");
        System.out.println("Arreglo A = [");
        for (int i = 0; i < arregloSuma.length; i++) {
            System.out.print(arregloA[i] + ",");
        }
        System.out.println("]\n");
        System.out.println("Elementos del arreglo B");
        System.out.println("Arreglo B = [");
        for (int i = 0; i < arregloSuma.length; i++) {
            System.out.print(arregloB[i] + ",");
        }
        System.out.println("]\n");

        lector.close();
    }
}







 
