package project;

import java.util.ArrayList;

public class Garagem {
	private double valor_total;
	private Usuario usuario;
	private ArrayList<Motocicleta> motocicletas;
	private String endereco;
	
	// construtor
	
	public Garagem(Usuario usuario, String endereco) {
		this.valor_total = 0.0;
		this.usuario = usuario;
		this.endereco = endereco;
		this.motocicletas = new ArrayList<>();
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
	
	public ArrayList<Motocicleta> getMotocicletas() {
		return motocicletas;
	}
	
	public void setMotocicletas(ArrayList<Motocicleta> motocicletas) {
		this.motocicletas = motocicletas;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	// Métodos especificos da classe
	
	public String exibir_garagem() {
		
		String saida = "\nGaragem do usuario: " + usuario.getNome() +
					"\nValor total: R$ " + valor_total + "\nEndereco: " + endereco + "\nLista de motocicletas e acessorios:";
        if (motocicletas != null) {
            for (Motocicleta moto : motocicletas) {
            	String infoAces = moto.getAcessorio() != null ? "\n" + moto.getAcessorio().getNome() + " - R$ " + moto.getAcessorio().getValor(): "";
                saida += "\n" + moto.getModelo() + " - R$ " + moto.getValor() + infoAces;
            }
        }
		return saida;
	}
}
