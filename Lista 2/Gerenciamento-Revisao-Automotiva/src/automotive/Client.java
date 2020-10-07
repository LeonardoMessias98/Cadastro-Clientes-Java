package automotive;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Client implements Serializable{
	public String id;
	public String name;
	public String phone;
	public String address;
	public String document;
	public int dealership;
	
	public Client( String id, String name, String phone, String address, String document, int dealership) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.document = document;
		this.dealership = dealership;
	}

	@Override
	public String toString() {
		String info = 
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=" +
				"\n\n  Clientes  " + 
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=" +
				"\nId: " + id + 
				"\nNome: " + name + 
				"\nTelefone: " + phone + 
				"\nEndereço: " + address + 
				"\nRG/CPF: " + document + 
				"\nConcessionária: " + dealership +
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=";
		
		return info;
	}
}