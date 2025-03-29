import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AlexanderKindallCarVendingMachine{

public static void main(String [] args) throws FileNotFoundException{
	int fileChoice = 1;
	VendingMachine VM = new VendingMachine();
	Scanner fileScanner = new Scanner(new File("cars" + fileChoice +".txt"));
	while (fileScanner.hasNextLine()) {
		int x = Integer.parseInt(fileScanner.next());
		int y = Integer.parseInt(fileScanner.next());
		fileScanner.nextLine();
		String brand = fileScanner.next();
		String type = fileScanner.next();
		int year = Integer.parseInt(fileScanner.next());
		fileScanner.nextLine();
		double price = Double.parseDouble(fileScanner.next());
		fileScanner.nextLine();
        VM.addCar(new Car(x,y, brand, type, year, price));
    }
	fileScanner.close();
	boolean exit = false;
	while(exit != true) {
		
	}
}



public static class Car{
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

public static class VendingMachine{
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
	
	public void retrieveCar(int x, int y) {
		if(floors[x][y] != null) {
		System.out.println("Car at position [" + x + "][" + y + "] is a " 
							+ floors[x][y].getBrand() + "," 
							+ floors[x][y].getType());
		}
		else {
			System.out.println("There is no car at position [" + x + "][" + y + "]");
		}
		
	}
	
	public void showVendingMachine() {
		for(int i = 0; i < floors.length; i ++) {
			System.out.println("Floor " + i+1 + ":");
			System.out.println();
			for(int j = 0; j < floors[i].length; j++) {
				if(floors[i][j] != null) {
					System.out.println("Space " + j+1 + ": " 
							+ floors[i][j].getBrand() + " " 
							+ floors[i][j].getType() + " "
							+ floors[i][j].getYear() + " - $"
							+ floors[i][j].getPrice());
				}
				else {
					System.out.println("Space " + j+1 + ": EMPTY");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public void sortCar(int choice) {
		int rows = floors.length;
		int columns = floors[0].length;
		Car [] sortedArray = new Car[rows * columns];
		int index = 0;
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < columns; j++) {
                sortedArray[index++] = floors[i][j];
            }
        }
		if(choice == 0) {
			for (int i = 0; i < sortedArray.length - 1; i++) {
		        int minIndex = i;
		        for (int j = i + 1; j < sortedArray.length; j++) {
		            if (sortedArray[j].year < sortedArray[minIndex].year) minIndex = j;
		        }
		        Car temp = sortedArray[minIndex];
		        sortedArray[minIndex] = sortedArray[i];
		        sortedArray[i] = temp;
		    }

		}
		else if(choice == 1) {
			for (int i = 0; i < sortedArray.length - 1; i++) {
		        int minIndex = i;
		        for (int j = i + 1; j < sortedArray.length; j++) {
		            if (sortedArray[j].price < sortedArray[minIndex].price) minIndex = j;
		        }
		        Car temp = sortedArray[minIndex];
		        sortedArray[minIndex] = sortedArray[i];
		        sortedArray[i] = temp;
		    }
		}
		for(int i = 0; i < sortedArray.length;i++) {
			System.out.println(sortedArray[i].getBrand() + " " 
					+ sortedArray[i].getType() + " "
					+ sortedArray[i].getYear() + " - $"
					+ sortedArray[i].getPrice());
			System.out.println();
		}
	}
	
	
}
}