package projeto.divulgacao.model.dto;

public class FotosDTO {
	
	private Long idFoto;
	private String caminhoFoto;
	private PrestadorServicoDTO prestadorServicoDTO;
	
	public Long getIdFoto() {
		return idFoto;
	}
	public void setIdFoto(Long idFoto) {
		this.idFoto = idFoto;
	}
	public String getCaminhoFoto() {
		return caminhoFoto;
	}
	public void setCaminhoFoto(String caminhoFoto) {
		this.caminhoFoto = caminhoFoto;
	}
	public PrestadorServicoDTO getPrestadorServicoDTO() {
		return prestadorServicoDTO;
	}
	public void setPrestadorServicoDTO(PrestadorServicoDTO prestadorServicoDTO) {
		this.prestadorServicoDTO = prestadorServicoDTO;
	}
	
}
