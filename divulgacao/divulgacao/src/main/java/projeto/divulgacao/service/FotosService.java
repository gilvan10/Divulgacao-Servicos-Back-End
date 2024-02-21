package projeto.divulgacao.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.divulgacao.model.Fotos;
import projeto.divulgacao.model.dto.FotosDTO;
import projeto.divulgacao.mapper.FotosMapper;
import projeto.divulgacao.repository.FotosRepository;
import projeto.divulgacao.repository.PrestadorServicoRepository;
import java.util.List;

@Service
public class FotosService {
	
	final FotosRepository repository;
	final FotosMapper mapper;
	final PrestadorServicoRepository prestadorRepository;
	
	public FotosService(FotosRepository repository, FotosMapper mapper, PrestadorServicoRepository prestadorRepository) {
    	this.repository = repository;	
	    this.mapper = mapper;
	    this.prestadorRepository = prestadorRepository;
	}
	
	@Transactional(readOnly = true)
	public List<FotosDTO> findAll() {
	  List<Fotos> fotos = this.repository.findAll();
	  return this.mapper.toDto(fotos);
	}
	
	@Transactional
	public FotosDTO save(FotosDTO dto) {
	  Fotos fotos = this.mapper.toEntity(dto);
	  this.prestadorRepository.save(fotos.getPrestadorServico());
	  this.repository.save(fotos);
	  return this.mapper.toDto(fotos);
	  
	}

}
