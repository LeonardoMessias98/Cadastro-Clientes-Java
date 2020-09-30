package org.fatec;

public class Admin {
	
	public void Run(int store) {
		ClientContoller services = new ClientContoller();
		
		ScannerController controle = new ScannerController();
		
		int escolha = 0;
		
		while (escolha != 8) {
			Menu.Admin();
			escolha = controle.opcao();
			
			if (escolha == 1) {
				System.out.print("Digite o nome: ");
				String nome = controle.texto();
				
				System.out.print("Digite o telefone: ");
				String phone = controle.texto();
				
				System.out.print("Digite a data de nascimento: ");
				String birth = controle.texto();
				
				System.out.print("Digite o genero (M/F): ");
				String gender = controle.texto().toUpperCase();
				while (!(gender.equals("M") || gender.equals("F"))) {
					System.out.println("\nGênero deverá ser M ou F");
					System.out.print("Digite o genero (M/F): ");
					gender = controle.texto().toUpperCase();
				}
				
				services.RegisterClients(nome, phone, birth, gender, store);
				System.out.println("\nCliente cadastrado com sucesso!");
			}
			
			if (escolha == 2) {
				int listingEscolha = 0;
				Menu.Listing();
				
				listingEscolha = controle.opcao();
				
				if (listingEscolha == 1) {
					services.sortByDate();
				}
				
				if (listingEscolha == 2) {
					System.out.println("Deseja visualizar por genero ? (S/N)");

					String response = controle.texto().toUpperCase();
					System.out.println(response);
					
					if (response.equals("S")) {
						System.out.println("Escolha o genero (M/F)");
						String gender = controle.texto().toUpperCase();
						
						if (gender.equals("M")) {
							services.sortByName(gender);
						} else if (gender.equals("F")) {
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
				
				System.out.print("Digite o nome: ");
				String nome = controle.texto();
				
				System.out.print("Digite o telefone: ");
				String phone = controle.texto();
				
				System.out.print("Digite a data de nascimento: ");
				String birth = controle.texto();
				
				System.out.print("Digite o genero: ");
				String gender = controle.texto().toUpperCase();
				while (!(gender.equals("M") || gender.equals("F"))) {
					System.out.println(gender);
				}
				
				services.updateClient(id, nome, phone, birth, gender);
			}
		
		}
	}
}
