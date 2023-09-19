import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        System.out.println("Cantidad de notas: ");
        int CantidadNotas = lector.nextInt();

        while (CantidadNotas <= 0) {
            System.out.println("No puede ingresar valores menores o igualesa 0");
            System.out.println("Cantidad de notas: ");
            CantidadNotas = lector.nextInt();          
        }

        int [] notas = new int [CantidadNotas];
        String [] nombresEstudiantes = new String[CantidadNotas];
        int sumaNotas = 0;
        System.out.println("Ingrese nombre y nota de cada estudiante del grupo: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Estudiante[" + (i+1) + "] = ");
            nombresEstudiantes[i] =lector.nextLine();
            lector.nextLine();
            System.out.println("Nota [" + (i+1) + "] = ");
            notas[i] = lector.nextInt();
            sumaNotas += notas[i];
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Nombre completo\t\t\tNota");
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            System.out.println(nombresEstudiantes[i] + "\t\t\t" + notas[i]);
            
        }        
        // double promedio = 0.0
        System.out.println("Promedio de notas es: " + (double)sumaNotas/CantidadNotas);

        lector.close();
    }
}
