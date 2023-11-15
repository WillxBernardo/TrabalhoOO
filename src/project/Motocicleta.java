package project;

public class Motocicleta extends Produto{
	private String modelo;
	private String cilindrada;
	private Acessorio acessorio;
	
	// Construtor
	public Motocicleta(String cor, double valor, String modelo, String cilindrada) {
		super();
		this.cor = cor;
		this.valor = valor;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.acessorio = null;

	}
	
	// Gets e sets
	
    public String getModelo() {
        return modelo;
    }
    
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public Acessorio getAcessorios() {
		return acessorio;
	}
	
	public void setAcessorio(Acessorio acessorios) {
		this.acessorio = acessorios;
	}
	
	
	// Métodos específicos da classe 
	
	// to String
	public String exibir_moto() {
		return "Modelo: " + modelo + ", preço: R$ " + valor + ", cor: " + cor + ", cilindrada: " + cilindrada + ", acessorios: " + acessorio;
	}
	
	public boolean editar_moto(String modelo) {
		return true;
	}
	
	public void adicionar_moto_garagem(String modelo, String cilindradas, String cor, double valor, String id) {
		// método para calcular automaticamente o valor total
	}
	
}
