package projeto.divulgacao.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import projeto.divulgacao.model.Videos;

@Repository 
public interface VideosRepository extends JpaRepository<Videos, Long>{

}
