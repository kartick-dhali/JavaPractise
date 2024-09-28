import java.io.File;
import java.io.IOException;

//file creation
public class FileHandling1 {
    public static void main(String[] args) {
        try {
            File file = new File("new.txt");
            if (file.createNewFile()) {
                System.out.println("File Created.." + file.getName());
            } else {
                System.err.println("File already exist.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
