package fr.formation.inti.io.iostream;
 
import java.io.FileInputStream;
import java.io.InputStream;
 
public class InputStreamExample2 {
 
    public static void main(String[] args) {
        try {
 
            // Create input stream, read a file.
            InputStream in = new FileInputStream("out/test_writerOutputStream.txt");
 
            // A temporary array to store data each reading
            byte[] temp = new byte[10];
            int i = -1;
 
            
            // Reads some number of bytes from the input stream
            // and stores them into the buffer array 'temp'.
            // Return the number of bytes actually read.
            // return -1 if end of stream.
            while ((i = in.read(temp)) != -1) {
 
                // Create String from bytes
                String s = new String(temp, 0, i);
                System.out.println(s);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}