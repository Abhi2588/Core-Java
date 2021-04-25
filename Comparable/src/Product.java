
public class Product implements Comparable<Product> {
	
	private int price;
	private String name;
	
	public Product(int p , String n)
	{
		this.price=p;
		this.name=n;
	}
	
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int n)
	{
		this.price=n;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	
	@Override
	public int compareTo(Product o)
	{
		if(o.price==this.price)
		{
			return 0;
		}
		if(this.price>o.price)
		{
			return 1;
		}
		else
			return -1;
		
	}

}
