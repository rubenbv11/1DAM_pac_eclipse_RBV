import java.util.*;
public class Ejercicio2_RBV {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

		if(proceso_seleccion()) {
			System.out.println("Ha sido contratado");
		}else {
			System.out.println("No ha sido contratado");
		}
		
	}
	
	public static boolean proceso_seleccion() {
		
		int edad, años_trabajados, sueldo_bruto, importe, importe_total=0;
		double importe_medio = 0;
		String nombre;
		boolean booleano;
		
		System.out.println("Indica tu edad");
		edad = teclado.nextInt();
		
		teclado.nextLine();
		if(edad <= 40) {
			
			System.out.println("Indica tu nombre");
			nombre = teclado.nextLine();
			
			System.out.println("Indica los años trabajados");
			años_trabajados = teclado.nextInt();
			
			System.out.println("Indica tu sueldo bruto anual");
			sueldo_bruto = teclado.nextInt();
			
			if(sueldo_bruto <= 30000) {
				System.out.println("A continuación, indica el importe de tus 5 anteriores nominas.");
				for (int i = 1; i<=5;i++) {
					System.out.println("Indica el importe de tu nomina");
					importe = teclado.nextInt();
					importe_total += importe;
					System.out.println("Importe total: " +  importe_total + "€");
				}
				importe_medio = importe_total/5;
				
				if(importe_medio > 2500) {
					importe_medio = (importe_medio*1.05);
					System.out.println("Ha habido un incremento en el sueldo");
					System.out.println("Importe Incrementado a: " +  String.format("%.2f",importe_medio) + "€");
					booleano = true;
				}else {
					importe_medio = (importe_medio*1.10);
					System.out.println("Ha habido un incremento en el sueldo");
					System.out.println("Importe Incrementado a: " +  String.format("%.2f",importe_medio) + "€");
					booleano = true;
				}
				
			}else {
				System.out.println("Descartado del proceso de seleccion");
				booleano = false;
			}
			
		}else {
			System.out.println("Descartado del proceso de seleccion");
			booleano = false;
		}
		return booleano;
	}
}
