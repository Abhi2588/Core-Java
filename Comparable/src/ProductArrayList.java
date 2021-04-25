import java.util.ArrayList;
import java.util.Collections;

public class ProductArrayList {

	public static void main(String[] args) {
		Product p1 = new Product(2000, "Tshirt");
		Product p2 = new Product(20000, "Mobile");
		
		ArrayList<Product>al=new ArrayList<>();
		al.add(p1);
		al.add(p2);
		
		Collections.sort(al);
		
		for(Product p : al)
		{
			System.out.println(p.getPrice()+" "+p.getName());
		}
	}

}
