package fr.formation.inti.io.iostream;
 
import java.io.FileInputStream;
import java.io.InputStream;
 
public class HelloInputStream {
 
    public static void main(String[] args) {
        try {
        
            // Create InputStream object from subclass.
            // This is Stream read file.
            InputStream is = new FileInputStream("out/test_outputStream.txt");
 
            int i = -1;
            
            // Read the turn of bytes in the stream.
            // Each time the 8-bit read, convert it to int.
            // Read the value of -1 means the end of the stream.
            while ((i = is.read()) != -1) {
                System.out.println(i + "  " + (char) i);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}