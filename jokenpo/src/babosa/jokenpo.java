package babosa;

import java.util.Scanner;

public class jokenpo {
	
	private static int placarJogador = 0;
	private static int placarComputador = 0;
			
	private static int escolhaJogador;
	private static int escolhaComputador;	
	
	
	
	public static void main (String[] args) {
		
		int rodadas = 0;
		int reinicia = 0;
		try (Scanner input = new Scanner (System.in)) {
		
			System.out.println(" Welcome, little gafanhoto!!! ");
			System.out.println("Que tal um desafio???");
			System.out.println(": (1) Sim, eu aceito! e (2) Não, vou amarelar!! :");
			reinicia = input.nextInt();
			while (reinicia == 1) {
				System.out.println(": !!! JOKEN'POO' !!! :");
				System.out.println(" !!! Vamos nessa !!!");
				System.out.println("Quantas vezes nós iremos jogar desta vez??? ");
				rodadas =input.nextInt();
			
			
				for (int i = 0; i < rodadas; ++i) {
					escolhaComputador = (int) (Math.random()*3) + 1;
					rotuloescolhaJogador();
					escolhaJogador = input.nextInt();
					vxrificaResultado();
					exibirPlacar();
				}
			
				System.out.println("Você aceita um novo desafio?");
				System.out.println("(1) Sim, quero jogar novamente!  (2) Não, estou com medinho!");			
				reinicia = input.nextInt();
				
				}
			System.out.println("Game-Over");
			}
		}
	

	private static void exibirPlacar() {
		System.out.println("!!!  P L A C A R  !!!");
		System.out.println("Placar do jogador: " + placarJogador);
		System.out.println("Placar do computador: " + placarComputador);
		
	}

	private static void vxrificaResultado() {
		
		String  EscolhaTextoJogador = "";
		String  EscolhaTextoComputador = "";
		
		if (escolhaJogador == 1) {
			EscolhaTextoJogador = "Papel";}
		else if (escolhaJogador == 2) {
			EscolhaTextoJogador = "Tesoura";
		}
		else if (escolhaJogador == 3) {
			EscolhaTextoJogador = "Pedra";
		}
		
		if (escolhaComputador == 1) {
			EscolhaTextoComputador = "Papel";
		}
		else if (escolhaComputador == 2) {
			EscolhaTextoComputador = "Tesoura";
		}
		else if (escolhaComputador == 3) {
			EscolhaTextoComputador = "Pedra";
		}
		
		
		if (escolhaJogador == escolhaComputador) {
			System.out.println("Empatou, mas podemos ir denovo!!!");
			System.out.println("Você escolheu "+ escolhaJogador + " E o computador escolheu "+ EscolhaTextoComputador);
			
		}else if (escolhaJogador == 1 && escolhaComputador == 2) 
		{
			System.out.println("Poxa, você perdeu.");
		     placarComputador += 1;
		    
			System.out.println("Você escolheu "+ EscolhaTextoJogador + " e o computador escolheu "+ EscolhaTextoComputador);
		}else if (escolhaJogador == 1 && escolhaComputador == 3) {
			System.out.println("Parabéns, você Ganhou!");
		    placarJogador += 1;
			System.out.println("Você escolheu "+ EscolhaTextoJogador + " e o computador escolheu "+ EscolhaTextoComputador);
		}else if (escolhaJogador == 2 && escolhaComputador == 1) {
			System.out.println("Parabéns, você Ganhou!");
		    placarJogador += 1;
			System.out.println("Você escolheu "+ EscolhaTextoJogador + " e o computador escolheu "+ EscolhaTextoComputador);
		} else if (escolhaJogador == 2 && escolhaComputador == 3) {
			System.out.println("Poxa, você Perdeu.");
			placarComputador += 1;
			System.out.println("Você escolheu "+ EscolhaTextoJogador + " e o computador escolheu "+ EscolhaTextoComputador);
		}else if (escolhaJogador == 3 && escolhaComputador == 1) {
			System.out.println("Poxa, você Perdeu.");
			 placarComputador += 1;
			System.out.println("Você escolheu "+ EscolhaTextoJogador + " e o computador escolheu "+ EscolhaTextoComputador);
		}else if (escolhaJogador == 3 && escolhaComputador == 2) {
			System.out.println("Parabéns, você Ganhou!");
			placarJogador += 1;
			System.out.println("Você escolheu "+ EscolhaTextoJogador + " e o computador escolheu "+ EscolhaTextoComputador);
		}else {
			System.out.println("Opção inválida.");
		}
	}
	
						

	private static void rotuloescolhaJogador() {
		System.out.println("jogador, digite: ");
		System.out.println("1 - Papel");
		System.out.println("2 - Tesoura");
		System.out.println("3 - Pedra");
		System.out.println("Escolha uma opção!");
		
	}

}