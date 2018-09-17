import java.util.Scanner;

public class Students {
     float averageMarks( int[] grade)
     {
         int sum=0;
         for(int i=0;i<grade.length;i++)
             sum+=grade[i];
         return (sum/grade.length);
     }
     int minimumMarks(int[] grade)
     {
         int min= grade[0];
         for(int i=1;i<grade.length;i++)
             if(grade[i]<min)
                 min=grade[i];
             return min;
     }
     int maximumMarks(int[] grade)
     {
        int max= grade[0];
         for(int i=1;i<grade.length;i++)
             if(grade[i]>max)
                 max=grade[i];
         return max;

     }

    public static void main(String[] args) {
         Students students= new Students();
        System.out.println("enter number of students");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int i;
        int[] grades = new int[number];
        for(i=0;i<number;i++) {
            System.out.println("enter the grade of student (1-100)"+ (i+1));
            grades[i]=input.nextInt();
        }
        float average = students.averageMarks(grades);
        System.out.println("Average marks is "+ average);
        int minimum= students.minimumMarks(grades);
        System.out.println("Minimum marks is "+ minimum);
        int maximum = students.maximumMarks(grades);
        System.out.println("Maximum marks is"+ maximum);
    }
}
