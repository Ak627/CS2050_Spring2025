import java.io.*;


public class Test{
	public static void main(String [] args) throws IOException, FileNotFoundException{
		
		
		// check if File exists or not 
        FileReader AnimFile = null; 
        try(BufferedReader br = new BufferedReader(AnimFile = new FileReader("Animals.txt")))
        { 
        	if (br.readLine() != null) {
        		int maxNum = Integer.parseInt(br.readLine());//reads the first line of the file and places that into the variable maxNum
            	
        		Animal[] animals = new Animal[maxNum]; 
            } 
        	else {
                System.out.println("The file is empty.");
            }
        	
        	
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found: " + fe); 
        } 
        catch(IOException e) {
        	System.out.println("IOException: " + e);
        }
        finally {
        	if(AnimFile != null) {
                AnimFile.close();

        	}
        }
	}
}