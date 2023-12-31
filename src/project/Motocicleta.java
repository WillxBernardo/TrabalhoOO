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
	
	public Acessorio getAcessorio() {
		return acessorio;
	}
	
	public void setAcessorio(Acessorio acessorio) {
		this.acessorio = acessorio;
	}
	
	// Métodos específicos da classe 
	
	public String exibir_moto() {
		  String infoAces = acessorio != null ? ", acessorio: " + acessorio.getNome() : ", sem acessorio";
		return "Modelo: " + modelo + ", preco: R$ " + valor + ", cor: " + cor + ", cilindrada: " + cilindrada + infoAces;
	}
}
