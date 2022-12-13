package alvaro.limon.flor.primera_iteracion.spring.repository;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICULO")
public class Vehiculo {

	private Long vehiculoId;
	
	private Integer numeroBastidor;
	
	private String matricula;
	
	private String marca;
	
	private String modelo;
	
	private Integer potencia;
	
	private Integer cilindrada;
	
	private Integer precioVenta;
	
	private Integer anyoFabricacion;
	
	private List<SolicitaPrueba> solicitaPrueba;
	
	private Concesionario concesionario;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_VEHICULO")
	public Long getVehiculoId() {
		return vehiculoId;
	}

	public void setVehiculoId(Long vehiculoId) {
		this.vehiculoId = vehiculoId;
	}

	@Column(name = "NUMERO_BASTIDOR")
	public Integer getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(Integer numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	@Column(name = "MATRICULA")
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Column(name = "MARCA")
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Column(name = "MODELO")
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Column(name = "POTENCIA")
	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	@Column(name = "CILINDRADA")
	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Column(name = "PRECIO_VENTA")
	public Integer getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Integer precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Column(name = "ANYO_FABRICACION")
	public Integer getAnyoFabricacion() {
		return anyoFabricacion;
	}

	public void setAnyoFabricacion(Integer anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}

	@OneToMany(mappedBy = "vehiculo")
	public List<SolicitaPrueba> getSolicitaPrueba() {
		return solicitaPrueba;
	}

	public void setSolicitaPrueba(List<SolicitaPrueba> solicitaPrueba) {
		this.solicitaPrueba = solicitaPrueba;
	}

	@ManyToOne
	@JoinColumn(name = "ID_CONCESIONARIO")
	public Concesionario getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}
	
	
	
	
}
