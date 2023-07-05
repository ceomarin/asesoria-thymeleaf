package cl.awakelab.asesoriathymeleaf.modelos;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="capacitaciones")
public class Capacitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rutCliente;					
	private String dia;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate fecha;
	@DateTimeFormat(pattern = "h:mm a")
	private LocalTime hora;
	private String lugar;
	private float duracion;
	private int asistentes;
	
	public Capacitacion() {
	}
	public Capacitacion(String rutCliente, String dia, LocalDate fecha, LocalTime hora, String lugar, float duracion,
			int asistentes) {
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.asistentes = asistentes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	public int getAsistentes() {
		return asistentes;
	}
	public void setAsistentes(int asistentes) {
		this.asistentes = asistentes;
	}
	
	
}
