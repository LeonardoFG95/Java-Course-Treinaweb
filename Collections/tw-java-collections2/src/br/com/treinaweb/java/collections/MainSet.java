package br.com.treinaweb.java.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainSet {

	public static void main(String[] args) {
		NavigableSet<Pessoa> set = new TreeSet<Pessoa>();
		set.add(new Pessoa(2, "TreinaWeb 2"));
		set.add(new Pessoa(3, "TreinaWeb 3"));
		set.add(new Pessoa(4, "TreinaWeb 4"));
		set.add(new Pessoa(1, "Abel"));
		Pessoa teste = set.lower(new Pessoa(2, "TreinaWeb 2"));
		System.out.println(teste);
//		set.add(null);
//		System.out.println(set);
//		set.add(new Pessoa(2, "TreinaWeb 2"));
//		System.out.println(set);
//		for (Pessoa p : set) {
//			System.out.println(p);
//		}
		
	}

}
