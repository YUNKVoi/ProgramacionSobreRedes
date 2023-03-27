import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner nroEntrada = new Scanner(System.in);
		int nro1 = 0, nro2 = 0, nro3 = 0;

		System.out.println("Ingrese 3 numeros(separados por espacio): ");
		nro1 = nroEntrada.nextInt();
		nro2 = nroEntrada.nextInt();
		nro3 = nroEntrada.nextInt();
		nroEntrada.close();

		if (nro1 == nro2 && nro1 == nro3) {
			System.out.println("Los tres números son iguales");
		} else {
			if (nro1 > nro2 && nro1 > nro3) {
				System.out.println("El primer número es mayor");
			} else if (nro2 > nro1 && nro2 > nro3) {
				System.out.println("El segundo número es mayor");
			} else if (nro3 > nro1 && nro3 > nro2) {
				System.out.println("El tercer número es mayor");
			}

		}
		
		
		
		System.out.println("Suma: " + (nro1 + nro2 + nro3));
		System.out.println("Promedio: " + ((double)(nro1 + nro2 + nro3)/3));
		System.out.println("Producto: " + (nro1 * nro2 * nro3));


	}

}