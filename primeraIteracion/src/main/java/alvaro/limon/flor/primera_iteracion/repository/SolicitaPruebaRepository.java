package alvaro.limon.flor.primera_iteracion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitaPruebaRepository extends JpaRepository<SolicitaPrueba, Long>{

	public List<SolicitaPrueba> findAll();
}
