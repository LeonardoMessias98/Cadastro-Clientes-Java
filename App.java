package org.fatec;

public class App {

	public static void main(String[] args) {

		ServiceController services = new ServiceController();
		
		Admin admin = new Admin();
		
		ScannerController controle = new ScannerController();
		
		int escolha = 0;
		
		while (escolha != 3) {
			Menu.Main();
			
			escolha = controle.opcao();
			
			if (escolha == 1) {
				int	escolhaCliente = 0;

				services.Run();
				Menu.Client();
				
				escolhaCliente = controle.opcao();
				
				if (escolhaCliente == 1) {
					services.listServices();
					
					System.out.println("Essa é a nossa lista de serviços\n");
				}
			}
			
			if (escolha == 2) {
				admin.Run();
			}
			
		}
		
		
		
	}

}
