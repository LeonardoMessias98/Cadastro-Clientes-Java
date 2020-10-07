package automotive;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Vehicle implements Serializable{
	public String model;
	public String carLicensePlate;
	public String yearOfManufacture;
	public String price;
	
	public Vehicle( String model, String carLicensePlate, String yearOfManufacture, String price) {
		this.model = model;
		this.carLicensePlate = carLicensePlate;
		this.yearOfManufacture = yearOfManufacture;
		this.price = price;
	}
	
	@Override
	public String toString() {
		String info = 
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=" +
				"\n\n  Veículos  " + 
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=" +
				"\nModelo/Versao: " + model + 
				"\nNumero da Placa: " + carLicensePlate + 
				"\nAno de Fabricacao: " + yearOfManufacture + 
				"\nValor de compra: " + price +
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=";
		
		return info;
	}
}