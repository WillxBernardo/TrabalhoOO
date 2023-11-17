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
		while(op != 0) {
			System.out.print(imprimirMenu());
			op = in.nextInt();
			 switch (op) {
			 	case 0:
			 		System.out.println("Obrigado por utilizar o sistema!");
			 		break;
				case 1:
					imprimirMenuMoto();
					break;
				case 2:
					imprimirMenuUser();
					break;
				case 3: 
					imprimirMenuAces();
					break;
				default:
					System.out.println("\nOpcao Invalida!\n");
					break;
			 }
		}
		in.close();
	}
	
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
		saida = saida + "01 - Cadastrar novo usuario\n";
		saida = saida + "02 - Remover usuario existente\n";
		saida = saida + "03 - Editar usuario existente\n";
		saida = saida + "04 - Listar usuarios\n";
		return saida;
	}
	
	public static String imprimirMenuAces() {
		String saida = new String("Menu de usuario:\n");
		saida = saida + "01 - Cadastrar novo acessorio\n";
		saida = saida + "02 - Remover acessorio existente\n";
		saida = saida + "03 - Editar acessorio existente\n";
		saida = saida + "04 - Listar acessorios cadastrados\n";
		saida = saida + "05 - Adicionar acessorio na moto\n";
		saida = saida + "06 - Remover acessório da moto\n";
		return saida;
	}
}
