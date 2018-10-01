package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product implements Item {
	private int serialNumber;
	private String manufacturer, name;
	private Date manufacturedOn;
	
	private static int currentProductionNumber = 1;
	
	public Product(String name) {
		this.name = name;
		serialNumber = currentProductionNumber;
		currentProductionNumber++;
		manufacturedOn = new Date();
		System.out.println("Manufacturer: " + MANUFACTURER);
		System.out.println("Serial Number: " + serialNumber);	
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("Date: " + dateFormat.format(manufacturedOn));
		System.out.println("Name: " + name);
	}

	public void setProductionNumber(int number) {
		currentProductionNumber = number;
		
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public Date getManufactureDate() {
		return manufacturedOn;
	}

	public int getSerialNumber() {
		return serialNumber;
	}
	
	public static void main(String[] args) {
		new Product("Ford");
	}
	
	
	
}
