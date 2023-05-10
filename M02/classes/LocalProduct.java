package classes;
import java.lang.*;

public class LocalProduct extends Product
{
	private double discountRate;
	
	public void setDiscountRate(double discountRate)
	{
		this.discountRate = discountRate;
	}
	public double getDiscountRate()
	{
		return discountRate;
	}
	public void showInfo()
	{
		System.out.println("Pid: "+getPid());
		System.out.println("Name: "+getName());
		System.out.println("AvailableQuantity: "+getAvailableQuantity());
		System.out.println("Price: "+getPrice());
		System.out.println("Discount Rate: "+getDiscountRate());
		System.out.println();
	}
}