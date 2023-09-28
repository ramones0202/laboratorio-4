package mr_bet;

import java.util.Scanner;

public class MainMrBet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MrBetSistema sistema = new MrBetSistema();
		
		Scanner scanner = new Scanner(System.in);
		String escolha = "";
		while (true) {
			escolha = menu(scanner);
			comando(escolha, sistema, scanner);
		}
		
	}
	
	private static String menu(Scanner scanner) {
		System.out.println(
				"\n---\nMENU\n" + 
						"(M)Minha inclusão de times\n" +
						"(R)Recuperar time\n" +
						"(.)Adicionar campeonato\n" +
						"(B)Bora incluir time em campeonato e Verificar se time está em campeonato\n" +
						"(E)Exibir campeonatos que o time participa\n" +
						"(T)Tentar a sorte e status\n" +
						"(!)Já pode fechar o programa!\n\n" +
						"Opção> ");
		return scanner.next().toUpperCase();
	}
	
	private static void comando(String opcao, MrBetSistema sistema,  Scanner scanner) {
		switch (opcao) {
		case "M":
			incluiTime(sistema, scanner);
			break;
		case "R":
			recuperaTime(sistema, scanner);
			break;
		case ".":
			cadastraCampeonato(sistema, scanner);
			break;
		case "B":
			//sai();
			break;
		case "E":
			//sai();
			break;
		case "T":
			//sai();
			break;
		case "!":
			//sai();
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}
	
	private static void incluiTime(MrBetSistema sistema, Scanner scanner) {
		System.out.println("Código: ");
		String codigo = scanner.next();
		System.out.println("Nome: ");
		String nome = scanner.next();
		System.out.println("Mascote: ");
		String mascote = scanner.next();
		System.out.println(sistema.incluiTime(codigo, nome, mascote));
		//System.out.println("Inclusão realizada!");
	}
	
	private static void recuperaTime(MrBetSistema sistema, Scanner scanner) {
		System.out.println("Código: ");
		String codigo = scanner.next();
		
		System.out.println(sistema.recuperaTime(codigo));
	}
	
	private static void cadastraCampeonato(MrBetSistema sistema, Scanner scanner) {
		System.out.println("Campeonato: ");
		String nome = scanner.next();
		System.out.println("Participantes: ");
		scanner.nextLine();
		int participantes = scanner.nextInt();
		System.out.println(sistema.cadastraCampeonato(nome, participantes));
	}
	
}
