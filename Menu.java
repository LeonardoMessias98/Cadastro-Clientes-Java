package org.fatec;

public class Menu {

	public static void MainEscolhas() {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Bem vindo ao Cadastrator");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1 - Cadastrar um cliente");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Remover um cliente");
		System.out.println("4 - Ver relatórios");
		System.out.println("5 - Sair");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void Relatorios() {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Relátorios");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1 - Idade média do publico");
		System.out.println("2 - Serviços mais procurados");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void viewGeneral() {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Você deseja visualizar os dados gerais ou por genero ?");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1 - Visualizar geral");
		System.out.println("2 - Visualizar por genero feminino");
		System.out.println("3 - Visualizar por genero masculinos");

	}
}
