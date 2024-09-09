import java.util.Scanner;
public class Index {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar datos del estudiante
	        String nombreEstudiante = Procesos.obtenerNombreEstudiante(scanner);
	        String materia = Procesos.obtenerMateria(scanner);
	        double[] notas = Procesos.obtenerNotas(scanner);

	        // Calcular promedio
	        double promedio = Procesos.calcularPromedio(notas);

	        // Mostrar resultado
	        Procesos.mostrarResultado(nombreEstudiante, materia, promedio);
	    }
}
