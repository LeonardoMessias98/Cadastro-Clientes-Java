package org.fatec;

public class App {

	public static void main(String[] args) {
		ScannerController controle = new ScannerController();
		
		int escolha = 4;
		
		while (escolha != 0) {	
			System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("  Bem vindo ao World Beauty  ");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("  Escolha a loja  ");
			System.out.println("1 - WB Principal");
			System.out.println("2 - WB 1");
			System.out.println("3 - WB 2");
			System.out.println("0 - Sair");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			escolha = controle.opcao();	
			
			if (escolha != 0) {
				Admin admin = new Admin();
				admin.Run(escolha);		
			}
		}
		
		
		System.out.println("\nPrograma finalizado!");
	}

}
