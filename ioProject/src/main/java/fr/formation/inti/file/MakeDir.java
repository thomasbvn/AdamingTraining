package fr.formation.inti.file;
 
import java.io.File;
 
public class MakeDir {
 
    public static void main(String[] args) {
 
        File dir1 = new File("E:/test2/test3/test5");
 
        System.out.println("Pathname: " + dir1.getAbsolutePath());
        System.out.println("Path Exists? " + dir1.exists());
        System.out.println("Parent Path Exists? " + dir1.getParentFile().exists());
 
        // Avec mkdir(), le répertoire est uniquement créé  si le répertoire parent existe.
        boolean created = dir1.mkdir();
 
        System.out.println("Directory created? " + created);
 
        System.out.println("--------------------");
 
        File dir2 = new File("E:/test2/test3/test4/test5");
 
        System.out.println("Pathname: " + dir2.getAbsolutePath());
        System.out.println("Exists? " + dir2.exists());
 
        //  
        created = dir2.mkdirs();
 
        System.out.println("Directory created? " + created);
    }
 
}