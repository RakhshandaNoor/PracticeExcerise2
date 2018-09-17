import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ReadFile {
    public static void main(String[] args) throws IOException {
        String content="";
        File file = new File("/home/user/PracticeExcercise2/src/file.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            content += scanner.nextLine();
        }
        content= content.toUpperCase();
        System.out.println(content);

    }

}
