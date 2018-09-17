import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FrequencyOfWords {

    public static void main(String[] args) throws IOException{

        File file = new File("/home/user/PracticeExcercise2/src/file.txt");
        StringBuffer content= new StringBuffer();
        Scanner scanner= new Scanner(file);
        while(scanner.hasNextLine()){
            content.append(scanner.nextLine());
        }
        StringBuffer copy=content;
        for(int i=0;i<copy.length();i++)
        {   int count=1;
            for(int j=i+1;j<copy.length();j++)
            {
                if(copy.charAt(i)==copy.charAt(j)){
                    count++;
                    copy.deleteCharAt(j);
                }
            }
            System.out.println("frequency of character "+ copy.charAt(i) +" is "+ count);
        }

    }
}
