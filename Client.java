package org.fatec;

public class Client {
	String name;
	String phone;
	String birthDay;
	String gender;
	String id;
	
	public Client(String name, String phone, String birthDay, String gender, String id) {
		this.name = name;
		this.phone = phone;
		this.birthDay = birthDay;
		this.gender = gender;
		this.id = id;
	}
	
	@Override
	public String toString() {
		String info =
					"\nId: " + id +
					"\nNome: " + name + 
					"\nTelefone: " + phone + 
					"\nData de nascimento: " + birthDay + 
					"\nGenero: " + gender;
		
		return info;
	}
}
