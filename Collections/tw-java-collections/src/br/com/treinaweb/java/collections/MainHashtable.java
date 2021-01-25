package br.com.treinaweb.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainHashtable {

	public static void main(String[] args) {
		Hashtable<String, Pessoa> tabelaPessoa = new Hashtable<String, Pessoa>(20, 0.6f);
		tabelaPessoa.put("legal", new Pessoa(1, "TreinaWeb 1"));
		System.out.println(tabelaPessoa);
		tabelaPessoa.put("chato", new Pessoa(2, "TreinaWeb 2"));
		System.out.println(tabelaPessoa);	
		System.out.println(tabelaPessoa.get("legal"));
		System.out.println(tabelaPessoa.put("legal", new Pessoa(3, "TreinaWeb 3")));
		System.out.println(tabelaPessoa.get("legal"));
		System.out.println(tabelaPessoa.put("bla", new Pessoa(4, "TreinaWeb 4")));
		
		// Iteração
		// Fail-Fast Iterator
		System.out.println("Fail-Fast Iterator: ");
		Iterator<String> iteratorChaves = tabelaPessoa.keySet().iterator();
		while (iteratorChaves.hasNext()) {
			String chave = iteratorChaves.next();
			System.out.println(" - " + tabelaPessoa.get(chave).toString());
		}

		//Non Fail-Fast Iterator
		System.out.println("Non Fail-Fast Iterator: ");
		Enumeration<String> chaves = tabelaPessoa.keys();
		tabelaPessoa.remove("legal");
		while (chaves.hasMoreElements()) {
			String chave = chaves.nextElement();
			System.out.println(" - " + tabelaPessoa.get(chave).toString());
		}
		
		// getOrDefault
		System.out.println("getOrDefault: ");
		Pessoa p = tabelaPessoa.getOrDefault("legal", new Pessoa(-1, "Não Existe"));
		System.out.println(p);
		
		//putIfAbsent
		System.out.println("putIfAbsent: ");
		tabelaPessoa.putIfAbsent("legal", new Pessoa(1, "TreinaWeb 1"));
		System.out.println(tabelaPessoa);
		
		//forEach
		System.out.println("forEach: ");
		tabelaPessoa.forEach((chave, valor) -> {
			System.out.println(String.format("[%s] %s", chave, valor.toString()));
		});
	}

}
