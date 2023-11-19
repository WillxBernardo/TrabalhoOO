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
		saida = saida + "01 - Cadastrar nova motocicleta\n"; // falta ser feito
		saida = saida + "02 - Excluir motocicleta existente\n";
		saida = saida + "03 - Editar motocicleta existente\n"; // falta ser feito
		saida = saida + "04 - Listar motocicletas cadastradas\n";
		saida = saida + "05 - Adicionar moto na garagem\n";
		
		
		return saida;
	}
	
	public static String imprimirMenuUser() {
		String saida = new String("\nMenu de usuario:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar novo usuario\n"; // falta ser feito
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
		saida = saida + "01 - Cadastrar novo acessorio\n"; // falta ser feito
		saida = saida + "02 - Excluir acessorio existente\n";
		saida = saida + "03 - Editar acessorio existente\n"; // falta ser feito
		saida = saida + "04 - Listar acessorios cadastrados\n";
		saida = saida + "05 - Adicionar acessorio na moto\n"; // falta ser feito
		
		return saida;
		
	}

	
	// Criação dos métodos utilizados no menu moto:
	
	public static void cadastrarMoto() {
		System.out.println("Teste cadastro moto");
	}
	
	public static void removerMoto() {
		System.out.println(d.listar_motos());
		System.out.println("Digite exatamente o nome do modelo que deseja excluir:");
		in.nextLine();
		String modelo = in.nextLine();
		Motocicleta moto = d.buscar_modelo(modelo); 
		if(d.getMotocicletas().indexOf(moto) != -1) {
			int posicao = d.getMotocicletas().indexOf(moto);
			d.excluir_moto(posicao);
		} else {
			System.out.print("Motocicleta nao encontrada. Digite corretamente o nome do modelo!");
		}
	}
	
	public static void editarMoto() {
		System.out.println("Teste editar moto");
	}
	
	public static void adicionarMotoGaragem() {
		System.out.println("Digite exatamente o nome do usuario:");
		in.nextLine();
		String nome = in.nextLine();
		Usuario user = d.buscar_usuario(nome);
		if(d.getUsuarios().indexOf(user) != -1) {
			System.out.println("Digite exatamente o modelo da motocicleta que deseja adicionar:");
			in.nextLine();
			String modelo = in.nextLine();
			Motocicleta moto = d.buscar_modelo(modelo); 
			if(d.getMotocicletas().indexOf(moto) != -1) {
				user.adicionar_moto_garagem(moto);
			} else {
				System.out.print("Motocicleta nao encontrada. Digite corretamente o nome do modelo!");
			}
		} else {
			System.out.print("Usuario nao encontrado. Digite corretamente o nome do usuario!");
		}
	}
	
	public static void removerMotoGaragem() {
		System.out.println("Digite exatamente o nome do usuario:");
		in.nextLine();
		String nome = in.nextLine();
		Usuario user = d.buscar_usuario(nome);
		if(d.getUsuarios().indexOf(user) != -1) {
			System.out.println("Digite exatamente o modelo da motocicleta que deseja adicionar:");
			in.nextLine();
			String modelo = in.nextLine();
			Motocicleta moto = d.buscar_modelo(modelo);
			int posicao = d.getMotocicletas().indexOf(moto);
			if( posicao != -1) {
				user.remover_moto_garagem(posicao);;
			} else {
				System.out.print("Motocicleta nao encontrada. Digite corretamente o nome do modelo!");
			}
		} else {
			System.out.print("Usuario nao encontrado. Digite corretamente o nome do usuario!");
		};
	}
	
	// Criação dos métodos utilizados no menu user:
	
	public static void cadastrarUser() {
		System.out.println("Teste cadastro user");
	}
	
	public static void removerUser() {
		System.out.println(d.listar_usuarios());
		System.out.println("Digite exatamente o nome do usuario que deseja excluir:");
		in.nextLine();
		String nome = in.nextLine();
		Usuario user = d.buscar_usuario(nome);
		if(d.getUsuarios().indexOf(user) != -1) {
			int posicao = d.getUsuarios().indexOf(user);
			d.excluir_usuario(posicao);
		} else {
			System.out.print("Usuario nao encontrado. Digite corretamente o nome do usuario!");
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
		if(d.getUsuarios().indexOf(user) != -1) {
			user.getGaragem().exibir_garagem();
		} else {
			System.out.print("Usuario nao encontrado. Digite corretamente o nome do usuario!");
		};
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
		if(d.getUsuarios().indexOf(user) != -1) {
			int posicao = d.getUsuarios().indexOf(user);
			d.getUsuarios().get(posicao).finalizar_pedido();
		} else {
			System.out.print("Usuario nao encontrado. Digite corretamente o nome do usuario!");
		}
	}
	
	// Criação dos métodos utilizados no menu acessorio:
	
	public static void cadastrarAces() {
		System.out.println("Teste cadastro acessorio");
	}
	
	public static void removerAces() {
		System.out.println(d.listar_acessorios());
		System.out.println("Digite exatamente o nome do acessorio que deseja excluir:");
		in.nextLine();
		String nome = in.nextLine();
		Acessorio aces = d.buscar_acessorio(nome);
		if(d.getAcessorios().indexOf(aces) != -1) {
			int posicao = d.getUsuarios().indexOf(aces);
			d.excluir_acessorios(posicao);
		} else {
			System.out.print("Acessorio nao encontrado. Digite corretamente o nome do acessorio!");
		}
	}
	
	public static void editarAces() {
		System.out.println("Teste editar acessorio");
	}
	
	public static void adicionarAcesMoto() {
		System.out.println("Teste adicionar moto garagem");
	}
	
}
