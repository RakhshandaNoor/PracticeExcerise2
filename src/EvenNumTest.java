import java.util.Scanner;

public class EvenNumTest {

    public static boolean isEven(int number)
    {
        if(number%2==0)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        EvenNumTest.isEven(input.nextInt());


    }
}
