package b1;

import java.util.ArrayList;
import java.util.Scanner;
public class Product 
{
	String description ;
	String ProductID;
	double price;
	@Override
	public String toString() {
		return "Product [description=" + description + ", ProductID=" + ProductID + ", price=" + price + "]";
	}
	public Product() {}
	public Product(String description, String productID, double price) {
		this.description = description;
		ProductID = productID;
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductID() {
		return ProductID;
	}
	public void setProductID(String productID) {
		ProductID = productID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
}
 class Oderdetail extends Product
 {
	 int quality;
	 Product product;
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Oderdetail(int quality, Product product) {
		this.quality = quality;
		this.product = product;
	}
	 double calcTotalPrice() 
	 {
		 return price*quality;
	 }
 }
 class LocalDate
 {
	 int day,month,year;
 }
 class Order extends Oderdetail
 {
 public Order(int quality, Product product) {
		super(quality, product);
		
	}
int OrderID;
 LocalDate OrderDate;
 ArrayList< Oderdetail > lineitem = new ArrayList<>();
 int count;
 public void addLineItem(Product p , int x)
 {
    
	lineitem.add(new Oderdetail (x,p));
 }
 public void calcTotalCharge() 
 {
	 for( count=0 ; count<20 ; count ++)
	 {
		 double tong = count* calcTotalPrice();
	 }
 }

}
 class list
 {
	 Scanner sc = new Scanner (System.in);
	Product p ; int x;
	Order od = new Order(x,p);
	void nhap() 
	{
	 System.out.println("nhap ma sp ");
	 od.ProductID =sc.nextLine();
	 System.out.println("nhap chi tiet ");
	 od.description =sc.nextLine();
	 System.out.println("nhap don gia ");
	 od.price =sc.nextDouble();
	 System.out.println("nhap ma sp ");
	 od.quality =sc.nextInt();
	 od.lineitem.add(od);
	}
	void xuat() 
	{
		for(int i =0 ; i<20 ;i++) 
		{
			System.out.printf("%s   %s   %f   %d   %f ",od.ProductID,od.description,od.price,od.quality,od.calcTotalPrice());
		}
	}
 }
 class n
 {
	
	 public static void main (String[] arg)
	 {
		 int n;
		 list l = new list();
		 Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 for(int i =0;i< n ; i++ ) 
		 {
			 l.nhap();
		 }
		 
	 }
	 
 }