package classes;
 
import java.lang.*;

public class ImportedProduct extends Product
{
	private String countryName;
	
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	public String getCountryName()
	{
		return countryName;
	}
	public void showInfo()
	{
		System.out.println("Pid: "+getPid());
		System.out.println("Name: "+getName());
		System.out.println("Available Quantity: "+getAvailableQuantity());
		System.out.println("Price: "+getPrice());
		System.out.println("Country Name: "+ getCountryName());
		System.out.println();
	}
}