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
						 		d.listar_motos();
						 		break;
						 	case 5:
						 		adicionarMotoGaragem();
						 		break;
						 	case 6:
						 		removerMotoGaragem();
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
						 	case 6:
						 		removerAcesMoto();
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
		String saida = new String("Escolha uma das opcoes a seguir:\n");
		saida = saida + "00 - Sair da aplicação\n";
		saida = saida + "01 - Acessar menu de motocicletas\n";
		saida = saida + "02 - Acessar menu de usuarios\n";
		saida = saida + "03 - Acessar menu de acessorios\n";
		
		// O que fazer com esse método?
		saida = saida + "17 - Finalizar pedido\n";
		
		return saida;
	}
	
	public static String imprimirMenuMoto() {
		String saida = new String("Menu de motocicletas:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar nova motocicleta\n";
		saida = saida + "02 - Remover motocicleta existente\n";
		saida = saida + "03 - Editar motocicleta existente\n";
		saida = saida + "04 - Listar motocicletas\n";
		saida = saida + "05 - Adicionar moto à garagem\n";
		saida = saida + "06 - Remover moto da garagem\n";
		return saida;
	}
	
	public static String imprimirMenuUser() {
		String saida = new String("Menu de usuario:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar novo usuario\n";
		saida = saida + "02 - Remover usuario existente\n";
		saida = saida + "03 - Editar usuario existente\n";
		saida = saida + "04 - Listar usuarios\n";
		return saida;
	}
	
	public static String imprimirMenuAces() {
		String saida = new String("Menu de usuario:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar novo acessorio\n";
		saida = saida + "02 - Remover acessorio existente\n";
		saida = saida + "03 - Editar acessorio existente\n";
		saida = saida + "04 - Listar acessorios cadastrados\n";
		saida = saida + "05 - Adicionar acessorio na moto\n";
		saida = saida + "06 - Remover acessório da moto\n";
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
	
	public static boolean removerAcesMoto() {
		System.out.println("Teste adicionar moto garagem");
		return true;
	}
}
