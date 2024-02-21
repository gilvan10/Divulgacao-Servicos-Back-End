package projeto.divulgacao.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.divulgacao.model.Videos;
import projeto.divulgacao.model.dto.VideosDTO;
import projeto.divulgacao.mapper.VideosMapper;
import projeto.divulgacao.repository.VideosRepository;
import projeto.divulgacao.repository.PrestadorServicoRepository;
import java.util.List;

@Service
public class VideosService {
	
	final VideosRepository repository;
	final VideosMapper mapper;
	final PrestadorServicoRepository prestadorRepository;
	
	public VideosService(VideosRepository repository, VideosMapper mapper, PrestadorServicoRepository prestadorRepository) {
    	this.repository = repository;	
	    this.mapper = mapper;
	    this.prestadorRepository = prestadorRepository;
	}
	
	@Transactional(readOnly = true)
	public List<VideosDTO> findAll() {
	  List<Videos> videos = this.repository.findAll();
	  return this.mapper.toDto(videos);
	}
	
	@Transactional
	public VideosDTO save(VideosDTO dto) {
	  Videos videos = this.mapper.toEntity(dto);
	  this.prestadorRepository.save(videos.getPrestadorServico());
	  this.repository.save(videos);
	  return this.mapper.toDto(videos);
	  
	}

}
