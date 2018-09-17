public class Member {

    String name;
    int age;
    float salary;
    Member()
    {
        name="Harry Potter";
        age=30;
        salary=(float)2500.3;
    }
    public void display()
    {
        System.out.println("Name is "+ name);
        System.out.println("age is "+ age);
        System.out.println("salary is "+ salary);
    }
}
    class MemberVariable{

    public static void main(String[] args) {
        Member member= new Member();
        member.display();



    }
}
