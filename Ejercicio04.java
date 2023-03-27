import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner nroEntrada = new Scanner(System.in);
		int nro1 = 0, nro2 = 0;
		
		System.out.println("Ingrese 2 numeros(separados por espacio): ");
		nro1 = nroEntrada.nextInt();
		nro2 = nroEntrada.nextInt();
		
		nroEntrada.close();
		
		System.out.println((nro1>nro2) ? "El  primer  número es mayor" : (nro1==nro2) ? "Los números son iguales" : "El primer número es menor");
		
		if (nro1>nro2) {
			System.out.println("El  primer  número es mayor");
		}else if (nro1 == nro2) {
			System.out.println("Los números son iguales");
		}else {
			System.out.println("El primer número es menor");
		}
	}

}
