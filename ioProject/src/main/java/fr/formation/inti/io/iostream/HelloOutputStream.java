package fr.formation.inti.io.iostream;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
 
public class HelloOutputStream {
 
   public static void main(String[] args) throws IOException {
	   OutputStream w = null;
       try {
           File dir = new File("out");
 
           // Create directories if not exists
           dir.mkdirs();
 
           // Create output Stream write data to file.
           
            
           // Create array of bytes, write it to stream.
           Scanner sc = new Scanner(System.in);
//           System.out.println("entrez un entier :");
//           int a = sc.nextInt();
//           sc.nextLine();
           System.out.println("entrez le nom :");
           String  x = sc.nextLine();
           System.out.println("test");
           
           
           
           
           w = new FileOutputStream("out/test_outputStream.txt");
           byte[] by = x.getBytes();
           for(byte b : by)
        	   w.write(b);
           
           // write turn the bytes into the stream
//           for (int i = 0; i < by.length; i++) {
//               byte b = by[i];
// 
//               // Write 1 byte.
//               w.write(b);
//           }
           
           
       } catch (Exception e) {
           e.printStackTrace();
       }finally {
    	// Close the output stream, finish write file.
    	   if(w != null)
    		   w.close();
	}
       System.out.println("fin programme");
   }
}