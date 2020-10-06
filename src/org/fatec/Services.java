package org.fatec;

public class Services {
	String name;
	int id;
	
	public Services(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		String info =  this.name;
		return info;
	}
}	
