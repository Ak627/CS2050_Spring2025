import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program demonstrates a two-dimensional array.
 */

public class KindallGE022DArray{
  public static void main(String[] args){
	  Car[][] cars = new Car[2][3];
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
}