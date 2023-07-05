package cl.awakelab.asesoriathymeleaf.servicios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.asesoriathymeleaf.modelos.Capacitacion;
import cl.awakelab.asesoriathymeleaf.repositorios.CapacitacionRepositorio;

@Service
public class CapacitacionServicio {

	@Autowired
	private CapacitacionRepositorio capacitacionRepositorio;
	
	//create
	public Capacitacion crear(Capacitacion c) {
		return capacitacionRepositorio.save(c);
	}
	//read
	public List<Capacitacion> capacitaiones() {
		return capacitacionRepositorio.findAll();
	}
	//update
	// public Capacitacion(String rutCliente, String dia, LocalDate fecha, LocalTime hora, String lugar, float duracion,
	public Capacitacion updateCapacitacion(Long id, String dia, LocalDate fecha, LocalTime hora, String lugar, float duracion) {
		Optional<Capacitacion> optionalCapacitacion = capacitacionRepositorio.findById(id);
		if (optionalCapacitacion.isPresent()) {
			Capacitacion capacitacionToUpdate = optionalCapacitacion.get();
			capacitacionToUpdate.setDia(dia);
			capacitacionToUpdate.setFecha(fecha);
			capacitacionToUpdate.setHora(hora);
			capacitacionToUpdate.setLugar(lugar);
			capacitacionToUpdate.setDuracion(duracion);
			capacitacionRepositorio.save(capacitacionToUpdate);
			return capacitacionToUpdate;
		} else {
			return null;
		}
	}
	
	//delete
	public void delete(Long id) {
		capacitacionRepositorio.deleteById(id);
	}
}
