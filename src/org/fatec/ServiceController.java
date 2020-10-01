package org.fatec;

import java.util.ArrayList;
import java.util.List;

public class ServiceController {
	List<Services> services = new ArrayList<Services>();
	
	public ServiceController() {
		// TODO Auto-generated constructor stub
	}
	
	public void Run() {
		this.services.add(new Services("[1] - Design de  sobrancelhas,", "F"));		
		this.services.add(new Services("[2] - Manicure", "F"));
		this.services.add(new Services("[3] - Pedicure", "F"));
		this.services.add(new Services("[4] - Corte e pintura de cabelo", "F"));
		this.services.add(new Services("[5] - Remoção de manchas na pele", "F"));
		this.services.add(new Services("[6] - Aplicação de botox", "F"));
		this.services.add(new Services("[7] - Tratamento para emagrecimento", "F"));
		this.services.add(new Services("[8] - Redução de medidas", "F"));
		
		this.services.add(new Services("[9] - Corte de cabelo","M"));
		this.services.add(new Services("[10] - Modelagem e corte de barba","M"));
		this.services.add(new Services("[11] - Tratamento para quedas de cabelo","M"));
		this.services.add(new Services("[12] - Produtos especializados","M"));		
	}
	
	public void listServices() {
		this.services.forEach(service -> System.out.println(service));
	}
}
