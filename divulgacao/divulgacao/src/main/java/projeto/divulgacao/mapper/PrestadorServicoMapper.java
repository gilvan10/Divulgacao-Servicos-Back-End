package projeto.divulgacao.mapper;

import projeto.divulgacao.model.PrestadorServico;
import projeto.divulgacao.model.dto.PrestadorServicoDTO;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import java.util.List;

@Component
public class PrestadorServicoMapper {
	
	public PrestadorServico toEntity(PrestadorServicoDTO dto) {
		PrestadorServico entidade = new PrestadorServico();
		entidade.setIdPrestadorServico(dto.getIdPrestadorServico());
		entidade.setNome(dto.getNome());
		entidade.setEmail(dto.getEmail());
		entidade.setSenha(dto.getSenha());
		entidade.setProfissao(dto.getProfissao());
		entidade.setMensagemDivulgacao(dto.getMensagemDivulgacao());
		entidade.setTelefone(dto.getTelefone());
		return entidade;
	}
	
	public PrestadorServicoDTO toDto(PrestadorServico entidade) {
		PrestadorServicoDTO dto = new PrestadorServicoDTO();
		dto.setIdPrestadorServico(entidade.getIdPrestadorServico());
		dto.setNome(entidade.getNome());
		dto.setEmail(entidade.getEmail());
		dto.setSenha(entidade.getSenha());
		dto.setProfissao(entidade.getProfissao());
		dto.setMensagemDivulgacao(entidade.getMensagemDivulgacao());
		dto.setTelefone(entidade.getTelefone());
		return dto;
	}
	
	public List<PrestadorServicoDTO> toDto(List<PrestadorServico> lista) {
		return lista.stream().map(this::toDto).collect(Collectors.toList());
	}

}
