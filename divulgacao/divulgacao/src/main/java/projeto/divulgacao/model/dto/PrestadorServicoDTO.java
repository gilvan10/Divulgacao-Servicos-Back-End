package projeto.divulgacao.model.dto;

public class PrestadorServicoDTO {
	
	private Long idPrestadorServico;
	private String nome;
	private String email;
	private String senha;
	private String profissao;
	private String mensagemDivulgacao;
	private String telefone;
	
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
	
}
