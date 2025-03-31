import java.util.Scanner;
public class Ejercicio3_RBV {

	public static void main(String[] args) {
		
		Scanner  teclado=new Scanner(System.in);
		int sesiones, edad, peso;
		// Variables Velocidad
		double velocidad_inicial, velocidad,velocidad_maxima=0,velocidad_total=0,velocidad_media;
		
		// Variables calorias
		int calorias_quemadas,calorias,calorias_maxima=0,calorias_total=0,calorias_media;
		
		//Variables distancia
		int distancia_inicial,distancia,distancia_maxima=0,distancia_total=0,distancia_media;
		
		double altura,IMC;
		String nombre,sexo;
		
		System.out.println("Indica el numero de sesiones realizadas");
		sesiones = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Indica tu nombre");
		nombre = teclado.nextLine();
		
		System.out.println("Indica tu edad");
		edad = teclado.nextInt();
		
		System.out.println("Indica tu peso");
		peso = teclado.nextInt();
		
		System.out.println("Indica tu altura");
		altura = teclado.nextDouble();
		
		teclado.nextLine();
		System.out.println("Indica tu sexo");
		sexo = teclado.nextLine();
		
		System.out.println("Indica tu velocidad inicial");
		velocidad_inicial = teclado.nextDouble();
		
		System.out.println("Indica tu distancia inicial(en metros)");
		distancia_inicial = teclado.nextInt();
		
		System.out.println("Indica tus calorias iniciales quemadas");
		calorias_quemadas = teclado.nextInt();
		
		IMC = peso / Math.pow(altura,2);
		
		System.out.println("A continuacion, indica los valores de las sesiones");
		for (int i = 1; i<=sesiones;i++) {
			System.out.println("Indica la velocidad en la sesion");
			velocidad = teclado.nextDouble();
			
			System.out.println("Indica la distancia en la sesion(en metros)");
			distancia = teclado.nextInt();
			
			System.out.println("Indica la calorias en la sesion");
			calorias = teclado.nextInt();
			
			velocidad_total += velocidad;
			distancia_total += distancia;
			calorias_total += calorias;
			
			if(velocidad>velocidad_maxima) {
				velocidad_maxima = velocidad;
			}
			if(calorias>calorias_maxima) {
				calorias_maxima = calorias;
			}
			if(distancia>distancia_maxima) {
				distancia_maxima = distancia;
			}			
		}
		velocidad_media = velocidad_total/sesiones;
		calorias_media = calorias_total/sesiones;
		distancia_media = distancia_total/sesiones;
		
		System.out.println("\n\nHola " + nombre + ", te presentamos la ficha de seguimiento de entrenamiento: \n");

		if(velocidad_media > velocidad_inicial || distancia_media > distancia_inicial || calorias_media > calorias_quemadas) {
			System.out.print("Enhorabuena has superado los registros iniciales en: ");
			if(velocidad_maxima>velocidad_inicial) {
				System.out.print("velocidad,");
			}
			if(distancia_maxima > distancia_inicial) {
				System.out.print("distancia,");
			}
			if(calorias_maxima > calorias_quemadas) {
				System.out.print("calorias.");
			}
		}
		System.out.println("\nEdad: " + edad);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);
		System.out.println("IMC: " + String.format("%.2f",IMC));
		System.out.println("La media del entrenamiento en " + sesiones + " sesiones es: ");
		System.out.println("Velocidad: " + String.format("%.2f",velocidad_media) + "k/h");
		System.out.println("Distancia Recorrida: " + distancia_media + "m");
		System.out.println("Calorias Quemadas: " + calorias_media + "kcal");
		System.out.println("Maxima distancia recorrida: " + distancia_maxima + "m");
		System.out.println("Maximo numero de calorias quemadas en una sesion: " + calorias_maxima + "kcal");
		
	}

}