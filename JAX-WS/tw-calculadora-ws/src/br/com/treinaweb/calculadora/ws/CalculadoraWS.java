package br.com.treinaweb.calculadora.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.calculadora.treinaweb.com.br/", endpointInterface = "br.com.treinaweb.calculadora.ws.CalculadoraWSEndpoint", portName = "CalculadoraWSPort", serviceName = "CalculadoraWSService")
public class CalculadoraWS implements CalculadoraWSEndpoint {

	public int somar(int n1, int n2) {
		return n1 + n2;
	}
}
