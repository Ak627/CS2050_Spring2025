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
	  for(int i =0; i < cars.length; i ++) {
		  for(int j = 0; j< cars[i].length; j ++) {
			  cars[i][j].printMake();  
		  }
	  }
	  
	  input.close();
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