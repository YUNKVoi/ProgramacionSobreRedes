import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String nombre = "";
		
		String apellido = "";
		
		int edad = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre ");
		nombre = entrada.nextLine();

		System.out.println("Ingrese su apellido ");
		apellido = entrada.nextLine();
		
		System.out.println("Ingrese su edad");
		edad = entrada.nextInt();
		
		System.out.println("Usted se llama " + nombre + " " + apellido + " y tiene " + edad + " años");
		entrada.close();
	}

}
