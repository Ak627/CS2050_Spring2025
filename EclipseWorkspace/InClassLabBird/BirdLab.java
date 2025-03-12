public class BirdLab{
	public static void main(String [] args) {
		
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
	
	
}