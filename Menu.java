package org.fatec;

public class Menu {

	public static void Main() {
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("  Bem vindo ao World Beaut  ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1 - Sou cliente");
		System.out.println("2 - Sou admnistrador");
		System.out.println("3 - Sair");
	}
	
	public static void Client() {
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("  Bem vindo ao World Beaut  ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1 - Ver a lista de serviços");
		System.out.println("3- Sair");
	}
	
	public static void Admin() {
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("  Painel do Administrador  ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1 - Cadastrar um cliente");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Remover um cliente");
		System.out.println("4 - Editar um cliente");
		System.out.println("6 - Ver relatórios");
		System.out.println("8 - Sair");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void Listing() {
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("    Listagem de clientes   ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1 - Ordenar por data de criação");
		System.out.println("2 - Ordenar por ordem alfabética");
		System.out.println("3 - Sair");
	}
	

	
	public static void Relatorios() {
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("         Relátorios        ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1 - Idade média do publico");
		System.out.println("2 - Serviços mais procurados");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void viewGeneral() {
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Você deseja visualizar os dados gerais ou por genero ?");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1 - Visualizar geral");
		System.out.println("2 - Visualizar por genero feminino");
		System.out.println("3 - Visualizar por genero masculinos");

	}
}
