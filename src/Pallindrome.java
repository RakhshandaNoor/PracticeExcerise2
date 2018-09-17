import java.util.Scanner;

public class Pallindrome {

    public boolean Palli(String a)
    {
        String rev="";
        int i;
        for(i=a.length()-1;i>=0;i--)
            rev= rev + a.charAt(i);
        System.out.println(rev);
        if(rev.equals(a))
            return true;
        else
            return false;


    }

    public static void main(String[] args) {
        boolean b;
        Pallindrome pallindrome= new Pallindrome();
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the string");
        String actual= new String(input.nextLine());
        b=pallindrome.Palli(actual);
        if(b)
            System.out.println("pallindrome");
        else
            System.out.println("not a pallindrome");
    }
}
