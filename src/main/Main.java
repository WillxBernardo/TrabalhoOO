package main;

import java.util.*;
import project.*;
import dados.*;

public class Main {
	
	private static Dados d = new Dados();
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int op = -1;
		int aux;
		d.preencherDados();

		// Execução do menu

		while(op != 0) {
			System.out.print(imprimirMenu());
			op = in.nextInt();
			 switch (op) {
			 	case 0:
			 		System.out.println("Obrigado por utilizar o sistema!");
			 		break;
				case 1:
					int op1 = -1;
					while(op1 != 0) {
						System.out.println(imprimirMenuMoto());
						op1 = in.nextInt();
						 switch (op1) {
						 	case 0:
						 		break;
						 	case 1:
						 		cadastrarMoto();
						 		break;
						 	case 2:
						 		removerMoto();
						 		break;
						 	case 3:
						 		editarMoto();
						 		break;
						 	case 4:
						 		System.out.println(d.listar_motos());
						 		break;
						 	case 5:
						 		adicionarMotoGaragem();
						 		break;
						 		
						 }
					}
					break;
				case 2:
					int op2 = -1;
					while(op2 != 0) {
						System.out.println(imprimirMenuUser());
						op2 = in.nextInt();
						 switch (op2) {
						 	case 0:
						 		break;
						 	case 1:
						 		cadastrarUser();
						 		break;
						 	case 2:
						 		removerUser();
						 		break;
						 	case 3:
						 		editarUser();
						 		break;
						 	case 4:
						 		System.out.println(d.listar_usuarios());
						 		break;
						 	case 5:
						 		exibirGaragem();
						 		break;
						 	case 6:
						 		editarEndGaragem();
						 		break;
						 	case 7:
						 		removerMotoGaragem();
						 		break;
						 	case 8:
						 		removerAcesMoto();
						 		break;
						 	case 9:
						 		finalizarPedido();
						 		break;
						 }
					}
					break;
				case 3:
					int op3 = -1;
					while(op3 != 0) {
						System.out.println(imprimirMenuAces());
						op3 = in.nextInt();
						 switch (op3) {
						 	case 0:
						 		break;
						 	case 1:
						 		cadastrarAces();
						 		break;
						 	case 2:
						 		removerAces();
						 		break;
						 	case 3:
						 		editarAces();
						 		break;
						 	case 4:
						 		System.out.println(d.listar_acessorios());
						 		break;
						 	case 5:
						 		adicionarAcesMoto();
						 		break;
						 		
						 	}
						 }
					
					break;
				default:
					System.out.println("\nOpcao Invalida!\n");
					break;
			 }
		}
		in.close();
	}
	
	// Definição do menu:
						 
	public static String imprimirMenu() {
		String saida = new String("\nEscolha uma das opcoes a seguir:\n");
		saida = saida + "00 - Sair da aplicacao\n";
		saida = saida + "01 - Acessar menu de motocicletas\n";
		saida = saida + "02 - Acessar menu de usuarios\n";
		saida = saida + "03 - Acessar menu de acessorios\n";
		
		return saida;
	}
	
	public static String imprimirMenuMoto() {
		String saida = new String("\nMenu de motocicletas:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar nova motocicleta\n";
		saida = saida + "02 - Excluir motocicleta existente\n";
		saida = saida + "03 - Editar motocicleta existente\n"; // falta ser feito
		saida = saida + "04 - Listar motocicletas cadastradas\n";
		saida = saida + "05 - Adicionar moto na garagem\n";
		
		
		return saida;
	}
	
	public static String imprimirMenuUser() {
		String saida = new String("\nMenu de usuario:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar novo usuario\n";
		saida = saida + "02 - Excluir usuario existente\n";
		saida = saida + "03 - Editar usuario existente\n"; // falta ser feito
		saida = saida + "04 - Listar usuarios cadastrados\n";
		saida = saida + "05 - Exibir garagem do usuario\n";
		saida = saida + "06 - Editar endereco da garagem\n"; // falta ser feito ****
		saida = saida + "07 - Remover moto da garagem\n"; 
		saida = saida + "08 - Remover acessorio da moto\n"; // falta ser feito
		saida = saida + "09 - Finalizar pedido\n";
		return saida;
	}
	
	
	public static String imprimirMenuAces() {
		String saida = new String("\nMenu de acessorio:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar novo acessorio\n";
		saida = saida + "02 - Excluir acessorio existente\n";
		saida = saida + "03 - Editar acessorio existente\n"; // falta ser feito
		saida = saida + "04 - Listar acessorios cadastrados\n";
		saida = saida + "05 - Adicionar acessorio na moto\n"; // falta ser feito
		
		return saida;
		
	}

	
	// Criação dos métodos utilizados no menu moto:
	
	public static void cadastrarMoto() {
		Motocicleta moto = lerDadosMoto();
		d.getMotocicletas().add(moto);
		System.out.println("Motocicleta cadastrada com sucesso!");
	}
	
	public static void removerMoto() {
		System.out.println(d.listar_motos());
		System.out.println("Digite exatamente o nome do modelo que deseja excluir:\n");
		in.nextLine();
		String modelo = in.nextLine();
		if (d.buscar_modelo(modelo) == null) {
			System.out.println("Motocicleta nao encontrada!\n");
		} else {
			int posicao = d.getMotocicletas().indexOf(d.buscar_modelo(modelo));
			d.excluir_moto(posicao);
			System.out.println("Motocicleta excluida com sucesso!\n");
		}
		
	}
	
	public static void editarMoto() {
		System.out.println("Teste editar moto");
	}
	
	public static void adicionarMotoGaragem() {
		System.out.println("Digite exatamente o nome do usuario:\n");
		in.nextLine();
		String nome = in.nextLine();
		Usuario user = d.buscar_usuario(nome);
		if (user != null) {
			System.out.println("Digite exatamente o modelo da motocicleta que deseja adicionar:\n");
			in.nextLine();
			String modelo = in.nextLine();
			Motocicleta moto = d.buscar_modelo(modelo);
			if (moto != null) {
				user.adicionar_moto_garagem(moto);
				System.out.println("Motocicleta adicionada com sucesso!\n");
			} else {
				System.out.println("Nenhuma motocicleta foi encontrado com esse modelo!\n");
			}
		} else {
			System.out.println("Nenhum usuario foi encontrado com esse nome!\n");
		}
	}
	
	public static void removerMotoGaragem() {
		System.out.println("Digite exatamente o nome do usuario:\n");
		in.nextLine();
		String nome = in.nextLine();
		Usuario user = d.buscar_usuario(nome);
		if (user != null) {
			System.out.println("Digite exatamente o modelo da motocicleta que deseja adicionar:\n");
			in.nextLine();
			String modelo = in.nextLine();
			Motocicleta moto = d.buscar_modelo(modelo);
			if (moto != null) {
				user.remover_moto_garagem(moto);
				System.out.println("Motocicleta removida com sucesso!\n");
			} else {
				System.out.println("Nenhuma motocicleta foi encontrado com esse modelo!\n");
			}
		} else {
			System.out.println("Nenhum usuario foi encontrado com esse nome!\n");
		}
	}
	
	// Metodo para leitura de dados de uma moto
	
		public static Motocicleta lerDadosMoto() {
			String modelo;
			String cilindrada; 
			double valor;
			String cor;
			in.nextLine();
			System.out.println("Digite o modelo da motocicleta:");
			modelo = in.nextLine();
			System.out.println("Digite a cilindrada da motocicleta:");
			cilindrada = in.nextLine();
			System.out.println("Digite o preco da motocicleta: R$ ");
			valor = in.nextDouble();
			System.out.println("Digite a cor da motocicleta:");
			cor = in.nextLine();
			
			Motocicleta moto = new Motocicleta(cor, valor, modelo, cilindrada);
			return moto;	
		}
		
	// Criação dos métodos utilizados no menu user:
	
	public static void cadastrarUser() {
		Usuario user = lerDadosUsuario();
		d.getUsuarios().add(user);
		System.out.println("Usuario cadastrado com sucesso!");
	}
	
	public static void removerUser() {
		System.out.println(d.listar_usuarios());
		System.out.println("Digite exatamente o nome do usuario que deseja excluir:\n");
		in.nextLine();
		String nome = in.nextLine();
		if (d.buscar_usuario(nome) == null) {
			System.out.println("Motocicleta nao encontrada!\n");
		} else {
			int posicao = d.getUsuarios().indexOf(d.buscar_usuario(nome));
			d.excluir_usuario(posicao);
			System.out.println("Usuario excluido com sucesso!\n");
		}
	}
	
	public static void editarUser() {
		System.out.println("Teste editar user");
	}
	
	public static void exibirGaragem() {
		System.out.println(d.listar_usuarios());
		System.out.println("Digite exatamente o nome do usuario que deseja excluir:");
		in.nextLine();
		String nome = in.nextLine();
		Usuario user = d.buscar_usuario(nome);
		if (user != null) {
			user.getGaragem().exibir_garagem();
		} else {
			System.out.print("Usuario nao encontrado. Digite corretamente o nome do usuario!");
		}
	}
	
	public static void editarEndGaragem() {
		System.out.println("Teste editar garagem");
	}
	
	public static void removerAcesMoto() {
		System.out.println("Teste adicionar moto garagem");
	}
	
	public static void finalizarPedido() {
		System.out.println(d.listar_usuarios());
		System.out.println("Digite exatamente o nome do usuario que deseja finalizar o pedido:");
		in.nextLine();
		String nome = in.nextLine();
		Usuario user = d.buscar_usuario(nome);
		if (user != null) {
			int posicao = d.getUsuarios().indexOf(user);
			d.getUsuarios().get(posicao).finalizar_pedido();
		}else {
			System.out.print("Usuario nao encontrado. Digite corretamente o nome do usuario!");
		}
	}
	
	// Metodo para leitura de dados de um usuario
	
	public static Usuario lerDadosUsuario() {
		String nome;
		String email; 
		String senha; 
		String endereco;
		in.nextLine();
		System.out.println("Digite o nome do usuario: ");
		nome = in.nextLine();
		System.out.println("Digite o email do usuario:");
		email = in.nextLine();
		System.out.println("Digite a senha do usuario:");
		senha = in.nextLine();
		System.out.println("Digite o endereco do usuario:");
		endereco = in.nextLine();
		Usuario user = new Usuario(nome, email, senha);
		Garagem gar = new Garagem(user, endereco);
		user.setGaragem(gar);
		return user;	
	}
	
	// Criação dos métodos utilizados no menu acessorio:
	
	public static void cadastrarAces() {
		Acessorio aces = lerDadosAcessorio();
		d.getAcessorios().add(aces);
		System.out.println("Acessorio cadastrado com sucesso!");
	}
	
	public static void removerAces() {
		System.out.println(d.listar_acessorios());
		System.out.println("Digite exatamente o nome do acessorio que deseja excluir:");
		in.nextLine();
		String nome = in.nextLine();
		if (d.buscar_acessorio(nome) == null) {
			System.out.println("Acessorio nao encontrado!\n");
		} else {
			int posicao = d.getAcessorios().indexOf(d.buscar_acessorio(nome));
			d.excluir_acessorios(posicao);
			System.out.println("Acessorio excluido com sucesso!\n");
		}
	}
	
	public static void editarAces() {
		System.out.println("Teste editar acessorio");
	}
	
	public static void adicionarAcesMoto() {
		System.out.println("Teste adicionar moto garagem");
	}
	
	// Metodo para leitura de dados de um acessorio
	
	public static Acessorio lerDadosAcessorio() {
		String nome;
		String posicao; 
		double valor; 
		String cor;
		in.nextLine();
		System.out.println("Digite o nome do acessorio:");
		nome = in.nextLine();
		System.out.println("Digite a posicao do acessorio:");
		posicao = in.nextLine();
		System.out.println("Digite o preco do acessorio: R$ ");
		valor = in.nextDouble();
		System.out.println("Digite a cor do acessorio:");
		cor = in.nextLine();
		Acessorio aces = new Acessorio(cor, valor, nome, posicao);
		return aces;
	}
}
