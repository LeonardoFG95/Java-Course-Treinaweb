package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int acao = 1; // 0 = sair; 1 = opera��o matem�tica; 2 = hist�rico
		ArrayList<String> historico = new ArrayList<String>();
		while (acao > 0) {
			if (acao == 1) {
				System.out.println(" === Opera��o Matem�tica === ");
				System.out.print("Digite o primeiro n�mero: ");
				int numero1 = 0;				
				try {
					numero1 = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println(String.format("Ocorreu um erro de formato: %s. O primeiro n�mero assumir� o valor 1,", e.getMessage()));
					scanner.nextLine();
					numero1 = 1;
				} catch (Exception e) {
					System.out.println("Erro desconhecido");
				}
				System.out.print("Digite a opera��o: ");
				char operacao = scanner.next().charAt(0);
				System.out.print("Digite o segundo n�mero: ");
				int numero2 = scanner.nextInt();
				System.out.println(String.format("Voc� quer fazer a opera��o %d %c %d ", numero1, operacao, numero2));
				int resultado = 0;
				switch (operacao) {
				case '+':
					resultado = numero1 + numero2;
					break;
				case '-':
					resultado = numero1 - numero2;
					break;
				case '*':
					resultado = numero1 * numero2;
					break;
				case '/':
					resultado = numero1 / numero2;
					break;
				default:
					System.out.println("Opera��o inv�lida.");
				}
				String entradaHistorico = String.format("%d %c %d = %d", numero1, operacao, numero2, resultado);
				historico.add(entradaHistorico);
				System.out.println(entradaHistorico);
			} else if (acao == 2) {
				System.out.println(" === Hist�rico === ");
				System.out.println(String.format("- Voc� j� fez %d opera��es", historico.size()));
				historico.forEach(itemHistorico -> System.out.println(itemHistorico));
			}
			System.out.println(" === O que voc� deseja fazer? ===  ");
			System.out.println("1. Realizar outra opera��o matem�tica");
			System.out.println("2. Visualizar hist�rico");
			System.out.println("0. Sair");
			System.out.println("Digite sua op��o: ");
			acao = scanner.nextInt();
		}
		scanner.close();
	}

}
