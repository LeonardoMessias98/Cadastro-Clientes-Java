package org.fatec;

public class Admin {

	public Admin() {}
	
	public void Run() {
		ClientContoller services = new ClientContoller();
		
		ScannerController controle = new ScannerController();
		
		int escolha = 0;
		
		while (escolha != 8) {
			Menu.Admin();
			escolha = controle.opcao();
			
			if (escolha == 1) {
				System.out.println("Digite o nome: ");
				String nome = controle.texto();
				
				System.out.println("Digite o telefone: ");
				String phone = controle.texto();
				
				System.out.println("Digite a data de nascimento: ");
				String birth = controle.texto();
				
				System.out.println("Digite o genero: ");
				String gender = controle.texto();
				services.RegisterClients(nome, phone, birth, gender);
			}
			
			if (escolha == 2) {
				int listingEscolha = 0;
				Menu.Listing();
				
				listingEscolha = controle.opcao();
				
				if (listingEscolha == 1) {
					services.sortByDate();
				}
				
				if (listingEscolha == 2) {
					System.out.println("Deseja visualizar por genero ? (Y/N)");

					String response = controle.texto();
					
					System.out.println("VOCE ESCOLHEU " + response);
					if (response.equals("Y") || response.equals("y")) {
						System.out.println("Escolha o genero (M/F)");
						String gender = controle.texto();
						
						if (gender.equals("M") || gender.equals("m")) {
							services.sortByName(gender);
						} else if (gender.equals("F") || gender.equals("f")) {
							services.sortByName(gender);
						} else {
							System.out.println("Essa escolha não é valida");
						}
					} else {
						services.sortByName("0");
					}
					
				}
				
				if (listingEscolha == 3) {
					escolha = 8;
				}
				
			}
			
			if (escolha == 3) {
				System.out.println("Digite o ID do usuário que deseja deletar");
				
				services.removeClient(controle.texto());
			}
			
			if (escolha == 4) {
				System.out.println("Digite o ID do usuário que deseja atualizar");
				String id = controle.texto();
				
				System.out.println("Digite o nome: ");
				String nome = controle.texto();
				
				System.out.println("Digite o telefone: ");
				String phone = controle.texto();
				
				System.out.println("Digite a data de nascimento: ");
				String birth = controle.texto();
				
				System.out.println("Digite o genero: ");
				String gender = controle.texto();
				
				services.updateClient(id, nome, phone, birth, gender);
			}
		}
		
	}

}
