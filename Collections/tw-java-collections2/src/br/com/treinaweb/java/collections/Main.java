package br.com.treinaweb.java.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.treinaweb.java.collections.models.Pessoa;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(3, "TreinaWeb 3"));
		pessoas.add(new Pessoa(1, "TreinaWe 1"));
		pessoas.add(new Pessoa(2, "Treina 2"));
		System.out.println("Antes da ordenação: ");
		System.out.println(pessoas);
//		Collections.sort(pessoas, new PessoaTamanhoNomeComparator());

// **********************************************************************************************		
		
		/*Collections.sort(pessoas, (Comparator<Pessoa>)(o1, o2) -> {
			if (o1.getNome().length() == o2.getNome().length()) {
				return 0;
			} else if (o1.getNome().length() < o2.getNome().length()) {
				return -1;
			}
			return 1;
		});*/
		
// **********************************************************************************************	
		
		/*pessoas.sort((o1, o2) -> {
			if (o1.getNome().length() == o2.getNome().length()) {
				return 0;
			} else if (o1.getNome().length() < o2.getNome().length()) {
				return -1;
			}
			return 1;
		});*/
		
// **********************************************************************************************	
		
		/*pessoas.sort(Comparator.comparing(Pessoa::getNome, (o1, o2) -> {
			if (o1.length() == o2.length()) {
				return 0;
			} else if (o1.length() < o2.length()) {
				return -1;
			}
			return 1;
		}));*/

// **********************************************************************************************
		
//		pessoas.sort(Comparator.naturalOrder());
		pessoas.sort(Comparator.reverseOrder());
		
		System.out.println("Depois da ordenação: ");
		System.out.println(pessoas);
//		pessoas.remove(new Pessoa(1, "TreinaWeb 1"));
		
//		System.out.println(pessoas.contains(new Pessoa(2, "TreinaWeb 2")));
		
		/*System.out.println("Com FOR: ");
		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa p = pessoas.get(i);
			System.out.println(p);					
		}*/
		
		/*System.out.println("Com iterator: ");
		Iterator<Pessoa> iteratorPessoas = pessoas.iterator();
		while (iteratorPessoas.hasNext()) {
			Pessoa p = iteratorPessoas.next();
			if (p.getId() == 1) {
				iteratorPessoas.remove();
			}
			System.out.println(p);
		}*/
//		pessoas.removeIf(p -> p.getId() == 1);
//		System.out.println(pessoas);
		
		/*System.out.println("Com For-each: ");
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}*/
		System.out.println("Fim!");
	}

}
