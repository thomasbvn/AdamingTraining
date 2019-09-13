package fr.formation.inti.io.iostream;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
 
public class OutputStreamExample2 {
 
    public static void main(String[] args) {
        try {
            File dir = new File("out");
 
            // Create directories if not exists.
            dir.mkdirs();            
             
            // Create output Stream to write file.
            OutputStream os = new FileOutputStream("out/test_writerOutputStream.txt");
             
            // Create array of bytes, write bytes into the file above.
            byte[] by = new byte[] { 'H', 'e', 'l', 'l', 'o', ' ', 31, 34, 92 };
            byte[] by2 = new byte[] { 'H', 'e', 'l', 'l', 'o', ' ', 'b', 'o',
                    'y' };
             
            // Write all of bytes in array into Stream.
            os.write(by);
             
            // Flush data in memory to file.
            // allows to empty the write buffers to the output medium
            os.flush();
             
            // Continue write the 2nd byte array to the stream
            os.write(by2);
             
            // Close the output stream, finish write file.
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}