package org.fatec;

public class App {

	public static void main(String[] args) {
		Service services = new Service();
		
		Controle controle = new Controle();
		
		int escolha = 0;
		
		while (escolha != 5) {
			Menu.MainEscolhas();
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
				services.readClients();
			}
			
			if (escolha == 3) {
				String id = controle.texto();
				
				services.removeClient(id);
			}
		}
		
		
		
		
	}

}
