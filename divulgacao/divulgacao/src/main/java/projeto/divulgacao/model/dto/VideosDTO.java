package projeto.divulgacao.model.dto;

public class VideosDTO {
	
	private Long idVideo;
	private String caminhoVideo;
    private PrestadorServicoDTO prestadorServicoDTO;
	
	public Long getIdVideo() {
		return idVideo;
	}
	public void setIdVideo(Long idVideo) {
		this.idVideo = idVideo;
	}
	public String getCaminhoVideo() {
		return caminhoVideo;
	}
	public void setCaminhoVideo(String caminhoVideo) {
		this.caminhoVideo = caminhoVideo;
	}
	public PrestadorServicoDTO getPrestadorServicoDTO() {
		return prestadorServicoDTO;
	}
	public void setPrestadorServicoDTO(PrestadorServicoDTO prestadorServicoDTO) {
		this.prestadorServicoDTO = prestadorServicoDTO;
	}
	
	

}
