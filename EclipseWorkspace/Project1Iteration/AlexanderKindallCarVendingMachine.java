import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;

public class AlexanderKindallCarVendingMachine{

public static void main(String [] args) throws FileNotFoundException, InputMismatchException{
	Scanner UserInput = new Scanner(System.in);
	System.out.println("Enter the number of floors for the car vending machine: ");
	int rows = UserInput.nextInt();
	System.out.println("Enter the number of spaces for the car vending machine: ");
	int columns = UserInput.nextInt();
	
	VendingMachine VM = new VendingMachine(rows,columns);
	
	boolean exit = false;
	while(exit != true) {
		System.out.println("=== Car Vending Machine ===");
		System.out.println("1. Load Car Data");
		System.out.println("2. Display Vending Machine");
		System.out.println("3. Retrieve a Car");
		System.out.println("4. Print Sorted Inventory (Price)");
		System.out.println("5. Print Sorted Inventory (Year)");
		System.out.println("6. Exit");
		System.out.println("Enter your Choice: ");
		int choice = UserInput.nextInt();
		UserInput.nextLine();
		switch(choice) {
		case 1:
			System.out.println("Enter the file name: ");
			String fileName = UserInput.nextLine();
			Scanner fileScanner = new Scanner(new File(fileName));
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] data = line.split("\\s+");
				
				int x = Integer.parseInt(data[0]);
		        int y = Integer.parseInt(data[1]);
		        int year = Integer.parseInt(data[2]);
		        double price = Double.parseDouble(data[3]);
		        String brand = data[4];
		        String type = data[5];
		        
		        VM.addCar(new Car(x,y, brand, type, year, price));
		    }
			fileScanner.close();
			break;
		case 2:
			VM.showVendingMachine();
			break;
		case 3:
			System.out.println("Where would you like to retrieve the car from?");
			int posX = UserInput.nextInt();
			int posY = UserInput.nextInt();
			UserInput.nextLine();
			VM.retrieveCar(posX, posY);
			break;
		case 4:
			VM.sortCar(1);
			break;
		case 5:
			VM.sortCar(0);
			break;
		case 6:
			System.out.println("GoodBye!");
			exit = true;
			break;
		default:
			System.out.println("Invalid input! Try again!");
			break;
		}
	}
	UserInput.close();
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
	public VendingMachine(int x, int y) {
		floors = new Car[x][y];
	}
	public void addCar(Car carObj) {
		if (carObj.x >= floors.length || carObj.y >= floors[0].length) {
	        System.out.println("Cannot add " + carObj.CarBrand + " " + carObj.CarType + " to non-existent Slot");
	    } else {
	        // Check if the position is already occupied
	        if (floors[carObj.x][carObj.y] == null) {
	            floors[carObj.x][carObj.y] = carObj;  // Add car to the slot
	        } else {
	            System.out.println("Cannot add " + carObj.CarBrand + " " + carObj.CarType + " Car already in position: Row[" + carObj.x + "] Column[" + carObj.y + "]");
	        }
	    }
	}
	
	public void retrieveCar(int x, int y) {
		if (x >= floors.length || y >= floors[0].length) {
			System.out.println("Car slot does not exist!");
		}else {
			if(floors[x][y] != null) {
			System.out.println("Car at position [" + x + "][" + y + "] is a " 
								+ floors[x][y].getBrand() + " " 
								+ floors[x][y].getType());
			}
			else {
				System.out.println("There is no car at position [" + x + "][" + y + "]");
			}
		}
		
	}

	public void showVendingMachine() {
		for(int i = 0; i < floors.length; i ++) {
			System.out.println("Floor " + i + ":");
			System.out.println();
			for(int j = 0; j < floors[i].length; j++) {
				if(floors[i][j] != null) {
					System.out.println("Space " + j + ": " 
							+ floors[i][j].getBrand() + " " 
							+ floors[i][j].getType() + " "
							+ floors[i][j].getYear() + " - $"
							+ floors[i][j].getPrice());
				}
				else {
					System.out.println("Space " + j + ": EMPTY");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public void sortCar(int choice) {
		int rows = floors.length;
		int columns = floors[0].length;
		// Count the number of non-null elements first
		int nonNullCount = 0;
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < columns; j++) {
		        if (floors[i][j] != null) {
		            nonNullCount++;
		        }
		    }
		}

		// Create a new array with the exact size needed
		Car[] sortedArray = new Car[nonNullCount];
		int index = 0;

		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < columns; j++) {
		        if (floors[i][j] != null) {
		            sortedArray[index++] = floors[i][j];  // Add non-null values to the array
		        }
		    }
		}
		if(choice == 0) {
			for (int i = 0; i < sortedArray.length - 1; i++) {
		        int minIndex = i;
		        for (int j = i + 1; j < sortedArray.length; j++) {
		        	if(sortedArray[j] == null) {
		        		if (sortedArray[j].year < sortedArray[minIndex].year) minIndex = j;
		        	}
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
		        	if(sortedArray[j] != null) {
		        		if (sortedArray[j].price < sortedArray[minIndex].price) minIndex = j;
		        	}
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