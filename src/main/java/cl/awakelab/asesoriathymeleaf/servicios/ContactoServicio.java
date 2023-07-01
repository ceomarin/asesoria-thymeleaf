package cl.awakelab.asesoriathymeleaf.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.asesoriathymeleaf.modelos.Contacto;
import cl.awakelab.asesoriathymeleaf.repositorios.ContactoRepositorio;
@Service
public class ContactoServicio {

	@Autowired
	private ContactoRepositorio contactoRepositorio;
	
	public Contacto crearContacto(Contacto c) {
		return contactoRepositorio.save(c);
	}
}
