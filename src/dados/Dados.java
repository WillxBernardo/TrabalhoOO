package dados;

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
			System.out.println(i);
			saida = saida + "\n"+ motocicletas[i].getModelo().toString();
		}
		return saida;
	};
	
	public String listar_usuarios() {
		String saida = "***** Lista de Usuários Cadastrados ***** \n" ;
		for(int i = 0; i < nUsuarios; i++) {
			System.out.println(i);
			saida = saida + "\n"+ usuarios[i].getNome().toString();
		}
		return saida;
	};
	public String listar_acessorios() {
		String saida = "***** Lista de Acessórios Cadastrados ***** \n" ;
		for(int i = 0; i < nAcessorios; i++) {
			System.out.println(i);
			saida = saida + "\n"+ acessorios[i].getNome().toString());
		}
		return saida;
	};

	// Buscas
	
	public Motocicleta[] buscar_modelo(String modelo) {};
	public Usuario[] buscar_usuario(String nome) {};
	public Garagem[] buscar_acessorio(String nome) {};
	
	// Teste
	
	public void preencherDados() {
		for(int i = 0; i < 10; i++) {
			String s = String.valueOf(i);
			motocicletas[i] = new Motocicleta("cor".concat(s), 0.0, "modelo".concat(s), "cilindrada".concat(s));
			acessorios[i] = new Acessorio("cor".concat(s), 0.0, "nome".concat(s), "posicao".concat(s));
			usuarios[i] = new Usuario("nome".concat(s), "email".concat(s), "senha".concat(s));
		}
	}
	
}
