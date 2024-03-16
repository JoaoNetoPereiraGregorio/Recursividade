package recursividade;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int numero = sc.nextInt();
		System.out.println("A soma de " +numero+" + todos os seus antecessores = "+somaRecursiva(numero));

	}

	public static int somaRecursiva(int numero) {
		if (numero == 0) {
			return 0;
		}

		return numero + somaRecursiva(numero - 1);
	}

}
