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
	
	public void excluir_usuario(int i) {
		if (i < nUsuarios && i >= 0) {
			usuarios.remove(i);
			nUsuarios -= 1;
			System.out.println("Usuario excluido com sucesso!");
		} else {
			System.out.println("Indice invalido");
		}
	}
	
	public void excluir_moto(int i) {
		if (i < nMotocicletas && i >= 0) {
			motocicletas.remove(i);
			nMotocicletas -= 1;
			System.out.println("Motocicleta excluida com sucesso!");
		} else {
			System.out.println("Indice invalido");
		}
	}
	
	public void excluir_acessorios(int i) {
		if (i < nAcessorios && i >= 0) {
			acessorios.remove(i);
			nAcessorios -= 1;
			System.out.println("Acessorio excluido com sucesso!");
		} else {
			System.out.println("Indice invalido");
		}
	}
	
	
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
		String saida = "***** Lista de Usuarios Cadastrados ***** \n" ;
		if (usuarios != null) {
            for (Usuario user : usuarios) {
                saida += "\nNome do usuario: " + user.getNome();
            }
        }
		return saida;
	};
	
	public String listar_acessorios() {
		String saida = "***** Lista de Acessorios Cadastrados ***** \n" ;
		if (acessorios != null) {
            for (Acessorio aces : acessorios) {
                saida += "\nMotocicleta: " + aces.getNome() + ", preco: R$ " + aces.getValor();
            }
        }
		return saida;
	};

	// Buscas
	
	public Motocicleta buscar_modelo(String modelo) {
		int indice = 0;
		for(Motocicleta moto: motocicletas) {
			if (modelo.equals(moto.getModelo())) {
				indice = motocicletas.indexOf(moto);
			}
		}
		return motocicletas.get(indice);
	};
	
	public Usuario buscar_usuario(String nome) {
		int indice = 0;
		for(Usuario user: usuarios) {
			if (nome.equals(user.getNome())) {
				indice = usuarios.indexOf(user);
			}
		}
		return usuarios.get(indice);
	};
	
	public Acessorio buscar_acessorio(String nome){
		int indice = 0;
		for(Acessorio aces: acessorios) {
			if (nome.equals(aces.getNome())) {
				indice = acessorios.indexOf(aces);
			}
		}
		return acessorios.get(indice);
	};
	
	// Preenchimentos de dados
	
	public void preencherDados() {
		for(int i = 0; i < 10; i++) {
			String s = String.valueOf(i);
			// Motocicletas
			motocicletas.add(new Motocicleta("cor".concat(s), 1000.0, "modelo".concat(s), "cilindrada".concat(s)));
			nMotocicletas ++;
			
			// Acessorios
			acessorios.add(new Acessorio("cor".concat(s), 0.0, "nome".concat(s), "posicao".concat(s))) ;
			nAcessorios ++;
			
			// Criação do usuario com a garagem
			Usuario user = new Usuario("nome".concat(s), "email".concat(s), "senha".concat(s));
			usuarios.add(user);
			
			nUsuarios ++;
			Garagem gar = new Garagem(user, "endereco".concat(s));
			user.setGaragem(gar);
			
		}
	}
}
