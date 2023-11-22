package project;

public class Acessorio extends Produto {
	private String nome;
	private String posicao;
	
	// Construtor
	
	public Acessorio(String cor, double valor, String nome, String posicao) {
		super();
		this.cor = cor;
		this.valor = valor;
		this.nome = nome;
		this.posicao = posicao;
	}
	
	// Gets e sets
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	
	// Métodos específicos da classe
	
	public String exibir_acessorio() {
		return "Nome do acessorio: " + nome + ", preco: R$ " + valor + ", cor: " + cor + ", posicao: " + posicao;
	}
}
