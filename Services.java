package org.fatec;

public class Services {
	String name;
	String toGender;
	
	public Services(String name, String gender) {
		this.name = name;
		this.toGender = gender;
	}
	
	@Override
	public String toString() {
		String info = "Serviço: " + this.name + "\nQuem pode consumir: Genero " + toGender + "\n";
		return info;
	}
}	
