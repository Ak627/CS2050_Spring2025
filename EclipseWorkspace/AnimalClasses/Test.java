import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 

public class Test{
	public static void main(String [] args) throws IOException, FileNotFoundException{
		
		
		// check if File exists or not 
        FileReader AnimFile =null; 
        try
        { 
            AnimFile = new FileReader("Animals"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
        
        AnimFile.close();
	}
}