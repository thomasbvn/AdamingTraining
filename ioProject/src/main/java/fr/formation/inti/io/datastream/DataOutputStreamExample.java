package fr.formation.inti.io.datastream;
 
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class DataOutputStreamExample {
 
    public static void main(String[] args) throws IOException {
        int cityIdA = 1;
        String cityNameA = "Green Lake City";
        int cityPopulationA = 500000;
        float cityTempA = 15.50f;
 
        int cityIdB = 2;
        String cityNameB = "Salt Lake City";
        int cityPopulationB = 250000;
        float cityTempB = 10.45f;
 
        File dir = new File("out");
        dir.mkdirs();
 
        //
        // Create FileOutputStream write to file.
        //
        FileOutputStream fos = new FileOutputStream("out/cities.txt");
 
        // Create DataOutputStream object wrap 'fos'.
        // The data write to 'dos' will be pushed to 'fos'.
        DataOutputStream dos = new DataOutputStream(fos);
 
        //
        // Write data.
        //
        dos.writeInt(cityIdA);
        dos.writeUTF(cityNameA);
        dos.writeInt(cityPopulationA);
        dos.writeFloat(cityTempA);
 
        dos.writeInt(cityIdB);
        dos.writeUTF(cityNameB);
        dos.writeInt(cityPopulationB);
        dos.writeFloat(cityTempB);
 
        dos.flush();
        dos.close();
    }
 
}