package br.com.cresol.desafio.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import br.com.cresol.desafio.dto.SimulacaoEmprestimo;
import br.com.cresol.desafio.dto.SimularEmprestimoPayload;
import br.com.cresol.desafio.service.EmprestimoService;
import io.swagger.annotations.Api;

/**
 * @author evandro
 *
 */
@Api
@Path("/emprestimo")
public class EmprestimoResource {
	
	@POST
	@Path("/simular")
	public SimulacaoEmprestimo simular(SimularEmprestimoPayload payload) {
		return new EmprestimoService().simular(payload);
	}

	@GET
	@Path("/teste")
	public String teste() {
		return "Testado";
	}

}
