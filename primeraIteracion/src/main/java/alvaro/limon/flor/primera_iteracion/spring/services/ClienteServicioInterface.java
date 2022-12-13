package alvaro.limon.flor.primera_iteracion.spring.services;

import java.util.List;

import alvaro.limon.flor.primera_iteracion.spring.repository.Cliente;

public interface ClienteServicioInterface {
	
	public List<Cliente> getAllClientes();
	
	public Cliente getClienteByNif();
	
	public void borrarCliente();
	
	public void crearCliente();
	
	public void actualizarCliente();
	
	public void solicitaPrueba();
	
	public void realizaPrueba();
	
	

}
