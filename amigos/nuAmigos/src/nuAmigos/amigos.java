package nuAmigos;

import java.util.Scanner;

public class amigos {

	public static void main(String[] args) {
		System.out.println("Introduzca el primer numero: ");
		Scanner src = new Scanner(System.in);
		// Variables n1
		int n1;
		n1 = src.nextInt();
		int suma1 = 0;

		// for para sacar los divisores del primer numero introducido por el usuario
		for (int i = 1; i < n1; i++) {
			if (n1 % i == 0) {
				
				// Utilizado para ver cuales son los divisores de n1
				// System.out.println (i);
				suma1 = suma1 + i;
			}
		}

		System.out.println("Introduzca el segundo numero: ");
		
		// variables n2
		int n2;
		n2 = src.nextInt();
		int suma2 = 0;

		// for para sacar los divisores del segundo numero introducido por el usuario
		for (int i = 1; i < n2; i++) {
			if (n2 % i == 0) {
				
				// Utilizado para ver cuales son los divisores de n1
				// System.out.println (i);
				suma2 = suma2 + i;
			}
		}

		if (suma1 == n2 && suma2 == n1) {
			System.out.println("Los numeros " + n1 + " y " + n2 + " son amigos");
		} else {
			System.out.println("Los numeros elegidos no son amigos");
		}

	}

}
