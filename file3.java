
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 

class file3{
 
    
    public static void main(String[] args)
    {
 
        
 
        // Try block to check for exceptions
        try {
 
           
            FileReader fr = new FileReader("test.txt");
            String str = "";
 
            int i;
            int sum=0;
 
         
            while ((i = fr.read()) != -1) {
 
                // Storing every character in the string
                str += (char)i;
                sum = sum + Integer.parseInt(i);
            }
            System.out.println("Sum="+sum);
            System.out.println(str);
            fr.close();
        }
 
        // Catch block to handle the exception
        catch (IOException e) {
 
            
            System.out.println(
                "There are some IOException");
        }
    }
}

 