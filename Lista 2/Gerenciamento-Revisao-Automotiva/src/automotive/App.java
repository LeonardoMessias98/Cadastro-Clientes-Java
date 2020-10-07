package automotive;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class App {
	@SuppressWarnings("unchecked")
	public void Run(int dealership) throws Exception {
		String path = "/home/raque/revisao-automotiva.txt";

		ScannerController controller = new ScannerController();
		ClientController services = new ClientController();
		ScheduleController scheduling = new ScheduleController();
	
		int choice = 0;

		while (choice != 10) {
			Menu.showMenu();
			choice = controller.opcao();
			
			if (choice == 1) {
				System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("  Cadastro de Clientes  ");
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.print("Digite o nome: ");
				String name = controller.texto();
				
				System.out.println("Digite o telefone: ");
				String phone = controller.texto();
				
				System.out.println("Digite o endereco: ");
				String address = controller.texto();
				
				System.out.println("Digite o RG/CPF: ");
				String document = controller.texto();
				
				System.out.println("Deseja cadastrar um veiculo? (S/N)");
				String op = controller.texto();
				if(op.equals("S") || op.equals("N")) {
					if(op.equals("S")) {
						System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
						System.out.println("  Cadastro de Veiculos  ");
						System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
						System.out.println("Digite a placa do veículo: ");
						String carLicensePlate = controller.texto();
						
						System.out.println("Digite o modelo/versao: ");
						String model = controller.texto();
						
						System.out.println("Digite o ano de fabricacao: ");
						String yearOfManufacture = controller.texto();
						
						System.out.println("Digite o valor de compra: ");
						String price = controller.texto();
						
						services.Register_vehicle(model, carLicensePlate, yearOfManufacture, price);
						System.out.println("\n=-=-  Veiculo cadastrado com sucesso!  -=-=");
					}
					
					
				}else {
					System.out.println("Opcao incorreta!\nPor favor digite S ou N.");
					op = controller.texto();
				}
				
				services.Register_client(name, phone, address, document, dealership);
				System.out.println("\n=-=-  Seu cliente foi cadastrado no sistema!  -=-=");
			}
			
			if (choice == 2) {
				System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("  Listagem de Clientes  ");
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				services.Listing();
			}
			
			
			if(choice == 3) {
				System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("  Agendamento de Revisao  ");
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("Insira o ID do cliente: ");
				String id = controller.texto();
				System.out.println("Digite a data (dd/mm/aa)");
				String date = controller.texto();
				System.out.println("Digite o horario");;
				String hour = controller.texto();
				
				scheduling.Register_schedule(id, date, hour);
				System.out.println("\n=-=-  Agendamento realizado com sucesso!  -=-=");
			}
			
			  
			if (choice == 4) {
				System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("  Exclusao de Agendamento de Revisao  ");
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("Informe o ID do cliente que deseja excluir o agendamento: ");
				String deleteId = controller.texto();
					for (Schedule roam : scheduling.schedule ) {
						if (roam.id.equals(deleteId)) {
							scheduling.schedule.remove(roam);
							System.out.println("\n=-=-  O cadastro do cliente com ID " + deleteId + " foi removido!  -=-=");
							break;
						}
					}
			}
			
		 
			if (choice == 5) {
				System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("  Edicao de Agendamento de Revisao  ");
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("Informe o nome ID do cliente que deseja trocar a data: ");
				String clientName = controller.texto();
					for (Schedule roam : scheduling.schedule ) {
						if (roam.id.equals(clientName)) {
							System.out.println("Informe a nova data: ");
							String newDate = controller.texto();
							roam.date = newDate;
							System.out.println("\n=-=-  A data do agendamento do cliente " + clientName + " foi alterado!  -=-=");
						}
					}
			}

			
			if (choice == 6) {
				System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("  Listagem de Agendamentos de Revisao  ");
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				scheduling.Listing_Schedule();
			}
			
			
			if (choice == 7) {
				FileOutputStream channel = new FileOutputStream(path);
				ObjectOutputStream writer = new ObjectOutputStream(channel);
				writer.writeObject(services.clients);
				writer.writeObject(services.vehicles);
				writer.writeObject(scheduling.schedule);
				writer.close();
				System.out.println("\n=-=-  Cadastros de clientes salvo com sucesso!  -=-=");
			}

			if (choice == 8) {
				System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("  Leitura de Arquivos  ");
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				FileInputStream channel = new FileInputStream(path);
				ObjectInputStream reader = new ObjectInputStream(channel);
				services.clients = (List<Client>) reader.readObject();
				services.vehicles = (List<Vehicle>) reader.readObject();
				scheduling.schedule = (List<Schedule>) reader.readObject();
				reader.close();
				System.out.println("\n=-=-  Cadastros lidos com sucesso!  -=-=");
			}
			
			
			if (choice == 9) {
				System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("  Relatorios  ");
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				FileWriter file = new FileWriter("C:\\Users\\Silvio\\Desktop\\relat�rio.txt");
			    PrintWriter saveFile = new PrintWriter(file);
			    
			    services.clients.forEach(person -> saveFile.print(person));
			    services.vehicles.forEach(car -> saveFile.print(car));			    
			    scheduling.schedule.forEach(schedule -> saveFile.print(schedule));
				System.out.println("\n=-=-  Relatorio gerado com sucesso!  -=-=");
				file.close();
			}
		}
		
		System.out.println("\n=-=-  Até mais!  -=-=");
	}
}