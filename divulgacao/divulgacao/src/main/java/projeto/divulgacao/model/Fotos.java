package projeto.divulgacao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "fotos")
public class Fotos {
	
	@Id
	@Column(name = "id_foto")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFoto;
	
	@Column(name = "caminho_foto")
	private String caminhoFoto;
	
	@ManyToOne
	@JoinColumn(name = "prestador_servicos_id_prestador_servicos")
	private PrestadorServico prestadorServico;
	
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
	public PrestadorServico getPrestadorServico() {
		return prestadorServico;
	}
	public void setPrestadorServico(PrestadorServico prestadorServico) {
		this.prestadorServico = prestadorServico;
	}
	
}
