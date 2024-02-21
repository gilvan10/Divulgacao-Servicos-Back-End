package projeto.divulgacao.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "prestador_servicos")
public class PrestadorServico {
	
	//IDENTITY DESIGNA PARA O BANCO DE DADOS GERAR O ID AUTOINCREMENTO
	@Id
	@Column(name = "id_prestador_servicos")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPrestadorServico;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "profissao")
	private String profissao;
	
	@Column(name = "mensagem_divulgacao")
	private String mensagemDivulgacao;
	
	@Column(name = "telefone")
	private String telefone;
	
	@OneToMany(mappedBy = "prestadorServico")
	private List<Fotos> fotos = new ArrayList<>();
	
	@OneToMany(mappedBy = "prestadorServico")
	private List<Videos> videos = new ArrayList<>();
	
	public Long getIdPrestadorServico() {
		return idPrestadorServico;
	}
	public void setIdPrestadorServico(Long idPrestadorServico) {
		this.idPrestadorServico = idPrestadorServico;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getMensagemDivulgacao() {
		return mensagemDivulgacao;
	}
	public void setMensagemDivulgacao(String mensagemDivulgacao) {
		this.mensagemDivulgacao = mensagemDivulgacao;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public List<Fotos> getFotos() {
		return fotos;
	}
	public void setFotos(Fotos foto) {
		this.fotos.add(foto);
	}
	public List<Videos> getVideos() {
		return videos;
	}
	public void setVideos(Videos video) {
		this.videos.add(video);
	}
	    
}
