package cl.awakelab.asesoriathymeleaf.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.awakelab.asesoriathymeleaf.modelos.Capacitacion;

@Repository
public interface CapacitacionRepositorio extends CrudRepository<Capacitacion, Long>{
	
	//create
	
	//read
	List<Capacitacion> findAll();
	//update
	
	//delete
}
