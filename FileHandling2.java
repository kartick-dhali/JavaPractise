import java.io.FileWriter;
import java.io.IOException;

//file writing
public class FileHandling2 {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("new.txt");
            myWriter.write("This is a a new file for testing java File.");
            myWriter.close();
            System.out.println("Writing is completted.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
