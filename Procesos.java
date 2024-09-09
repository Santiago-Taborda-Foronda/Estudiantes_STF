import java.util.Scanner;
public class Procesos {
	 // Método para solicitar el nombre del estudiante
    public static String obtenerNombreEstudiante(Scanner scanner) {
        System.out.print("Ingrese el nombre del estudiante: ");
        return scanner.nextLine();
    }

    // Método para solicitar la materia
    public static String obtenerMateria(Scanner scanner) {
        System.out.print("Ingrese la materia: ");
        return scanner.nextLine();
    }

    // Método para solicitar las notas
    public static double[] obtenerNotas(Scanner scanner) {
        double[] notas = new double[3];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = obtenerNotaValida(scanner, i + 1);
        }
        return notas;
    }

    // Método para validar y solicitar una nota
    public static double obtenerNotaValida(Scanner scanner, int numeroNota) {
        double nota;
        do {
            System.out.print("Ingrese la nota " + numeroNota + " (0-5): ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 5);
        return nota;
    }

    // Método para calcular el promedio
    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método para mostrar el resultado
    public static void mostrarResultado(String nombreEstudiante, String materia, double promedio) {
        System.out.printf("El promedio de %s en %s es %.2f%n", nombreEstudiante, materia, promedio);
        if (promedio >= 3.5) {
            System.out.println("El estudiante ha aprobado la materia.");
        } else if (promedio > 2.5) {
            System.out.printf("El estudiante puede recuperar la materia de %s.%n", materia);
        } else {
            System.out.println("El estudiante ha reprobado la materia.");
        }
    }
}
