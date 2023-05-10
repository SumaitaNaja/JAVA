package interfaces;
import classes.Product;


public interface ProductOperations
{
	boolean insertProduct(Product p);
	boolean removeproduct(product p);
	Product searchProduct(string pid);
	void showAllProducts();
}