package automotive;

public class Dealership {
	public static void main(String[] args) throws Exception {
		ScannerController controller = new ScannerController();
		
		int choice = 0;
		
		
		while (choice == 0) {
			System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("  Bem vindo à Concessionárias Chang  ");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("  Escolha a concessionária  ");
			System.out.println("1 -  Concessionária A");
			System.out.println("2 -  Concessionária B");
			System.out.println("3 -  Concessionária C");
			System.out.println("10 - Sair");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			choice = controller.opcao();		
		}
		
		App app = new App();
		app.Run(choice);
	}
}