package fr.formation.inti.file;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import fr.formation.inti.entities.Employee;
// Serializable
// toString
public class ObjectFile{
	public static void saveEmploye( Employee e) {
		 File file = new File("C:\\Users\\IN-LL-030\\Desktop\\test");
		
		 try {
			 FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream obj = new ObjectOutputStream(fos);
			obj.writeObject(e);
			obj.close();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	 }
	 
	 public static void getEmployee () {
		 File file = new File("C:\\Users\\IN-LL-030\\Desktop\\test");
			
		 try {
			 FileInputStream fos = new FileInputStream(file);
			ObjectInputStream obj = new ObjectInputStream(fos);
			Employee a = (Employee) obj.readObject();
			System.out.println(a.toString());
			obj.close();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }

	}
