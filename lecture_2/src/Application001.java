import java.io.File;

public class Application001 {
    public static void main(String[] args) {
        Object object = new String("123");
        File file = (File) object;
        System.out.println(file);
    }
}
