package interfaces;
import classes.Product;


public interface ProductOperations
{
	boolean insertProduct(Product p);
	boolean removeproduct(Product p);
	Product searchProduct(String pid);
	void showAllProducts();
}