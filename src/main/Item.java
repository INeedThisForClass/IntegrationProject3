package main;

import java.util.Date;

public interface Item {
	
	public final String MANUFACTURER = "OraclProduction";
	
	public void setProductionNumber(int number);
	public void setName(String name);
	public String getName();
	public Date getManufactureDate();
	public int getSerialNumber();
	

}
