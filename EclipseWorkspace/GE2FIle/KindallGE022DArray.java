import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program demonstrates a two-dimensional array.
 */

public class KindallGE022DArray{
  public static void main(String[] args){
	  Car[][] cars = new Car[2][3];
	  Scanner input = new Scanner(System.in);
	  for(int i =0; i < cars.length; i ++) {
		  for(int j = 0; j< cars[i].length; j ++) {
			  String make = input.nextLine();
			  cars[i][j] = new Car(make);
			  
		  }
		  
	  }
	  tablePrint(cars);
	  
	  input.close();
  }
  
  
  
  public static void tablePrint(Car[][] cars) {
		for(int i =0; i < cars.length; i ++) {//iterates through the rows of cars
			  for(int j = 0; j< cars[i].length; j ++) {//iterates through the columns of cars
				  cars[i][j].printMake(); //calls the car objects printMake method
			  }
			  System.out.println();//after the first row is finished put a space down to make a table.
		  }
	}

}


class Car{
	private String make;

	public Car() { 
		this.make = "Unknown"; 
	}
		
	public Car(String make) {
	 	   this.make = make;
	}

	public void printMake() {
	   System.out.print(this.make + " ");
	}
	} // Car