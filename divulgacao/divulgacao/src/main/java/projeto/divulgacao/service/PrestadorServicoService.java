package projeto.divulgacao.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.divulgacao.model.PrestadorServico;
import projeto.divulgacao.model.dto.PrestadorServicoDTO;
import projeto.divulgacao.mapper.PrestadorServicoMapper;
import projeto.divulgacao.repository.PrestadorServicoRepository;
import java.util.List;

@Service
public class PrestadorServicoService {
	
	final PrestadorServicoRepository repository;
	final PrestadorServicoMapper mapper;
	
	public PrestadorServicoService(PrestadorServicoRepository repository, PrestadorServicoMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	@Transactional(readOnly = true )
	public List<PrestadorServicoDTO> findAll() {
		List<PrestadorServico> prestadoresServicos = this.repository.findAll();
		return this.mapper.toDto(prestadoresServicos);
	}

	@Transactional
	public PrestadorServicoDTO save(PrestadorServicoDTO dto) {
		PrestadorServico prestadorServico = this.mapper.toEntity(dto);
		this.repository.save(prestadorServico);
		return this.mapper.toDto(prestadorServico);
	}

}
