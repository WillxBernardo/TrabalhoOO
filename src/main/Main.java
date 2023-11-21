package main;

import java.util.*;
import project.*;
import dados.*;

public class Main {
	
	private static Dados d = new Dados();
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int op = -1;
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
						 		exibirMoto();
						 		break;
						 	case 6:
						 		adicionarMotoGaragem();
						 		break;
						 	case 7:
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
						 		System.out.println(d.listar_usuarios());
						 		break;
						 	case 5:
						 		exibirUsuario();
						 		break;
						 	case 6:
						 		exibirGaragem();
						 		break;
						 	case 7:
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
						 		exibirAces();
						 		break;
						 	case 6:
						 		adicionarAcesMoto();
						 		break;
						 	case 7:
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
		saida = saida + "05 - Exibir motocicleta\n";
		saida = saida + "06 - Adicionar moto na garagem\n";
		saida = saida + "07 - Remover moto da garagem\n";
		
		
		return saida;
	}
	
	public static String imprimirMenuUser() {
		String saida = new String("\nMenu de usuario:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar novo usuario\n";
		saida = saida + "02 - Excluir usuario existente\n";
		saida = saida + "03 - Editar usuario existente\n";
		saida = saida + "04 - Listar usuarios cadastrados\n";
		saida = saida + "05 - Exibir usuario\n";
		saida = saida + "06 - Exibir garagem do usuario\n";
		saida = saida + "07 - Finalizar pedido\n";
		return saida;
	}
	
	
	public static String imprimirMenuAces() {
		String saida = new String("\nMenu de acessorio:\n");
		saida = saida + "00 - Voltar ao menu anterior\n";
		saida = saida + "01 - Cadastrar novo acessorio\n";
		saida = saida + "02 - Excluir acessorio existente\n";
		saida = saida + "03 - Editar acessorio existente\n";
		saida = saida + "04 - Listar acessorios cadastrados\n";
		saida = saida + "05 - Exibir acessorio\n";
		saida = saida + "06 - Adicionar acessorio na moto\n";
		saida = saida + "07 - Remover acessorio da moto\n";
		
		return saida;
		
	}

	
	// Criação dos métodos utilizados no menu moto:
	
	public static void cadastrarMoto() {
		String modelo;
		String cilindrada; 
		double valor;
		String cor;
		in.nextLine();
		System.out.println("Digite o modelo da motocicleta:");
		modelo = in.nextLine();
		if (d.buscar_modelo(modelo) == null) {
			System.out.println("Digite a cilindrada da motocicleta:");
			cilindrada = in.nextLine();
			System.out.println("Digite o preco da motocicleta: R$ ");
			valor = in.nextDouble();
			in.nextLine();
			System.out.println("Digite a cor da motocicleta:");
			cor = in.nextLine();
			Motocicleta moto = new Motocicleta(cor, valor, modelo, cilindrada);
			d.getMotocicletas().add(moto);
			System.out.println("Motocicleta cadastrada com sucesso!");
		} else {
			System.out.println("Ja existe uma motocicleta desse modelo!\n");
		}	
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
		String modelonovo;
		String cilindrada; 
		double valor;
		String cor;

		System.out.println(d.listar_motos());
		System.out.println("Digite exatamente o nome do modelo que deseja editar:\n");
		in.nextLine();
		String modelo = in.nextLine();
		if (d.buscar_modelo(modelo) == null) {
			System.out.println("Motocicleta nao encontrada!\n");
		} else {
			int posicao = d.getMotocicletas().indexOf(d.buscar_modelo(modelo));
			System.out.println("Digite o modelo da motocicleta:");
			modelonovo = in.nextLine();
			if (d.buscar_modelo(modelonovo) == null || modelonovo.equals(modelo)) {
				System.out.println("Digite a cilindrada da motocicleta:");
				cilindrada = in.nextLine();
				System.out.println("Digite o preco da motocicleta: R$ ");
				valor = in.nextDouble();
				in.nextLine();
				System.out.println("Digite a cor da motocicleta:");
				cor = in.nextLine();
				Motocicleta moto = new Motocicleta(cor, valor, modelonovo, cilindrada);
				d.getMotocicletas().set(posicao, moto);
				System.out.println("Motocicleta editada com sucesso!\n");
			} else {
				System.out.println("Modelo cadastrado em outra motocicleta!\n");
			}
		}
	}
	
	public static void exibirMoto() {
		System.out.println(d.listar_motos());
		System.out.println("Digite exatamente o nome do modelo que deseja exibir:\n");
		in.nextLine();
		String modelo = in.nextLine();
		if (d.buscar_modelo(modelo) == null) {
			System.out.println("Motocicleta nao encontrada!\n");
		} else {
			System.out.println(d.buscar_modelo(modelo).exibir_moto());
		}
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
			System.out.println("Digite exatamente o modelo da motocicleta que deseja remover:\n");
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
	
	
	// Criação dos métodos utilizados no menu user:
	
	public static void cadastrarUser() {
		String nome;
		String email; 
		String senha; 
		String endereco;
		in.nextLine();
		System.out.println("Digite o nome do usuario: ");
		nome = in.nextLine();
		if (d.buscar_usuario(nome) == null) {
			System.out.println("Digite o email do usuario:");
			email = in.nextLine();
			System.out.println("Digite a senha do usuario:");
			senha = in.nextLine();
			System.out.println("Digite o endereco do usuario:");
			endereco = in.nextLine();
			Usuario user = new Usuario(nome, email, senha);
			Garagem gar = new Garagem(user, endereco);
			user.setGaragem(gar);
			d.getUsuarios().add(user);
			System.out.println("Usuario cadastrado com sucesso!");
		} else {
			System.out.println("Ja existe um usuario com esse nome!\n");
		}
	}
	
	public static void removerUser() {
		System.out.println(d.listar_usuarios());
		System.out.println("Digite exatamente o nome do usuario que deseja excluir:\n");
		in.nextLine();
		String nome = in.nextLine();
		if (d.buscar_usuario(nome) == null) {
			System.out.println("Usuario nao encontrado!\n");
		} else {
			int posicao = d.getUsuarios().indexOf(d.buscar_usuario(nome));
			d.excluir_usuario(posicao);
			System.out.println("Usuario excluido com sucesso!\n");
		}
	}
	
	public static void editarUser() {
		String nomenovo;
		String email; 
		String senha; 
		String endereco;
		
		System.out.println(d.listar_usuarios());
		System.out.println("Digite exatamente o nome do usuario que deseja editar:\n");
		in.nextLine();
		String nome = in.nextLine();
		if (d.buscar_usuario(nome) == null) {
			System.out.println("Usuario nao encontrado!\n");
		} else {
			Garagem gar = d.buscar_usuario(nome).getGaragem();
			int posicao = d.getUsuarios().indexOf(d.buscar_usuario(nome));
			System.out.println("Digite o nome do usuario: ");
			nomenovo = in.nextLine();
			if (d.buscar_usuario(nomenovo) == null || nomenovo.equals(nome)) {
				System.out.println("Digite o email do usuario:");
				email = in.nextLine();
				System.out.println("Digite a senha do usuario:");
				senha = in.nextLine();
				System.out.println("Digite o endereco do usuario:");
				endereco = in.nextLine();
				Usuario user = new Usuario(nomenovo, email, senha);
				gar.setEndereco(endereco);
				user.setGaragem(gar);
				d.getUsuarios().set(posicao, user);
				System.out.println("Usuario editado com sucesso!\n");
			} else {
				System.out.println("Nome cadastrado em outro usuario\n");
			}
		}
	}
	
	public static void exibirUsuario() {
		System.out.println(d.listar_usuarios());
		System.out.println("Digite exatamente o nome do usuario que deseja exibir:\n");
		in.nextLine();
		String nome = in.nextLine();
		if (d.buscar_usuario(nome) == null) {
			System.out.println("Usuario nao encontrado!\n");
		} else {
			System.out.println(d.buscar_usuario(nome).exibir_usuario());
		}
	}
	
	public static void exibirGaragem() {
		System.out.println(d.listar_usuarios());
		System.out.println("Digite exatamente o nome do usuario:");
		in.nextLine();
		String nome = in.nextLine();
		if (d.buscar_usuario(nome) != null) {
			System.out.println(d.buscar_usuario(nome).getGaragem().exibir_garagem());
		} else {
			System.out.print("Usuario nao encontrado. Digite corretamente o nome do usuario!");
		}
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
			System.out.print("Usuario nao encontrado. Digite corretamente o nome do usuario!\n");
		}
	}
	
	
	// Criação dos métodos utilizados no menu acessorio:
	
	public static void cadastrarAces() {
		String nome;
		String posicao; 
		double valor; 
		String cor;
		in.nextLine();
		System.out.println("Digite o nome do acessorio:");
		nome = in.nextLine();
		if (d.buscar_acessorio(nome) == null) {
			System.out.println("Digite a posicao do acessorio:");
			posicao = in.nextLine();
			System.out.println("Digite o preco do acessorio: R$ ");
			valor = in.nextDouble();
			in.nextLine();
			System.out.println("Digite a cor do acessorio:");
			cor = in.nextLine();
			Acessorio aces = new Acessorio(cor, valor, nome, posicao);
			d.getAcessorios().add(aces);
			System.out.println("Acessorio cadastrado com sucesso!");
		} else {
			System.out.println("Ja existe um acessorio com esse nome!\n");
		}
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
		String nomenovo;
		String posicao; 
		double valor; 
		String cor;
		
		System.out.println(d.listar_acessorios());
		System.out.println("Digite exatamente o nome do acessorio que deseja editar:");
		in.nextLine();
		String nome = in.nextLine();
		if (d.buscar_acessorio(nome) == null) {
			System.out.println("Acessorio nao encontrado!\n");
		} else {
			int pos = d.getAcessorios().indexOf(d.buscar_acessorio(nome));
			System.out.println("Digite o nome do acessorio:");
			nomenovo = in.nextLine();
			if (d.buscar_acessorio(nomenovo) == null || nomenovo.equals(nome)) {
				System.out.println("Digite a posicao do acessorio:");
				posicao = in.nextLine();
				System.out.println("Digite o preco do acessorio: R$ ");
				valor = in.nextDouble();
				in.nextLine();
				System.out.println("Digite a cor do acessorio:");
				cor = in.nextLine();
				Acessorio aces = new Acessorio(cor, valor, nomenovo, posicao);
				d.getAcessorios().set(pos, aces);
				System.out.println("Acessorio editado com sucesso!\n");
			} else {
				System.out.println("Ja existe um acessorio com esse nome!\n");
			}
		}
	}
	
	public static void exibirAces() {
		System.out.println(d.listar_acessorios());
		System.out.println("Digite exatamente o nome do acessorio que deseja exibir:");
		in.nextLine();
		String nome = in.nextLine();
		if (d.buscar_acessorio(nome) == null) {
			System.out.println("Acessorio nao encontrado!\n");
		} else {
			System.out.println(d.buscar_acessorio(nome).exibir_acessorio());
		}
	}
	
	public static void adicionarAcesMoto() {
		System.out.println(d.listar_acessorios());
		System.out.println("Digite exatamente o nome do acessorio que deseja adicionar:");
		in.nextLine();
		String nome = in.nextLine();
		if (d.buscar_acessorio(nome) == null) {
			System.out.println("Acessorio nao encontrado!\n");
		} else {
			System.out.println(d.listar_motos());
			System.out.println("Digite exatamente o nome do modelo da motocicleta:");
			String modelo = in.nextLine();
			if (d.buscar_modelo(modelo)== null) {
				System.out.println("Motocicleta nao encontrada!\n");
			} else {
				d.adicionar_acessorio_moto(d.buscar_acessorio(nome), d.buscar_modelo(modelo));
				System.out.println("Acessorio adicionado com sucesso!\n");
			}
		}
	}
	
	public static void removerAcesMoto() {
		System.out.println(d.listar_acessorios());
		System.out.println("Digite exatamente o nome do acessorio que deseja remover:");
		in.nextLine();
		String nome = in.nextLine();
		if (d.buscar_acessorio(nome) == null) {
			System.out.println("Acessorio nao encontrado!\n");
		} else {
			System.out.println(d.listar_motos());
			System.out.println("Digite exatamente o nome do modelo da motocicleta:");
			String modelo = in.nextLine();
			if (d.buscar_modelo(modelo)== null) {
				System.out.println("Motocicleta nao encontrada!\n");
			} else {
				d.remover_acessorio_moto(d.buscar_acessorio(nome), d.buscar_modelo(modelo));;
				System.out.println("Acessorio removido com sucesso!\n");
			}
		}
	}

}
