package cl.awakelab.asesoriathymeleaf.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.asesoriathymeleaf.modelos.Contacto;
import cl.awakelab.asesoriathymeleaf.servicios.ContactoServicio;

@Controller
public class MainControlador {
	
	@Autowired
	private ContactoServicio contactoServicio;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/contacto",method=RequestMethod.GET)
	public String contacto(@ModelAttribute("contacto")Contacto contacto) {
		return "contacto";
	}
	
	@RequestMapping(value="/contacto",method=RequestMethod.POST)
	public String crearContacto(@Valid @ModelAttribute("contacto")Contacto contacto,BindingResult resultado) {
		if (resultado.hasErrors()) {
            return "/views/contacto";
        } else {
            contactoServicio.crearContacto(contacto);
            return "redirect:/";
        }
	}
	
	
	@RequestMapping(value="/capacitacion",method=RequestMethod.GET)
	public String capacitacion() {
		return "capacitacion";
	}
	@RequestMapping(value="/capacitacion",method=RequestMethod.POST)
	public String crearCapacitacion() {
		return "capacitacion";
	}
}
