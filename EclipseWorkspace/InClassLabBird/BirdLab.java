import java.util.ArrayList;
import java.util.Scanner;


public class BirdLab{
	public static void main(String [] args) {
		ArrayList<Bird> birds = new ArrayList<>();
	}
	
	public void DisplayAllBirds(ArrayList<Bird> birds) {
		for(int i = 0; i < birds.size(); i++) {
			birds.get(i).nameType();
			birds.get(i).funFact();
		}
	}
	

	
	
	interface canSwim{
		public int swimTrue();
	}
	
	
	abstract class Bird{
		private String name;
		private int swimSpeed;
		
		public Bird(String name, int swimSpeed) {
			this.name = name;
			this.swimSpeed = swimSpeed;
		}
		
		abstract void funFact();
		public String nameType() {
			return name + " is a ";
		}
		
		@Override
		public String toString(){
			return  " " + name + " " + swimSpeed;
		}
	}
	
	class Penguin extends Bird implements canSwim{
		public Penguin(String name, int swimSpeed) {
			super(name, swimSpeed);
		}
		
		@Override
		public void funFact() {
			System.out.println();
		}
		@Override
		public int swimTrue() {
			return super.swimSpeed;
		}
	}
	
	class Duck extends Bird implements canSwim{
		public Duck(String name, int swimSpeed) {
			super(name, swimSpeed);
		}
		
		@Override
		public void funFact() {
			System.out.println();
		}
		@Override
		public int swimTrue() {
			return super.swimSpeed;
		}
		
	}
	class SootyTern extends Bird{
		public SootyTern(String name, int swimSpeed) {
			super(name, swimSpeed);
		}
		
		@Override
		public void funFact() {
			System.out.println();
		}
	}
	class Ostrich extends Bird{
		public Ostrich(String name, int swimSpeed) {
			super(name, swimSpeed);
		}
		
		@Override
		public void funFact() {
			System.out.println();
		}
	}
	
}