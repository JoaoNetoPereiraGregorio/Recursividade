package recursividade;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int numero = sc.nextInt();
		System.out.println("Fatorial de " +numero+" = "+fatorialRecursiva(numero));

	}

	public static int fatorialRecursiva(int numero) {
		if (numero == 0) {
			return 1;
		}

		return numero * fatorialRecursiva(numero - 1);
	}

}
