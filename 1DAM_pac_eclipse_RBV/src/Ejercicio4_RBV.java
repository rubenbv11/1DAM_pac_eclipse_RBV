import java.util.*;
public class Ejercicio4_RBV {
	static Scanner teclado = new Scanner(System.in);
	static Random random = new Random();
    public static void main(String[] args) {
        final int NUM_EQUIPOS = 20;
        String[] equipos = new String[NUM_EQUIPOS];
        int[] puntuaciones = new int[NUM_EQUIPOS];
        
        // Nombres de los equipos
        for (int i = 0; i < NUM_EQUIPOS; i++) {
            System.out.print("Introduce el nombre del equipo " + (i + 1) + ": ");
            equipos[i] = teclado.nextLine();
        }
        
        // Puntuaciones aleatorias entre 35 y 100
        for (int i = 0; i < NUM_EQUIPOS; i++) {
            puntuaciones[i] = random.nextInt(66) + 35; 
        }
        
        // Determinar el equipo ganador y el último clasificado
        int maxPuntuacion = puntuaciones[0], minPuntuacion = puntuaciones[0];
        String equipoGanador = equipos[0], equipoUltimo = equipos[0];
        
        for (int i = 1; i < NUM_EQUIPOS; i++) {
            if (puntuaciones[i] > maxPuntuacion) {
                maxPuntuacion = puntuaciones[i];
                equipoGanador = equipos[i];
            }
            if (puntuaciones[i] < minPuntuacion) {
                minPuntuacion = puntuaciones[i];
                equipoUltimo = equipos[i];
            }
        }
        
        // Calcular la puntuación media
        int suma = 0;
        for (int puntuacion : puntuaciones) {
            suma += puntuacion;
        }
        double puntuacionMedia = (double) suma / NUM_EQUIPOS;
        
        // Mostrar resultados
        System.out.println("\nResultados de la liga:");
        System.out.println("Equipo ganador: " + equipoGanador + " con " + maxPuntuacion + " puntos.");
        System.out.println("Último clasificado: " + equipoUltimo + " con " + minPuntuacion + " puntos.");
        System.out.printf("Puntuación media de los equipos: %.2f\n", puntuacionMedia);
    }
}
