package alvaro.limon.flor.primera_iteracion.spring;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import alvaro.limon.flor.primera_iteracion.spring.repository.Cliente;
import alvaro.limon.flor.primera_iteracion.spring.repository.ClienteRepository;
import alvaro.limon.flor.primera_iteracion.spring.repository.Concesionario;
import alvaro.limon.flor.primera_iteracion.spring.repository.ConcesionarioRepository;
import alvaro.limon.flor.primera_iteracion.spring.repository.SolicitaPrueba;
import alvaro.limon.flor.primera_iteracion.spring.repository.SolicitaPruebaRepository;
import alvaro.limon.flor.primera_iteracion.spring.repository.Vehiculo;
import alvaro.limon.flor.primera_iteracion.spring.repository.VehiculoRepository;



@SpringBootApplication()
public class PrimeraIteracionApplication{


	
	public static void main(String[] args) {
ApplicationContext context = SpringApplication.run(PrimeraIteracionApplication.class, args);
		
		
		ClienteRepository clienteRepo = context.getBean(ClienteRepository.class);
		ConcesionarioRepository concesionarioRepo = context.getBean(ConcesionarioRepository.class);
		VehiculoRepository vehiculoRepo = context.getBean(VehiculoRepository.class);
		SolicitaPruebaRepository solicitaPruebaRepo = context.getBean(SolicitaPruebaRepository.class);
		
		Concesionario concesionario1 = new Concesionario();
		concesionario1.setNombre("Concesionario Martínez");
		concesionario1.setDireccionPostal("Arco del triunfo, avenida de la constitución");
		concesionario1.setEmail("concesionariosmartinez@hotmail.com");
		concesionario1.setHorario("08:00 - 20:00");
		concesionario1.setTelefono(634232546);
		concesionario1.setAnyoApertura(2005);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Paco");
		cliente1.setApellidos("Rodríguez de la Fuente");
		cliente1.setNif("3424242N");
		cliente1.setTelefono(945382312);
		cliente1.setEmail("pacorodriguez@gmail.com");
		cliente1.setFechaDeAlta(LocalDate.of(2021, 05, 13));
		
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setNumeroBastidor(132);
		vehiculo1.setMatricula("4253-HJF");
		vehiculo1.setMarca("BMW");
		vehiculo1.setModelo("Safari");
		vehiculo1.setPotencia(350);
		vehiculo1.setCilindrada(30);
		vehiculo1.setPrecioVenta(40000);
		vehiculo1.setAnyoFabricacion(2012);
		vehiculo1.setConcesionario(concesionario1);
		
		SolicitaPrueba solicitud1 = new SolicitaPrueba();
		solicitud1.setFechaSolicitaPrueba(LocalDate.of(2022, 10, 07));
		solicitud1.setHoraSolicitaPrueba(LocalTime.of(14, 45));
		solicitud1.setRealizacion(true);	
		solicitud1.setCliente(cliente1);
		solicitud1.setVehiculo(vehiculo1);
		
		clienteRepo.save(cliente1);
		concesionarioRepo.save(concesionario1);
		vehiculoRepo.save(vehiculo1);
		solicitaPruebaRepo.save(solicitud1);
	}

	
		
		
	
}
