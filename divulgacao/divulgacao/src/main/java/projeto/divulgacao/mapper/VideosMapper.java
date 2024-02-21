package projeto.divulgacao.mapper;

import projeto.divulgacao.model.PrestadorServico;
import projeto.divulgacao.model.Videos;
import projeto.divulgacao.model.dto.PrestadorServicoDTO;
import projeto.divulgacao.model.dto.VideosDTO;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import java.util.List;

@Component
public class VideosMapper {
	
	public Videos toEntity(VideosDTO dto) {
	  Videos entidade = new Videos();
	  entidade.setIdVideo(dto.getIdVideo());
	  entidade.setCaminhoVideo(dto.getCaminhoVideo());
	  //entidade.setPrestadorServicosIdPrestadorServicos(dto.getPrestadorServicosIdPrestadorServicos());
	  //entidade.getPrestadorServico()(dto.getPrestadorServico()());
	  PrestadorServico prestadorServico = new PrestadorServico();
	  prestadorServico.setIdPrestadorServico(dto.getPrestadorServicoDTO().getIdPrestadorServico());
	  prestadorServico.setNome(dto.getPrestadorServicoDTO().getNome());
	  prestadorServico.setEmail(dto.getPrestadorServicoDTO().getEmail());
	  prestadorServico.setSenha(dto.getPrestadorServicoDTO().getSenha());
	  prestadorServico.setProfissao(dto.getPrestadorServicoDTO().getProfissao());
	  prestadorServico.setMensagemDivulgacao(dto.getPrestadorServicoDTO().getMensagemDivulgacao());
	  prestadorServico.setTelefone(dto.getPrestadorServicoDTO().getTelefone());
	  entidade.setPrestadorServico(prestadorServico);
	  return entidade;
	}
	
	public VideosDTO toDto(Videos entidade) {
	  VideosDTO dto = new VideosDTO();
	  dto.setIdVideo(entidade.getIdVideo());
	  dto.setCaminhoVideo(entidade.getCaminhoVideo());
	  //dto.setPrestadorServicosIdPrestadorServicos(entidade.getPrestadorServicosIdPrestadorServicos());
	  //dto.getPrestadorServico(entidade.getPrestadorServico());
	  PrestadorServicoDTO prestadorServicoDTO = new PrestadorServicoDTO();
	  prestadorServicoDTO.setIdPrestadorServico(entidade.getPrestadorServico().getIdPrestadorServico());
	  prestadorServicoDTO.setNome(entidade.getPrestadorServico().getNome());
	  prestadorServicoDTO.setEmail(entidade.getPrestadorServico().getEmail());
	  prestadorServicoDTO.setSenha(entidade.getPrestadorServico().getSenha());
	  prestadorServicoDTO.setProfissao(entidade.getPrestadorServico().getProfissao());
	  prestadorServicoDTO.setMensagemDivulgacao(entidade.getPrestadorServico().getMensagemDivulgacao());
	  prestadorServicoDTO.setTelefone(entidade.getPrestadorServico().getTelefone());
	  dto.setPrestadorServicoDTO(prestadorServicoDTO);
	  return dto;
	}
	
	public List<VideosDTO> toDto(List<Videos> lista) {
	  return lista.stream().map(this::toDto).collect(Collectors.toList());
	}

}
