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
		return scanner.nextLine().toUpperCase();
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
			inclueTimeEmCampeonato(sistema, scanner);
			break;
		case "E":
			exibeCampeonatosDeTime(sistema, scanner);
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
		String codigo = scanner.nextLine();
		System.out.println("Nome: ");
		String nome = scanner.nextLine();
		System.out.println("Mascote: ");
		String mascote = scanner.nextLine();
		System.out.println(sistema.incluiTime(codigo, nome, mascote));
		//System.out.println("Inclusão realizada!");
	}
	
	private static void recuperaTime(MrBetSistema sistema, Scanner scanner) {
		System.out.println("Código: ");
		String codigo = scanner.nextLine();
		
		System.out.println(sistema.recuperaTime(codigo));
	}
	
	private static void cadastraCampeonato(MrBetSistema sistema, Scanner scanner) {
		System.out.println("Campeonato: ");
		String nome = scanner.nextLine();
		System.out.println("Participantes: ");
		int participantes = scanner.nextInt();
		scanner.nextLine();
		System.out.println(sistema.cadastraCampeonato(nome, participantes));
	}
	
	private static void inclueTimeEmCampeonato(MrBetSistema sistema, Scanner scanner) {
		System.out.println("(I) Incluir time em campeonato ou (V) Verificar se time está em campeonato?");
		String opcao = scanner.nextLine().toUpperCase();
		
		try {
			if (opcao.equals("I")) {
				System.out.println("Código: ");
				String codigoTime = scanner.nextLine();
				System.out.println("Campeonato: ");
				String codigoCampeonato = scanner.nextLine().toUpperCase();
				System.out.println(sistema.inclueTimeEmCampeonato(codigoTime, codigoCampeonato));
			}
			
			if (opcao.equals("V")) {
				System.out.println("Código: ");
				String codigoTime = scanner.nextLine();
				System.out.println("Campeonato: ");
				String codigoCampeonato = scanner.nextLine().toUpperCase();
				System.out.println(sistema.verificaTimeEmCampeonato(codigoTime, codigoCampeonato));
			}
		} catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void exibeCampeonatosDeTime(MrBetSistema sistema, Scanner scanner) {
		try {
		System.out.println("Time: ");
		String codigoTime = scanner.nextLine();
		System.out.println(sistema.exibeCampeonatosDoTime(codigoTime));
		}
		catch(IllegalArgumentException e) {
			e.getMessage();
		}
	}
}
