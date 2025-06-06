class Animal{
	private String name;
	private String food;
	private int weight;
	private int sleep;
	private String location;
	
	public Animal(String name, String food, int weight, int sleep, String location) { // constructor
		this.name = name;
		this.food = food;
		this.weight = weight;
		this.sleep = sleep;
		this.location = location;
	}
	
	//getters, no need for setters in this code
	public String GetName() {
		return this.name;
	}
	public String GetFood() {
		return this.food;
	}
	public int GetWeight() {
		return this.weight;
	}
	public int GetSleep() {
		return this.sleep;
	}
	public String GetLocation() {
		return this.location;
	}
	
	//general methods for animals
	public void eat() {
		System.out.println("Animal eats.");
	}
	public void sleep() {
		System.out.println("Animal sleeps");
	}
	public void swim() {
		System.out.println("Animal swims");
	}
	
	@Override
    public String toString() {
        return "Name: " + name + " - Weight: " + weight + "kg - Sleep: " + sleep + " hours - Location: " + location;
}
}


class Bear extends Animal{
	public Bear(String name, String food, int weight, int sleep, String location) {
		super(name, food, weight, sleep, location);
	}
	
	@Override
	public void eat() {
		System.out.println("Bear eats.");
	}
	
	@Override
	public void sleep() {
		System.out.println("Bear sleeps.");
	}
	
	@Override
	public void swim() {
		System.out.println("Bear swims.");
	}
}


class Elephant extends Animal{
	public Elephant(String name, String food, int weight, int sleep, String location) {
		super(name, food, weight, sleep, location);
	}
	
	@Override
	public void sleep() {
		System.out.println("Elephant sleeps.");
	}
}

class Monkey extends Animal{
	public Monkey(String name, String food, int weight, int sleep, String location) {
		super(name, food, weight, sleep, location);
	}
	@Override
	public void eat() {
		System.out.println("Monkey eats.");
	}
	
	@Override
	public void swim() {
		System.out.println("Monkey swims.");
	}
}

class Sloth extends Animal{
	public Sloth(String name, String food, int weight, int sleep, String location) {
		super(name, food, weight, sleep, location);
	}
}