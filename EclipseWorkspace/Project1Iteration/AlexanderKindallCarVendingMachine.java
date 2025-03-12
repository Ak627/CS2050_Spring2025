public class AlexanderKindallCarVendingMachine{

public static void main(String [] args) {
	System.out.println("hello world!");
}



public class Car{
	private String CarBrand;
	private String CarType;
	private double price;
	private int year;
	public Car(String CarBrand, String CarType, int year, double price) {
		this.CarBrand = CarBrand;
		this.CarType = CarType;
		this.price = price;
		this.year = year;
	}
	
	public String getBrand() { return CarBrand; }
	public String getType() { return CarType; }
	public double getPrice() { return price; }
	public int getYear() { return year; }

}

public class VendingMachine{
	
	public VendingMachine() {
		
	}
	
	
}
}