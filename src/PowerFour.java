import java.util.Scanner;

public class PowerFour {

    public int power(int num)
    {
       for(;num!=1;num=num/4)
        if((num % 4)!=0) {
            return 0;
        }
        return 1;

    }

    public static void main(String[] args) {
         PowerFour powerFour= new PowerFour();
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
         int result = powerFour.power(input.nextInt());
         if(result==1)
             System.out.println("number is power of 4");
         else
             System.out.println("not a power of 4");

    }

}
