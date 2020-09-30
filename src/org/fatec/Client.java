package org.fatec;

import java.util.Date;

public class Client {
	String name;
	String phone;
	String birthDay;
	String gender;
	String id;
	Date create_at;
	int store;
	
	public Client( String id, String name, String phone, String birthDay, String gender, Date create_at, int store) {
		this.name = name;
		this.phone = phone;
		this.birthDay = birthDay;
		this.gender = gender;
		this.id = id;
		this.create_at = create_at;
		this.store = store;
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
