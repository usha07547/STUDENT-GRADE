import java.util.Scanner;
public class Gradecalculate {


    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Student Name : ");

        String name=input.next();


        System.out.println("Enter The Six Subject Marks : ");

        int m1 = input.nextInt();
        int m2 = input.nextInt();
        int m3 = input.nextInt();
        int m4 = input.nextInt();
        int m5 = input.nextInt();
        int m6 = input.nextInt();

        int tot = m1+m2+m3+m4+m5+m6;

        float per = tot/6;

        System.out.println("----  STUDENT DETAILS ARE  ----");
        System.out.println("The Student name is : "+name);
        System.out.println("The Total marks are: "+tot);
        System.out.println("The Percentage is: "+ per);

        if(per>=90)
            System.out.println("The Grade is : 'A' ");

        else if(per>=70)
            System.out.println("The Grade is : 'B' ");

        else if(per>=40)
            System.out.println("The Grade is : 'C' ");
        else
            System.out.println("The Grade is : 'D' ");

        System.out.println("----  THANK YOU  ----");
    }

}
