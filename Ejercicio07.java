import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner nroEntrada = new Scanner(System.in);
		int nro1 = 0;
		
		System.out.println("Ingrese el número: ");
		nro1 =  nroEntrada.nextInt();
		
		System.out.println((nro1%2==0)?"Es par" : "Es impar");
	}

}
