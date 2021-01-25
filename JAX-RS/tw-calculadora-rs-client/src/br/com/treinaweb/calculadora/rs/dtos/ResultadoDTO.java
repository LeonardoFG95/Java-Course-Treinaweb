package br.com.treinaweb.calculadora.rs.dtos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultadoDTO {

	private int resultado;

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

}
