package br.com.treinaweb.calculadora.ws.ui;

import java.net.MalformedURLException;
import java.net.URL;

import br.com.treinaweb.calculadora.ws.client.CalculadoraWSService;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		CalculadoraWSService srv = new CalculadoraWSService(new URL("http://localhost:8080/tw-calculadora-ws/services/CalculadoraWSPort"));
		System.out.println(srv.getCalculadoraWSPort().somar(2, 3));				
	}

}
