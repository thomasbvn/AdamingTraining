package fr.formation.inti.io.objstream;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
 
public class ObjectInputStreamExample {
 
    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
 
        // Create stream to read file.
        FileInputStream fis = new FileInputStream(
                "out/testObjectStream.txt");
 
        // Create ObjectInputStream object wrap 'fis'.
        ObjectInputStream ois = new ObjectInputStream(fis);
 
        // Read String.
        String s = ois.readUTF();
 
        System.out.println(s);
 
        // Read Object.
        Date date = (Date) ois.readObject();
        System.out.println("Date = " + date);
 
        Stagiaire s1 = (Stagiaire) ois.readObject();
 
        System.out.println("Stagiaire 1" + s1.getFirstName()); 
 
        Stagiaire s2 = (Stagiaire) ois.readObject();
 
        System.out.println("Stagiaire 2" + s2.getFirstName());
 
        ois.close();
    }
}