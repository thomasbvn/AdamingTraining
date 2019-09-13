package fr.formation.inti.io.readerwriter;
 
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
 
public class HelloReader {
 
    public static void main(String[] args) throws IOException {
        // Créez un Reader (Le flux textes), pour lire un fichier.
        // Avec le codage (encoding) par défaut.
        Reader r = new FileReader("data.txt");
        int i = -1;
 
        // Lisez chaque caractère à leur tour dans le flux.
        while ((i = r.read()) != -1) {
            // Changez (cast) en caractère.
            System.out.println((char) i);
        }
        r.close();
    }
 
}