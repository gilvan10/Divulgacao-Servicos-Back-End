package projeto.divulgacao.mapper;

import projeto.divulgacao.model.Fotos;
import projeto.divulgacao.model.dto.FotosDTO;
import projeto.divulgacao.model.PrestadorServico;
import projeto.divulgacao.model.dto.PrestadorServicoDTO;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import java.util.List;

@Component
public class FotosMapper {
	
	    public Fotos toEntity(FotosDTO dto) {
		  Fotos entidade = new Fotos();
		  entidade.setIdFoto(dto.getIdFoto());
		  entidade.setCaminhoFoto(dto.getCaminhoFoto());
		  //entidade.setPrestadorServicosIdPrestadorServicos(dto.getPrestadorServicosIdPrestadorServicos());
		  PrestadorServico prestadorServico = new PrestadorServico();
		  prestadorServico.setIdPrestadorServico(dto.getPrestadorServicoDTO().getIdPrestadorServico());
		  prestadorServico.setNome(dto.getPrestadorServicoDTO().getNome());
		  prestadorServico.setEmail(dto.getPrestadorServicoDTO().getEmail());
		  prestadorServico.setSenha(dto.getPrestadorServicoDTO().getSenha());
		  prestadorServico.setProfissao(dto.getPrestadorServicoDTO().getProfissao());
		  prestadorServico.setMensagemDivulgacao(dto.getPrestadorServicoDTO().getMensagemDivulgacao());
		  prestadorServico.setTelefone(dto.getPrestadorServicoDTO().getTelefone());
		  entidade.setPrestadorServico(prestadorServico);
		  //entidade.setPrestadorServico(dto.getPrestadorServico());
		  return entidade;
		}
		
		public FotosDTO toDto(Fotos entidade) {
		  FotosDTO dto = new FotosDTO();
		  dto.setIdFoto(entidade.getIdFoto());
		  dto.setCaminhoFoto(entidade.getCaminhoFoto());
		  //dto.setPrestadorServicosIdPrestadorServicos(entidade.getPrestadorServicosIdPrestadorServicos());
		  PrestadorServicoDTO prestadorServicoDTO = new PrestadorServicoDTO();
		  prestadorServicoDTO.setIdPrestadorServico(entidade.getPrestadorServico().getIdPrestadorServico());
		  prestadorServicoDTO.setNome(entidade.getPrestadorServico().getNome());
		  prestadorServicoDTO.setEmail(entidade.getPrestadorServico().getEmail());
		  prestadorServicoDTO.setSenha(entidade.getPrestadorServico().getSenha());
		  prestadorServicoDTO.setProfissao(entidade.getPrestadorServico().getProfissao());
		  prestadorServicoDTO.setMensagemDivulgacao(entidade.getPrestadorServico().getMensagemDivulgacao());
		  prestadorServicoDTO.setTelefone(entidade.getPrestadorServico().getTelefone());
		  dto.setPrestadorServicoDTO(prestadorServicoDTO);
		  //dto.setPrestadorServicoDTO(entidade.getPrestadorServico());
		  return dto;
		}
		
		public List<FotosDTO> toDto(List<Fotos> lista) {
		  return lista.stream().map(this::toDto).collect(Collectors.toList());
		}

}
