package br.com.treinaweb.estruturadados.conjuntos;

import br.com.treinaweb.estruturadados.espalhamento.TabelaEspalhamento;

public class ConjuntoRefatorado<T> {

	private TabelaEspalhamento<T> elementos;

	public ConjuntoRefatorado() {
		this.elementos = new TabelaEspalhamento<T>();
	}

	public boolean inserir(T elemento) {
		return this.elementos.inserir(elemento);
	}

	public boolean estaVazio() {
		return this.elementos.tamanho() == 0;
	}

	public int tamanho() {
		return this.elementos.tamanho();
	}

//	public boolean contemOtimizado(T elemento) {
//		for (int i = 0; i < elementos.tamanho(); i++) {
//			T el = this.elementos.recuperar(i);
//			if (el.hashCode() == elemento.hashCode()) {
//				return true;
//			}
//		}
//		return false;
//	}

	public boolean contem(T elemento) {
		return this.elementos.contem(elemento);
	}

	public void remover(T elemento) {
		this.elementos.remover(elemento);
	}

	@Override
	public String toString() {
		return "Conjunto [elementos=" + elementos + "]";
	}

}
