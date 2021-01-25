package br.com.treinaweb.calculadora.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "CalculadoraWSEndpoint", targetNamespace = "http://ws.calculadora.treinaweb.com.br/")
public interface CalculadoraWSEndpoint {

	@WebMethod(operationName = "somar", action = "urn:Somar")
	@WebResult(name = "return")
	int somar(@WebParam(name = "arg0") int n1, @WebParam(name = "arg1") int n2);

}