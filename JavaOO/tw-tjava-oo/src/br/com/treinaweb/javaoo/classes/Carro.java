package br.com.treinaweb.javaoo.classes;

public final class Carro extends VeiculoBase {
	
	private int quatidadePortas;
	
	public int getQuatidadePortas() {
		return quatidadePortas;
	}

	public void setQuatidadePortas(int quatidadePortas) {
		this.quatidadePortas = quatidadePortas;
	}
	
	public Carro () {
		this.quantidadeRodas = 4;
	}
	
	public Carro(String nome, String marca) {
		this.quantidadeRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
	}

	@Override
	public void preparar() {
		System.out.println("Colocar o cinto de seguranša.");
	}

	

}
