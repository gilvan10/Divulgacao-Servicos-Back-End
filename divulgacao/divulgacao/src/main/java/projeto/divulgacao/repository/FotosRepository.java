package projeto.divulgacao.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import projeto.divulgacao.model.Fotos;

@Repository
public interface FotosRepository extends JpaRepository<Fotos, Long>{

}
