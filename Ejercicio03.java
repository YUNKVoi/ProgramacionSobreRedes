import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner nroentrada = new Scanner(System.in);
		int nro1 = 0, nro2 = 0, resultado = 0;
		
		System.out.println("Ingrese 2 numeros(separados por espacio): ");
		nro1 = nroentrada.nextInt();
		nro2 = nroentrada.nextInt();
		
		nroentrada.close();
		resultado = nro1+nro2;
		System.out.println("Suma = " + resultado );
		
		resultado = nro1*nro2;
		System.out.println("Producto = " + resultado );
		
		resultado = nro1-nro2;
		System.out.println("Diferencia = " + resultado );
	
		resultado = (double)(nro1/nro2);
		System.out.println("Cociente = " + resultado );
		
		resultado = (double)(nro1%nro2);
		System.out.println("Resto1 = " + resultado );
	}

}
