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
		System.out.println(d.getMotocicletas().get(1).getModelo());
		Dados dado = new Dados();
		
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
						 		d.listar_motos();
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
						 		d.listar_usuarios();
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
						 		d.listar_acessorios();
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
		saida = saida + "03 - Editar motocicleta existente\n";
		saida = saida + "04 - Listar motocicletas cadastradas\n";
		saida = saida + "05 - Adicionar moto na garagem\n";
		
		
		return saida;
	}
	
	public static String imprimirMenuUser() {
		String saida = new String("\nMenu de usuario:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar novo usuario\n";
		saida = saida + "02 - Excluir usuario existente\n";
		saida = saida + "03 - Editar usuario existente\n";
		saida = saida + "04 - Listar usuarios cadastrados\n";
		saida = saida + "05 - Exibir garagem do usuario\n";
		saida = saida + "06 - Editar endereco da garagem\n";
		saida = saida + "07 - Remover moto da garagem\n";
		saida = saida + "08 - Remover acessório da moto\n";
		saida = saida + "09 - Finalizar pedido\n";
		return saida;
	}
	
	
	public static String imprimirMenuAces() {
		String saida = new String("Menu de acessorio:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar novo acessorio\n";
		saida = saida + "02 - Excluir acessorio existente\n";
		saida = saida + "03 - Editar acessorio existente\n";
		saida = saida + "04 - Listar acessorios cadastrados\n";
		saida = saida + "05 - Adicionar acessorio na moto\n";
		
		return saida;
		
	}

	
	// Criação dos métodos utilizados no menu moto:
	
	public static boolean cadastrarMoto() {
		System.out.println("Teste cadastro moto");
		return true;
	}
	
	public static boolean removerMoto() {
		System.out.println("Teste remover moto");
		return true;
	}
	
	public static boolean editarMoto() {
		System.out.println("Teste editar moto");
		return true;
	}
	
	public static boolean adicionarMotoGaragem() {
		System.out.println("Teste adicionar moto garagem");
		return true;
	}
	
	public static boolean removerMotoGaragem() {
		System.out.println("Teste remover moto garagem");
		return true;
	}
	
	// Criação dos métodos utilizados no menu user:
	
	public static boolean cadastrarUser() {
		System.out.println("Teste cadastro user");
		return true;
	}
	
	public static boolean removerUser() {
		System.out.println("Teste remover user");
		return true;
	}
	
	public static boolean editarUser() {
		System.out.println("Teste editar user");
		return true;
	}
	
	public static boolean exibirGaragem() {
		System.out.println("Teste exibir garagem");
		return true;
	}
	
	public static boolean editarEndGaragem() {
		System.out.println("Teste editar garagem");
		return true;
	}
	
	public static boolean removerAcesMoto() {
		System.out.println("Teste adicionar moto garagem");
		return true;
	}
	
	public static boolean finalizarPedido() {
		System.out.println("Teste finalizar pedido");
		return true;
	}
	
	// Criação dos métodos utilizados no menu acessorio:
	
	public static boolean cadastrarAces() {
		System.out.println("Teste cadastro acessorio");
		return true;
	}
	
	public static boolean removerAces() {
		System.out.println("Teste remover acessorio");
		return true;
	}
	
	public static boolean editarAces() {
		System.out.println("Teste editar acessorio");
		return true;
	}
	
	public static boolean adicionarAcesMoto() {
		System.out.println("Teste adicionar moto garagem");
		return true;
	}
	
	
}
