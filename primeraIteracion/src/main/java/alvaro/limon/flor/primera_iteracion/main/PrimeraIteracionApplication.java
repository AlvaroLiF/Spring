package alvaro.limon.flor.primera_iteracion.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import alvaro.limon.flor.primera_iteracion.repository.Cliente;
import alvaro.limon.flor.primera_iteracion.repository.Concesionario;
import alvaro.limon.flor.primera_iteracion.repository.SolicitaPrueba;
import alvaro.limon.flor.primera_iteracion.repository.Vehiculo;

@SpringBootApplication
public class PrimeraIteracionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PrimeraIteracionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Concesionario concesionario1 = new Concesionario();
		concesionario1.setNombre("Concesionario Mercedes");
		
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setCilindrada(42);
		
		Cliente cliente1 = new Cliente();
		cliente1.setApellidos("fwfwf");
		
		SolicitaPrueba solicitaPrueba1 = new SolicitaPrueba();
		solicitaPrueba1.setRealizacion(true);
		
		
		
		
		
		
		
		
		
		
		
	}
}
