import java.io.*;
import java.util.*;
	

public class Test{
	public static void main(String [] args) throws InputMismatchException, FileNotFoundException{
		
	    String AnimFile = "Animals.txt";

        try {
            // Create a scanner to read the file
            Scanner scanner = new Scanner(new File(AnimFile));

            // Read the size of the array (first value in the file)
            int MaxAnimal =  Integer.parseInt(scanner.next());
            scanner.nextLine(); // To skip the newline after the integer

            // Create a polymorphic array to store Animal objects
            Animal[] animals = new Animal[MaxAnimal];

            // Loop to read animal data and create corresponding objects
            for (int i = 0; i < MaxAnimal; i++) {
                String type = scanner.next();
                String name = scanner.next();
                String food = scanner.next();
                int weight = scanner.nextInt();
                int sleep = scanner.nextInt();
                String location = scanner.next();
                scanner.nextLine();
                
                // Create specific animal object based on the type
                Animal animal = null;

                if (type.equals("Bear")) {
                    animal = new Bear(name, food, weight, sleep, location);
                } else if (type.equals("Elephant")) {
                    animal = new Elephant(name, food, weight, sleep, location);
                } else if (type.equals("Sloth")) {
                    animal = new Sloth(name, food, weight, sleep, location);
                } else if (type.equals("Monkey")) {
                    animal = new Monkey(name, food, weight, sleep, location);
                }

                // Place the animal object into the array
                animals[i] = animal;
            }

            // Now iterate through the array and display information
            for (int i = 0; i < animals.length; i++) {
                Animal currentAnimal = animals[i];

                // Determine the type using instanceof
                if (currentAnimal instanceof Bear) {
                    System.out.println("Animal[" + i + "] is a Bear");
                } else if (currentAnimal instanceof Elephant) {
                    System.out.println("Animal[" + i + "] is an Elephant");
                } else if (currentAnimal instanceof Sloth) {
                    System.out.println("Animal[" + i + "] is a Sloth");
                } else if (currentAnimal instanceof Monkey) {
                    System.out.println("Animal[" + i + "] is a Monkey");
                }

                // Display the name, weight, sleep, and location
                System.out.println(currentAnimal.toString());

                // Call the methods eat, sleep, swim
                currentAnimal.eat();
                currentAnimal.sleep();
                currentAnimal.swim();
                System.out.println();
            }

            scanner.close();
        }
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found: " + fe); 
        } 
        catch(InputMismatchException e) {
        	System.out.println("InputMismatchException: " + e);
        }
       
	}
}
	