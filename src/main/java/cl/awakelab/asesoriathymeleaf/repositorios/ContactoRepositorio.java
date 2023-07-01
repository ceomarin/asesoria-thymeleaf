package cl.awakelab.asesoriathymeleaf.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.awakelab.asesoriathymeleaf.modelos.Contacto;

@Repository
public interface ContactoRepositorio extends CrudRepository<Contacto,Long> {

}
