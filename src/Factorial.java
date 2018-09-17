public class Factorial {

     long factorial(int i)
    {   if(i>=1)
        return i * factorial(i-1);
        else
        return 1;
    }
    public static void main(String[] args) {
         int i=1, max=Integer.MAX_VALUE;
         long facts=1;
         Factorial fact= new Factorial();
        do {
            facts=fact.factorial(i);
            System.out.println("Factorial of "+ i + " is " + facts);
            i++;
        }while(fact.factorial(i)<max);

    }
}
