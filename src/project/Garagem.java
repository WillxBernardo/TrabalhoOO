package project;

public class Garagem {
	private double valor_total;
	private Usuario usuario;
	private Motocicleta[] motocicletas;
	private String endereco;
	
	// construtor
	
	public Garagem(Usuario usuario, String endereco) {
		this.valor_total = 0.0;
		this.usuario = usuario;
		this.endereco = endereco;
		this.motocicletas = new Motocicleta[0]; 
	}
	
	
	// Gets e sets
	
	public double getValor_total() {
		return valor_total;
	}
	
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Motocicleta[] getMotocicletas() {
		return motocicletas;
	}
	
	public void setMotocicletas(Motocicleta[] motocicletas) {
		this.motocicletas = motocicletas;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	// Métodos especificos da classe
	
	public String exibir_garagem(int id) {
		return "";
	}
	
	public boolean editar_garagem(Motocicleta motocicleta) {
		return true;
	}
	
	public String finalizar_pedido(Garagem garagem) {
		return "Pedido finalizado com sucesso!";
	}
}
