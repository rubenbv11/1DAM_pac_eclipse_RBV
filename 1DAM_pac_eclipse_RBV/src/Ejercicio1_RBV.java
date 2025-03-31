import java.util.*;
public class Ejercicio1_RBV {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		auditoriaEmpresa();
		
	}
	public static boolean auditoriaEmpresa() {
		
		double SalarioJefe, SalarioEncargado, SalarioOficinistas,presupuestoEmpresa,totalSueldos;
		int numeroOficinistas;
		boolean proyectosTerminados;
		String respuesta;
		
		System.out.println("Indica el Salario del jefe: ");
		SalarioJefe = teclado.nextDouble();
		System.out.println("Indica el Salario del encargado: ");
		SalarioEncargado = teclado.nextDouble();
		System.out.println("Indica el numero de oficinistas: ");
		numeroOficinistas = teclado.nextInt();
		System.out.println("Indica el Salario de los oficinistas: ");
		SalarioOficinistas = teclado.nextDouble();
		do {
			
			
			System.out.println("Estan todos lo proyectos terminados(S/N)");
			respuesta = teclado.next();
			
		}while(!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
		System.out.println("Indica el presupuesto de la empresa");
		presupuestoEmpresa = teclado.nextDouble();
		
		totalSueldos = (SalarioJefe + SalarioEncargado + (SalarioOficinistas*numeroOficinistas));
		
		if(respuesta.equalsIgnoreCase("S")) {
			proyectosTerminados = true;
		}else {
			proyectosTerminados = false;
		}
		
		
		if(!proyectosTerminados) {
			System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
			return false;
		}else if(totalSueldos>20000) {
			System.out.println("No ha pasado la auditoría ya que el gasto en personal es de "+ totalSueldos +"€ y excede el límite mensual de 20000 euros");
			return false;
		}else if(presupuestoEmpresa>100000) {
			System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de "+ presupuestoEmpresa +"€ excede el límite establecido en 100000 euros");
		}else {
			System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
			return true;
		}
		return false;
	}

}
