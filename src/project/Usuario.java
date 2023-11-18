package project;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private Garagem garagem;
	
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


	// Métodos específicos da classe
	public String exibir_usuario() {
		return "Nome do usuario: " + nome + ", email: " + email + ", \nValor total da garagem: R$ " + garagem.getValor_total();
	}
	
	public boolean editar_usuario(String nome) {
		return true;
	}
	
	public void adicionar_moto_garagem(Motocicleta motocicleta) {
		garagem.getMotocicletas().add(motocicleta);
		double valor = garagem.getValor_total();
		garagem.setValor_total(valor += motocicleta.getValor());
		int qtd = garagem.getnMotocicletas();
		garagem.setnMotocicletas(qtd++);
	}
	
	public void remover_moto_garagem(int i) {
		if (i < garagem.getnMotocicletas() && i >= 0) {
			garagem.getMotocicletas().remove(i);
			int qtd = garagem.getnMotocicletas();
			garagem.setnMotocicletas(qtd--);
			System.out.println("Motocicleta excluida com sucesso!");
		} else {
			System.out.println("Indice invalido");
		}
	}
}
