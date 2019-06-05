import java.util.Scanner;

public class jokenpo {

	public static void main(String[] args) {
		// LÓGICA DE JOGADOR
		int jogador;
		Scanner mao = new Scanner(System.in); 
		System.out.println("--------------------------------------");
		System.out.println("-------------Jokenpo------------------");
		System.out.println("--------------------------------------");
		System.out.println("");
		System.out.println("1. padra");
		System.out.println("2. papel");
		System.out.println("3. tesoura");
		System.out.println("Digite a opção desejada: ");
		jogador = mao.nextInt();
		
		// ESTRUTURA SWITCH CASE ADMITE APENAS TIPO INT E CHAR
		
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:   
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:	
			System.out.println("Jogador escolheu TESOURA");
			break;
			
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		// LÓGICA DO COMPUTADAOR
		// A LINHA ABAIXO GERA NÚMEROS ALEATÓRIOS ENTRE 0 E 2
		// (INT) CONVERT O RESULTADO POR NÚMERO INTEIRO
		// +1 SOMA 1 AO RESULTADO (1 OU 2 OU 3)
		
		int computador = (int)(Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:   
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:	
			System.out.println("Computador escolheu TESOURA");
			break;
			
		default:
			System.out.println("Opção inválida");
			break;
        
	}
		// LÓGICA PARA DETERMINAR O VENCEDOR OU EMPATE
		if (jogador == computador) {
			System.out.println("EMPATE");
		}else {
			if ((jogador == 1 && computador == 3) ||(jogador == 2 && computador == 1) || (jogador == 3 && computador == 2) ){
				System.out.println("JOGADOR VENCEU");
			}else {
				System.out.println("COMPUTADOR VENCEU");
				
		mao.close();
}
	
}
}
}
