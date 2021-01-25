package br.com.treinaweb.java.streams;

public class MensageiroConsole implements Mensageiro {
	
	public void emitirMensagem(String mensagem) {
		System.out.println("Mensagem: " + mensagem);
	}

}
