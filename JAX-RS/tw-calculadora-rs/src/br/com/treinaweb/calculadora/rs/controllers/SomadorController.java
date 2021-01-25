package br.com.treinaweb.calculadora.rs.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.treinaweb.calculadora.rs.dtos.ResultadoDTO;

@Path("/somador")
public class SomadorController {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("{n1}/{n2}")
	public Response somar(@PathParam("n1") int n1,@ PathParam("n2") int n2) {
		ResultadoDTO resultado = new ResultadoDTO();
		resultado.setResultado(n1 + n2);
		GenericEntity<ResultadoDTO> res = new GenericEntity<ResultadoDTO>(resultado, ResultadoDTO.class);
		return Response.status(200).entity(res).build();
	}
}
