package dados;
	
import project.*;
import java.util.ArrayList;

public class Dados {
	private ArrayList<Motocicleta> motocicletas;
	private int nMotocicletas = 0;
	private ArrayList<Acessorio> acessorios;
	private int nAcessorios = 0;
	private ArrayList<Usuario> usuarios;
	private int nUsuarios = 0;
	
	// Construtor
	
	public Dados() {
		motocicletas = new ArrayList<>();
		acessorios = new ArrayList<>();
		usuarios = new ArrayList<>();
	}
	
	// Gets e sets
	
	public ArrayList<Motocicleta> getMotocicletas() {
		return motocicletas;
	}

	public void setMotocicletas(ArrayList<Motocicleta> motocicletas) {
		this.motocicletas = motocicletas;
	}

	public int getnMotocicletas() {
		return nMotocicletas;
	}

	public void setnMotocicletas(int nMotocicletas) {
		this.nMotocicletas = nMotocicletas;
	}

	public ArrayList<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(ArrayList<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public int getnAcessorios() {
		return nAcessorios;
	}

	public void setnAcessorios(int nAcessorios) {
		this.nAcessorios = nAcessorios;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
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
        if (motocicletas != null) {
            for (Motocicleta moto : motocicletas) {
                saida += "\nMotocicleta: " + moto.getModelo();
            }
        }
		return saida;
		
	};
	
	public String listar_usuarios() {
		String saida = "***** Lista de Usuários Cadastrados ***** \n" ;
		if (usuarios != null) {
            for (Usuario user : usuarios) {
                saida += "\nNome do usuario: " + user.getNome();
            }
        }
		return saida;
	};
	
	public String listar_acessorios() {
		String saida = "***** Lista de Acessórios Cadastrados ***** \n" ;
		if (acessorios != null) {
            for (Acessorio aces : acessorios) {
                saida += "\nMotocicleta: " + aces.getNome() + ", preco: R$ " + aces.getValor();
            }
        }
		return saida;
	};

	// Buscas
	
	public String buscar_modelo(String modelo) {
		String saida = "";
		for(Motocicleta moto: motocicletas) {
			if (modelo.equals(moto.getModelo())) {
				saida = moto.exibir_moto();
			}
		}
		return saida;
	};
	
	public String buscar_usuario(String nome) {
		String saida = "";
		for(Usuario user: usuarios) {
			if (nome.equals(user.getNome())) {
				saida = user.exibir_usuario();
			}
		}
		return saida;
	};
	
	public String buscar_acessorio(String nome){
		String saida = "";
		for(Acessorio aces: acessorios) {
			if (nome.equals(aces.getNome())) {
				saida = aces.exibir_acessorio();
			}
		}
		return saida;
	};
	
	// Preenchimentos de dados
	
	public void preencherDados() {
		for(int i = 0; i < 10; i++) {
			String s = String.valueOf(i);
			motocicletas.add(new Motocicleta("cor".concat(s), 1000.0, "modelo".concat(s), "cilindrada".concat(s)));
			acessorios.add(new Acessorio("cor".concat(s), 0.0, "nome".concat(s), "posicao".concat(s))) ;
			usuarios.add(new Usuario("nome".concat(s), "email".concat(s), "senha".concat(s)));
		}
	}
}
