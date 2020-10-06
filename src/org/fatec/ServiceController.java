package org.fatec;

import java.util.ArrayList;
import java.util.List;

public class ServiceController {
	List<Services> services = new ArrayList<Services>();
	
	List<Integer> mostUsed = new ArrayList<>();

	
	public ServiceController() {
		// TODO Auto-generated constructor stub
	}
	
	public void Run() {
		this.services.add(new Services("[1] - Design de  sobrancelhas", 1));		
		this.services.add(new Services("[2] - Manicure", 2));
		this.services.add(new Services("[3] - Pedicure", 3));
		this.services.add(new Services("[4] - Corte e pintura de cabelo", 4));
		this.services.add(new Services("[5] - Remoção de manchas na pele", 5));
		this.services.add(new Services("[6] - Aplicação de botox", 6));
		this.services.add(new Services("[7] - Tratamento para emagrecimento", 7));
		this.services.add(new Services("[8] - Redução de medidas", 8));
		
		this.services.add(new Services("[9] - Corte de cabelo", 9));
		this.services.add(new Services("[10] - Modelagem e corte de barba", 10));
		this.services.add(new Services("[11] - Tratamento para quedas de cabelo", 11));
		this.services.add(new Services("[12] - Produtos especializados", 12));		
	}
	
	public void listServices() {
		this.services.forEach(service -> System.out.println(service));
	}
	
	public void insertInMostUsed (int service) {
		this.mostUsed.add(service);
	}
	
	public void printServices(int service ) {
		
		for (Services each : this.services) {
			if( each.id == service) {
				System.out.println(each.name);
			}
		}
	}
	
	public void printMostUsed() {
		for (int service : this.mostUsed) {
			for (Services each : this.services) {
				if( each.id == service) {
					System.out.println(each.name);
				}
			}
		}
	
	}
}
