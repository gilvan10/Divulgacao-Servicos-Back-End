package projeto.divulgacao.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import projeto.divulgacao.model.PrestadorServico;

@Repository
public interface PrestadorServicoRepository extends JpaRepository<PrestadorServico, Long> {	
	
}
