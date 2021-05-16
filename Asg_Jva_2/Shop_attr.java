package Asg_Jva_2;

public class Shop_attr {
	 String name;
	 String Id;
	 String Category;
	 String release;
	 int price;
	public Shop_attr(String name,String Id,String Category,String release,int price) {
		this.name=name;
		this.Id = Id;
		this.Category = Category;
		this.release = release;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	
	public String getId() {
		return Id;
	}
	public String getCategory() {
		return Category;
	}
	public String getRelease() {
		return release;
	}
	public int getPrice() {
		return price;
	}
	

}
