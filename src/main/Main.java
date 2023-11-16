package main;

import java.util.*;
import project.*;
import dados.*;

public class Main {
	
	public static void main(String[] args) {
		int op = -1;
		int aux;
		d.preencherDados();
		while(op != 0) {
			System.out.print(imprimirMenu());
			op = in.nextInt();
			 switch (op) {
			 	case 0:
			 		System.out.println("Obrigada por utilizar o sistema. Ate logo!");
			 		break;
				case 1:
					cadastrarAluno();
					break;
				case 2:
					removerAluno();
					break;
				case 3: 
					System.out.println("Escolha um dos alunos a seguir para editar as informacoes:\n");
					listarAlunos();
					aux = in.nextInt();
					Aluno a = lerDadosAluno();
					editar(aux, a);
					break;
				case 4: 
					listarAlunos();
					break;
				case 5:
					cadastrarProfessor();
					break;
				case 6:
					removerProfessor();
					break;
				case 7: 
					System.out.println("Escolha um dos professores a seguir para editar as informacoes:\n");
					listarProfessores();
					aux = in.nextInt();
					Professor p = lerDadosProfessor();
					editar(aux, p);
					break;
				case 8: 
					listarProfessores();
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

		saida = saida + "01 - Cadastrar nova motocicleta\n";
		saida = saida + "02 - Remover motocicleta existente\n";
		saida = saida + "03 - Editar motocicleta existente\n";
		saida = saida + "04 - Listar motocicletas\n";
		
		saida = saida + "05 - Cadastrar novo usuário\n";
		saida = saida + "06 - Remover usuário existente\n";
		saida = saida + "07 - Editar usuário existente\n";
		saida = saida + "08 - Listar usuários\n";
		
		saida = saida + "09 - Cadastrar novo acessório\n";
		saida = saida + "10 - Remover acessório existente\n";
		saida = saida + "11 - Editar acessório existente\n";
		saida = saida + "12 - Listar acessórios\n";
		
		// métodos específicos fora do CRUD
		saida = saida + "13 - Adicionar acessório na moto\n";
		saida = saida + "14 - Adicionar moto há garagem\n";
		saida = saida + "15 - Finalizar pedido\n";
		return saida;
	}
}
