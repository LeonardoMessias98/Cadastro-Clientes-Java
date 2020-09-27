package org.fatec;

import java.util.Date;

public class Client {
	String name;
	String phone;
	String birthDay;
	String gender;
	String id;
	Date create_at;
	
	public Client( String id, String name, String phone, String birthDay, String gender, Date create_at) {
		this.name = name;
		this.phone = phone;
		this.birthDay = birthDay;
		this.gender = gender;
		this.id = id;
		this.create_at = create_at;
	}
	
	@Override
	public String toString() {
		String info =
					"\nId: " + id +
					"\nNome: " + name + 
					"\nTelefone: " + phone + 
					"\nData de nascimento: " + birthDay + 
					"\nGenero: " + gender +
					"\nCriado em: " + create_at;
		
		return info;
	}
}
