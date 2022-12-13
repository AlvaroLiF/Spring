package alvaro.limon.flor.primera_iteracion.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcesionarioRepository extends JpaRepository<Concesionario, Long>{

	public List<Concesionario> findAll();
}
