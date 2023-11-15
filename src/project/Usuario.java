package project;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private Garagem garagem;
	private String endereco;
	
	// Construtor
	
	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.garagem = null;
	}

	// Gets e sets
	
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

	public Garagem getGaragem() {
		return garagem;
	}

	public void setGaragem(Garagem garagem) {
		this.garagem = garagem;
	}

	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// Métodos específicos da classe
	public String exibir_usuario(String nome) {
		return "Nome do usuário: " + nome + ", email: " + email + ", Motos na garagem: " + garagem + ", endereço: " + endereco;
	} 	
	
	public boolean editar_usuario(String nome) {
		return true;
	} 
}
