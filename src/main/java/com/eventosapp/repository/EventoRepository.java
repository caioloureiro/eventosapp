/*Start - Consultas EVENTO - Gera consultas no Banco de Dados*/
package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventosapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	
	Evento findByCodigo(long codigo);
	
}
/*End - Consultas EVENTO - Gera consultas no Banco de Dados*/