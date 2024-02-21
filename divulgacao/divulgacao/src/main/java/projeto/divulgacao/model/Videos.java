package projeto.divulgacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "videos")
public class Videos {
	
	@Id
	@Column(name = "id_video")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVideo;
	
	@Column(name = "caminho_video")
	private String caminhoVideo;
	
	@ManyToOne
	@JoinColumn(name = "prestador_servicos_id_prestador_servicos")
	private PrestadorServico prestadorServico;
	
	/*@ManyToOne
	@JoinColumn(name = "id_prestador_servicos")
	private Long prestadorServicosIdPrestadorServicos;*/
	
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
	public PrestadorServico getPrestadorServico() {
		return prestadorServico;
	}
	public void setPrestadorServico(PrestadorServico prestadorServico) {
		this.prestadorServico = prestadorServico;
	}
	/*public Long getPrestadorServicosIdPrestadorServicos() {
		return prestadorServicosIdPrestadorServicos;
	}
	public void setPrestadorServicosIdPrestadorServicos(Long prestadorServicosIdPrestadorServicos) {
		this.prestadorServicosIdPrestadorServicos = prestadorServicosIdPrestadorServicos;
	}*/
	
	
	

}
