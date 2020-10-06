package org.fatec;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ClientContoller {
	List<Client> clients = new ArrayList<>();
	
	public ClientContoller() {
//		this.clients = [];
	}
	
	public String generateHexCode() {
        Random random = new Random();
        int val = random.nextInt();
        String Code = new String();
        Code = Integer.toHexString(val);
        
        return Code;
	}
	
	public void RegisterClients(String name, String phone, String birthDay, String gender, int store ) {
		Date date = new Date();
		
		this.clients.add(new Client(this.generateHexCode(), name, phone, birthDay, gender, date, store ));
	}
	
	public void sortByDate() {
		Collections.sort(clients, new Comparator<Client>(){ 
			 @Override 
			public int compare(Client client1, Client client2){ 
			  return client1.create_at.compareTo(client2.create_at); 
			} 
		});
		
		this.clients.forEach(client -> System.out.println(client));
	}
	
	public void removeClient(String id) {
		Iterator<Client> client = clients.iterator();
		
		while (client.hasNext()){ 
			   Client atual = client.next(); 
			       if (atual.id.equals(id)) { 
			            client.remove(); 
			   } 
			}
		
		System.out.println("Cliente removido com sucesso !");
	}

	public void updateClient(String id, String nome, String phone, String birth, String gender) {
		Iterator<Client> client = clients.iterator();
		
		while (client.hasNext()){ 
			   Client atual = client.next(); 
			       if (atual.id.equals(id)) {
			    	   atual.name = nome;
			    	   atual.phone = phone;
			    	   atual.birthDay = birth;
			    	   atual.gender = gender;
			   } 
			}
		
		System.out.println("\nCliente atualizado com sucesso!");
	}
	
	public void insertServices(String id, int service, ServiceController servico ) {
		Iterator<Client> client = clients.iterator();
		
		servico.insertInMostUsed(service);
		
		while (client.hasNext()){ 
			   Client atual = client.next(); 
			       if (atual.id.equals(id)) {
			    	   atual.addService(service);
			   } 
			}
		
		System.out.println("\nProduto adicionado!");
	}
	
	public void listServices(String id, ServiceController service) {
		Iterator<Client> client = clients.iterator();
		
		while (client.hasNext()){ 
			   Client atual = client.next(); 
			       if (atual.id.equals(id)) {
			    	   atual.listService(service);
			   } 
			}
	}
	
	public void sortByName(String gender, boolean services) {
		Collections.sort(clients, new Comparator<Client>(){ 
			 @Override 
			public int compare(Client client1, Client client2){ 
			  return client1.name.compareTo(client2.name); 
			} 
		});
		
		this.clients.forEach(client -> {
			if (gender.equals("0")) {
				if (services) {
					System.out.println("\n.............................");
					System.out.println("Nome: "+ client.name);
					System.out.println("Id: " + client.id);
					System.out.println(".............................\n");
				} else {
					System.out.println(client);
				}
				
			} else if (gender.equalsIgnoreCase(client.gender)) {
				System.out.println(client);
			}
		});
	}
}
