package org.fatec;

import java.util.ArrayList;
import java.util.List;

public class ServiceController {
	List<Services> services = new ArrayList<Services>();
	
	public ServiceController() {
		// TODO Auto-generated constructor stub
	}
	
	public void Run() {
		this.services.add(new Services("Design de  sobrancelhas,", "F"));		
		this.services.add(new Services("Manicure", "F"));
		this.services.add(new Services("Pedicure", "F"));
		this.services.add(new Services("Corte  e  pintura   de  cabelo", "F"));
		
		this.services.add(new Services("Corte de cabelo","M"));
		this.services.add(new Services("Modelagem e corte de barba","M"));
		this.services.add(new Services("Tratamento para quedas de cabelo","M"));
	}
	
	public void listServices() {
		this.services.forEach(service -> System.out.println(service));
	}

}
