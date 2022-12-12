package alvaro.limon.flor.primera_iteracion.repository;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SOLICITA_PRUEBA")
public class SolicitaPrueba {

	private Long solicitaPruebaId;

	private LocalDate fechaSolicitaPrueba;

	private LocalTime horaSolicitaPrueba;

	private Boolean realizacion;
	
	private Cliente cliente;
	
	private Vehiculo vehiculo;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_SOLICITA_PRUEBA")
	public Long getSolicitaPruebaId() {
		return solicitaPruebaId;
	}

	public void setSolicitaPruebaId(Long solicitaPruebaId) {
		this.solicitaPruebaId = solicitaPruebaId;
	}

	@Column(name = "FECHA")
	public LocalDate getFechaSolicitaPrueba() {
		return fechaSolicitaPrueba;
	}

	public void setFechaSolicitaPrueba(LocalDate fechaSolicitaPrueba) {
		this.fechaSolicitaPrueba = fechaSolicitaPrueba;
	}

	@Column(name = "HORA")
	public LocalTime getHoraSolicitaPrueba() {
		return horaSolicitaPrueba;
	}

	public void setHoraSolicitaPrueba(LocalTime horaSolicitaPrueba) {
		this.horaSolicitaPrueba = horaSolicitaPrueba;
	}

	@Column(name = "REALIZACION")
	public Boolean getRealizacion() {
		return realizacion;
	}

	public void setRealizacion(Boolean realizacion) {
		this.realizacion = realizacion;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
