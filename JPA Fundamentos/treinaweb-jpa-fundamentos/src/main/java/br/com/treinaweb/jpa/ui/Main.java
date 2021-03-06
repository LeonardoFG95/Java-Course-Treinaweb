package br.com.treinaweb.jpa.ui;

import java.util.List;
import java.util.Scanner;

import br.com.treinaweb.jpa.models.Pessoa;
import br.com.treinaweb.jpa.services.impl.PessoaService;
import br.com.treinaweb.jpa.services.interfaces.CrudService;
import br.com.treinaweb.jpa.services.interfaces.PessoaBuscaPorNome;

public class Main {

	private static Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		listarPessoas();
		int opcao = 0;
		Scanner scanner = new Scanner(System.in);
		while (opcao != 6) {
			System.out.println("\n Escolha uma op��o: ");
			System.out.println("1. Listar pessoas");
			System.out.println("2. Inserir pessoas");
			System.out.println("3. Atualizar pessoas");
			System.out.println("4. Excluir pessoas");
			System.out.println("5. Pesquisar pessoas");
			System.out.println("6. Sair");
			System.out.print("\n Sua op��o: ");
			opcao = SCANNER.nextInt();
			SCANNER.nextLine(); // To consume \n
			switch (opcao) {
			case 1:
				listarPessoas();
				break;
			case 2:
				inserirPessoa();
				break;
			case 3:
				atualizarPessoa();
				break;
			case 4:
				excluirPessoa();
				break;
			case 5:
				pesquisarPessoaPorNome();
				break;
			default:
				System.out.println("** Op��o inv�lida! **");
			}
		}
		scanner.close();
		System.out.println("Tchau! :)");
	}

	private static void pesquisarPessoaPorNome() {
		System.out.println("\n ** Pesquisa de pessoa por nome");
		System.out.println(" - Digite o nome a ser pesquisado: ");
		String nomeASerPesquisado = SCANNER.nextLine();
		PessoaBuscaPorNome pessoaService = new PessoaService();
		pessoaService.searchByName(nomeASerPesquisado).forEach(pessoa -> {
			System.out.println(String.format(" - (%d) %s %s - %d anos", pessoa.getId(), pessoa.getNome(),
					pessoa.getSobrenome(), pessoa.getIdade()));
		});
	}

	private static void excluirPessoa() {
		System.out.println("\n ** Remo��o de pessoa **");
		System.out.println(" - Digite o ID da pessoa a ser removida: ");
		int idPessoaASerRemovida = SCANNER.nextInt();
		SCANNER.nextLine();
		CrudService<Pessoa, Integer> pessoaService = new PessoaService();
		pessoaService.deleteById(idPessoaASerRemovida);
		System.out.println("Pessoa removida com sucesso!");
	}

	private static void atualizarPessoa() {
		System.out.println("\n ** Atualiza��o de pessoa **");
		System.out.println("Digite o id da pessoa a ser atualizada: ");
		int idPessoa = SCANNER.nextInt();
		SCANNER.nextLine();
		CrudService<Pessoa, Integer> pessoaService = new PessoaService();
		Pessoa pessoaAtual = pessoaService.byId(idPessoa);
		if (pessoaAtual != null) {
			System.out.println("Pessoa encontrada: ");
			System.out.println(String.format(" - Nome: %s", pessoaAtual.getNome()));
			System.out.println(String.format(" - Sobrenome: %s", pessoaAtual.getSobrenome()));
			System.out.println(String.format(" - Idade: %s", pessoaAtual.getIdade()));
			System.out.println(" - Novo nome: ");
			pessoaAtual.setNome(SCANNER.nextLine());
			System.out.println(" - Novo sobrenome: ");
			pessoaAtual.setSobrenome(SCANNER.nextLine());
			System.out.println(" - Nova idade: ");
			pessoaAtual.setIdade(SCANNER.nextInt());
			pessoaService.update(pessoaAtual);
			System.out.println("Pessoa atualizada com sucesso!");
		} else {
			System.out.println("N�o existem pessoas com esse ID.");
		}
	}

	private static void inserirPessoa() {
		System.out.println("\n ** Inclus�o de pessoa **");
		Pessoa novaPessoa = new Pessoa();
		System.out.println("Nome: ");
		novaPessoa.setNome(SCANNER.nextLine());
		System.out.println("Sobrenome: ");
		novaPessoa.setSobrenome(SCANNER.nextLine());
		System.out.println("Idade: ");
		novaPessoa.setIdade(SCANNER.nextInt());
		CrudService<Pessoa, Integer> pessoaService = new PessoaService();
		pessoaService.insert(novaPessoa);
		System.out.println(" - Pessoa inserida com sucesso! :)");
	}

	private static void listarPessoas() {
		CrudService<Pessoa, Integer> pessoaService = new PessoaService();
		System.out.println("**** GERENCIAMENTO DE PESSOAS ****");
		System.out.println("> Lista de pessoas cadastradas: \n");
		try {
			List<Pessoa> pessoas = pessoaService.all();
			pessoas.forEach(pessoa -> {
				System.out.println(String.format(" - (%d) %s %s - %d anos", pessoa.getId(), pessoa.getNome(),
						pessoa.getSobrenome(), pessoa.getIdade()));
			});
			if (pessoas.isEmpty()) {
				System.out.println(" - N�o existem pessoas cadastradas.");
			}
		} catch (Exception e) {
			System.out.println("Houve um erro ao utilizar a JPA " + e.getMessage());
		}
	}

}
