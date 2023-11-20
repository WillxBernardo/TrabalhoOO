package dados;
	
import project.*;
import java.util.ArrayList;

public class Dados {
	private ArrayList<Motocicleta> motocicletas;
	private ArrayList<Acessorio> acessorios;
	private ArrayList<Usuario> usuarios;
	
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

	public ArrayList<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(ArrayList<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	
	// Métodos especificos da classe
	
	public void excluir_usuario(int i) {
		usuarios.remove(i);
	}
	
	public void excluir_moto(int i) {
		motocicletas.remove(i);
	}
	
	public void excluir_acessorios(int i) {
		acessorios.remove(i);
	}
	
	public void adicionar_acessorio_moto(Acessorio aces, Motocicleta moto) {
		int pos = motocicletas.indexOf(moto);
		motocicletas.get(pos).setAcessorio(aces);
		double valor_aces = aces.getValor();
		double valor_moto = moto.getValor();
 		moto.setValor(valor_moto += valor_aces);
	}
	
	public void remover_acessorio_moto(Acessorio aces, Motocicleta moto) {
		int pos = motocicletas.indexOf(moto);
		motocicletas.get(pos).setAcessorio(null);
		double valor_aces = aces.getValor();
		double valor_moto = moto.getValor();
 		moto.setValor(valor_moto -= valor_aces);
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
                saida += "\nAcessorio: " + aces.getNome() + ", preco: R$ " + aces.getValor();
            }
        }
		return saida;
	};

	// Buscas
	
	public Motocicleta buscar_modelo(String modelo) {
		for(Motocicleta moto: motocicletas) {
			if (modelo.equals(moto.getModelo())) {
				return moto;
			}
		}
		return null;
	}
	
	public Usuario buscar_usuario(String nome) {
		for(Usuario user: usuarios) {
			if (nome.equals(user.getNome())) {
				return user;
			}
		}
		return null;
	}
	
	public Acessorio buscar_acessorio(String nome){
		for(Acessorio aces: acessorios) {
			if (nome.equals(aces.getNome())) {
				return aces;
			}
		}
		return null;
	};
	
	// Preenchimentos de dados
	
	
	public void preencherDados() {

		for(int i = 0; i < 10; i++) {
			String s = String.valueOf(i);
			
			// Usuario e garagem
			
			Usuario user = new Usuario("nome".concat(s), "email".concat(s), "senha".concat(s));
			usuarios.add(user);
			Garagem gar = new Garagem(user, "endereco".concat(s));
			user.setGaragem(gar);
			
			//Motociclea e acessorio
			
			Motocicleta moto = new Motocicleta("cor".concat(s), 1000.0, "modelo".concat(s), "cilindrada".concat(s));
	        Acessorio aces = new Acessorio("cor".concat(s), 10.0, "nome".concat(s), "posicao".concat(s));
			acessorios.add(aces);
	        motocicletas.add(moto);
	        adicionar_acessorio_moto(aces, moto);
	        
		}	
	}
}
