package org.fatec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Service {
	List<Client> clients = new ArrayList<>();
	
	public Service() {
//		this.clients = [];
	}
	
	public String generateHexCode() {
        Random random = new Random();
        int val = random.nextInt();
        String Code = new String();
        Code = Integer.toHexString(val);
        
        return Code;
	}
	
	public void RegisterClients(String name, String phone, String birthDay, String gender) {		
		this.clients.add(new Client(name, phone, birthDay, gender, this.generateHexCode()));
	}
	
	public void readClients() {
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
	}
}
