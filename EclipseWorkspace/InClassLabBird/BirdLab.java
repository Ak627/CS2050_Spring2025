public class BirdLab{
	public static void main(String [] args) {
		
	}
	
	
	interface canSwim{
		public void swimTrue();
	}
	abstract class Bird{
		private String type;
		private String name;
		private int swimSpeed;
		
		abstract void funFact();
		@Override
		public String toString(){
			return type + " " + name + " " + swimSpeed;
		}
	}
	
	
}