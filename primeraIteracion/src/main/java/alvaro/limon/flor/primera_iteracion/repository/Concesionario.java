package alvaro.limon.flor.primera_iteracion.repository;

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
@Table(name = "CONCESIONARIO")
public class Concesionario {
	
	private Long concesionarioId;
	
	private String nombre;
	
	private String direccionPostal;
	
	private String email;
	
	private String horario;
	
	private Integer telefono;
	
	private Integer anyoApertura;
	
	private List<Vehiculo> vehiculo;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CONCESIONARIO")
	public Long getConcesionarioId() {
		return concesionarioId;
	}

	public void setConcesionarioId(Long concesionarioId) {
		this.concesionarioId = concesionarioId;
	}

	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "DIRECCION_POSTAL")
	public String getDireccionPostal() {
		return direccionPostal;
	}

	public void setDireccionPostal(String direccionPostal) {
		this.direccionPostal = direccionPostal;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "HORARIO")
	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Column(name = "TELEFONO")
	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	@Column(name = "ANYO_APERTURA")
	public Integer getAnyoApertura() {
		return anyoApertura;
	}

	public void setAnyoApertura(Integer anyoApertura) {
		this.anyoApertura = anyoApertura;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vehiculo")
	public List<Vehiculo> getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(List<Vehiculo> vehiculo) {
		this.vehiculo = vehiculo;
	}

	
}
