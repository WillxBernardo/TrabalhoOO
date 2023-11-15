package dados;
	
import project.*;

public class Dados {
	private Motocicleta[] motocicletas;
	private int nMotocicletas = 0;
	private Acessorio[] acessorios;
	private int nAcessorios = 0;
	private Usuario[] usuarios;
	private int nUsuarios = 0;
	
	// Construtor
	
	public Dados() {
		motocicletas = new Motocicleta[100];
		acessorios = new Acessorio[100];
		usuarios = new Usuario[200];
	}
	
	// Gets e sets
	
	public Motocicleta[] getMotocicletas() {
		return motocicletas;
	}

	public void setMotocicletas(Motocicleta[] motocicletas) {
		this.motocicletas = motocicletas;
	}

	public int getnMotocicletas() {
		return nMotocicletas;
	}

	public void setnMotocicletas(int nMotocicletas) {
		this.nMotocicletas = nMotocicletas;
	}

	public Acessorio[] getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(Acessorio[] acessorios) {
		this.acessorios = acessorios;
	}

	public int getnAcessorios() {
		return nAcessorios;
	}

	public void setnAcessorios(int nAcessorios) {
		this.nAcessorios = nAcessorios;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}

	public int getnUsuarios() {
		return nUsuarios;
	}

	public void setnUsuarios(int nUsuarios) {
		this.nUsuarios = nUsuarios;
	}
	
	
	// Métodos especificos da classe
	
	public void excluir_usuario(String nome) {}
	public void excluir_moto(String modelo) {}
	public void excluir_acessorios(String nome) {}
	
	
	// Listagens
	
	public String listar_motos() {
		String saida = "***** Lista de Motocicletas Cadastradas ***** \n" ;
		for(int i = 0; i < nMotocicletas; i++) {
			saida = saida + "\n"+ motocicletas[i].exibir_moto();
		}
		return saida;
	};
	
	public String listar_usuarios() {
		String saida = "***** Lista de Usuários Cadastrados ***** \n" ;
		for(int i = 0; i < nUsuarios; i++) {
			saida = saida + "\n"+ usuarios[i].exibir_usuario();
		}
		return saida;
	};
	public String listar_acessorios() {
		String saida = "***** Lista de Acessórios Cadastrados ***** \n" ;
		for(int i = 0; i < nAcessorios; i++) {
			saida = saida + "\n"+ acessorios[i].exibir_acessorio();
		}
		return saida;
	};

	// Buscas
	
	public String buscar_modelo(String modelo) {
		String saida = "***** Modelos de moto com nome: {} ***** \n" ;
		for(int i = 0; i < nMotocicletas; i++) {
			if (modelo.equals(motocicletas[i].getModelo())) {
				saida = saida + "\n"+ motocicletas[i].exibir_moto();
			}
		}
		return saida;
	};
	public String buscar_usuario(String nome) {
		String saida = "***** Usários com nome: {} ***** \n" ;
		for(int i = 0; i < nUsuarios; i++) {
			if (nome.equals(usuarios[i].getNome())) {
				saida = saida + "\n"+ usuarios[i].exibir_usuario();
			}
		}
		return saida;
	};
	
	public String buscar_acessorio(String nome){
		String saida = "***** Acessórios com nome: {} ***** \n";
		for(int i = 0; i < nAcessorios; i++) {
			if (nome.equals(acessorios[i].getNome())) {
				saida = saida + "\n"+ acessorios[i].exibir_acessorio();
			}
		}
		return saida;
	};
	
	
	// Teste
	
	public void preencherDados() {
		for(int i = 0; i < 10; i++) {
			String s = String.valueOf(i);
			motocicletas[i] = new Motocicleta("cor".concat(s), 0.0, "modelo".concat(s), "cilindrada".concat(s));
			acessorios[i] = new Acessorio("cor".concat(s), 0.0, "nome".concat(s), "posicao".concat(s));
			usuarios[i] = new Usuario("nome".concat(s), "email".concat(s), "senha".concat(s));
		}
	}
	//é o marcos de novo
}
//é o marcos