package org.fatec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Admin implements Serializable {
	
	public void Run(int store, ServiceController service) throws IOException{
		ClientContoller services = new ClientContoller();
		ScannerController controle = new ScannerController();
		
		String caminho = "teste.ser" ;

		int escolha = 8;
		
		while (escolha != 0) {
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
							services.sortByName(gender, false);
						} else if (gender.equals("F")) {
							services.sortByName(gender, false);
						} else {
							System.out.println("Essa escolha não é valida");
						}
					} else {
						services.sortByName("0", false);
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
			
			if (escolha == 5) {
				service.listServices();
				int servicoEscolhido = controle.opcao();
				System.out.println("\n............................................");
				System.out.println("Escolha o usuário pelo ID para consumir o serviço");
				System.out.println("............................................\n");
				services.sortByName("0", true);
				
				String userId = controle.texto();
				services.insertServices(userId, servicoEscolhido, service);
				
			}	
			
			if (escolha == 6) {
				Menu.Relatorios();
				
				int escolhaRelatorio = controle.opcao();
				
				if (escolhaRelatorio == 2) {
					service.printMostUsed();
				}
				
				if (escolhaRelatorio == 3) {
					System.out.println("\n............................................");
					System.out.println("Escolha o usuário pelo ID");
					System.out.println("............................................\n");
					services.sortByName("0", true);
					
					System.out.println("Digite o id do usuário");
					String userId = controle.texto();
					
					services.listServices(userId, service);
				}
			}
			
			if (escolha == 7) {
				FileOutputStream canal = new FileOutputStream(caminho);
				ObjectOutputStream escritor = new ObjectOutputStream(canal);
				escritor.writeObject(services.clients);
				escritor.close();
				System.out.println("Cadastros de clientes salvo com sucesso!");
			}
		}
	}
}
