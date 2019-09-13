package fr.formation.inti.io.objstream;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
 
public class ObjectOutputStreamExample {
 
    public static void main(String[] args) throws IOException {
        File dir = new File("out");
 
        // Create directories if not exists.
        dir.mkdirs();
 
 
        // Create stream write to file.
        FileOutputStream fos = new FileOutputStream(
                "out/testObjectStream.txt");
 
        
        // Create ObjectOutputStream object wrap 'fos'.
        // Data written to this stream will be pushed to 'fos'.
        ObjectOutputStream oos = new ObjectOutputStream(fos);
         
         
        // Write String to Stream.
        oos.writeUTF("Exemple d'ecriture");
     
   
        // Note: Write Serializable object only.
        // Write an Object to stream.
        oos.writeObject(new Date());
 
        Stagiaire s1 = new Stagiaire("Pignon", "Alex");
        Stagiaire s2 = new Stagiaire("Spanu", "thomas");
 
        oos.writeObject(s1);
        oos.writeObject(s2);
 
        oos.close();
        System.out.println("Write successful");
    }
 
}