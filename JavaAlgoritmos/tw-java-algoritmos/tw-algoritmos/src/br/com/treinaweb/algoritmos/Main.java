package br.com.treinaweb.algoritmos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] numeros = new int[5];
		Scanner leitor = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um n�mero: ");
			int numero = leitor.nextInt();
			numeros[i] = numero;
		} 
		
		// ** Busca Linear
		// Melhor caso: 1 vez
		// Pior caso: n vezes
		// Caso m�dio: n/2 vezes
		// O(n)
		
		/*
		 * System.out.println("** BUSCA LINEAR **");
		 * System.out.println("Digite o n�mero a ser pesquisado: "); int alvo =
		 * leitor.nextInt(); int posicaoResultado = -1; for (int i = 0; i <
		 * numeros.length; i++) { if (numeros[i] == alvo) { posicaoResultado = i; break;
		 * } } if (posicaoResultado < 0) {
		 * System.out.println("Elemento n�o encontrado."); } else {
		 * System.out.println(String.format("O n�mero %d foi encontrado na posi��o %d",
		 * alvo, posicaoResultado)); }
		 */
		
		// ** FIM: Busca Linear
		
		// ** Selection Sort
		// Melhor caso: N * N = N^2
		// Caso m�dio: N^2
		// Pior caso: = N^2
		// O(N^2)		
		
		for (int i = 0; i < numeros.length; i++) {
			int indiceDoMenor = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[indiceDoMenor]) {
					indiceDoMenor = j;
				}
			}
			int temp = numeros[indiceDoMenor];
			numeros[indiceDoMenor] = numeros[i];
			numeros[i] = temp;
		}
		
		System.out.println("Vetor ordenado: ");
		imprimirArray(numeros);
		
		// FIM: Selection Sort
		
		// ** Busca Binaria
		
		int resultado = -1;
		int inicio = 0;
		int fim = numeros.length - 1;
		int meio = 0;
		System.out.println("Digite o numero a ser encontrado: ");
		int alvo = leitor.nextInt();
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (numeros[meio] < alvo) {
				inicio = meio + 1;
			} else if (numeros[meio] > alvo) {
				fim = meio - 1;
			} else if (numeros[meio] == alvo) {
				resultado = meio;
				break;
			}
				
		}
		if (resultado < 0) {
			System.out.println("Elemento n�o encontrado!");
		} else {
			System.out.println(String.format("O n�mero %d est� na posi��o %d", alvo, resultado));
		}
		
		// FIM: Busca Binaria
		
		leitor.close();
	}
	
	private static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
