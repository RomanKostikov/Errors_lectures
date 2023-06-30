import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application001 {
    /*
    использования try with resources
     */
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("C:\\Users\\roman\\Desktop\\Work for IT\\GeekBrains\\lecture\\Errors\\README.md");
             FileWriter writer = new FileWriter("test")) {
            while (reader.ready()){
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successfully");
    }
}