/*Start - Consultas CONVIDADO - Gera consultas no Banco de Dados*/
package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventosapp.models.Convidado;
import com.eventosapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
	
}
/*End - Consultas CONVIDADO - Gera consultas no Banco de Dados*/