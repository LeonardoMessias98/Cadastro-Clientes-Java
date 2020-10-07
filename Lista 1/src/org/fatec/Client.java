package org.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client implements Serializable {
	String name;
	String phone;
	String birthDay;
	String gender;
	String id;
	Date create_at;
	int store;
	List<Integer> services = new ArrayList<>();
		
	
	public Client( String id, String name, String phone, String birthDay, String gender, Date create_at, int store) {
		this.name = name;
		this.phone = phone;
		this.birthDay = birthDay;
		this.gender = gender;
		this.id = id;
		this.create_at = create_at;
		this.store = store;
	}
	
	public void addService (int service) {
		this.services.add(service);
	}
	
	public void listService (ServiceController service) {
		
		for (int each : this.services) {
			service.printServices(each);
		}
	}
	
	@Override
	public String toString() {
		String info =
					"\nId: " + id +
					"\nNome: " + name + 
					"\nTelefone: " + phone + 
					"\nData de nascimento: " + birthDay + 
					"\nGenero: " + gender +
					"\nCriado em: " + create_at +
					"\nLoja: " + store;
		
		return info;
	}
}
