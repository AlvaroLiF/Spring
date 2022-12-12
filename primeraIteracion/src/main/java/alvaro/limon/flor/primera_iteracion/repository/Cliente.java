package alvaro.limon.flor.primera_iteracion.repository;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	private Long clienteId;
	
	private String nif;
	
	private String nombre;
	
	private String apellidos;
	
	private Integer telefono;
	
	private String email;
	
	private LocalDate fechaDeAlta;
	
	private List<SolicitaPrueba> solicitaPrueba;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CLIENTE")
	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	@Column(name = "NIF")
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "APELLIDOS")
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name = "TELEFONO")
	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "FECHA_ALTA")
	public LocalDate getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(LocalDate fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	public List<SolicitaPrueba> getSolicitaPrueba() {
		return solicitaPrueba;
	}

	public void setSolicitaPrueba(List<SolicitaPrueba> solicitaPrueba) {
		this.solicitaPrueba = solicitaPrueba;
	}
	
	
}
