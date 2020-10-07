package automotive;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClientController {
	List<Client> clients = new ArrayList<>();
	List<Vehicle> vehicles = new ArrayList<>();
	
	public String generateHexCode() {
        Random random = new Random();
        int val = random.nextInt();
        String Code = new String();
        Code = Integer.toHexString(val);
        
        return Code;
	}
	
	public void Register_client(String name, String phone, String address, String document, int dealership ) {
		this.clients.add(new Client(this.generateHexCode(), name, phone, address, document, dealership));
	}
	
	
	public void Register_vehicle(String carLicensePlate, String model, String yearOfManufacture, String price) {
		this.vehicles.add(new Vehicle(model, carLicensePlate, yearOfManufacture, price));
	}
	

	public void Listing() {
		this.clients.forEach(client -> System.out.println(client));
		this.vehicles.forEach(vehicle -> System.out.println(vehicle));
		if(clients.isEmpty()) {
			System.out.println("Não há clientes cadastrados no sistema.");
		}
	}

}