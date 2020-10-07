package org.fatec;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ScannerController controle = new ScannerController();
		ServiceController service = new ServiceController();
		
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
				service.Run();
				admin.Run(escolha, service);	
			}
		}
		
		
		System.out.println("\nPrograma finalizado!");
	}

}
