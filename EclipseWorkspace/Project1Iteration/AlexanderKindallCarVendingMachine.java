public class AlexanderKindallCarVendingMachine{

public static void main(String [] args) {
	System.out.println("hello world!");
}



public class Car{
	private String CarBrand;
	private String CarType;
	private double price;
	private int year;
	private int x;
	private int y;
	public Car(int x, int y, String CarBrand, String CarType, int year, double price) {
		this.x = x;
		this.y = y;
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
	private Car floors[][];
	public VendingMachine() {
		System.out.println("Vending Machine Created");
	}
	public void addCar(Car carObj) {
		if (floors[carObj.x][carObj.y] == null){
			floors[carObj.x][carObj.y] = carObj;
		}
		else {
			System.out.println("Car already in position: Row[" + carObj.x + "] Collumn[" + carObj.y + "]");
		}
	}
	
	
}
}