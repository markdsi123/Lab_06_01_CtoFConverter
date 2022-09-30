import java.util.Scanner;

public class Main {
    public static void main(String[] args)


    {
        Scanner in = new Scanner(System.in);

        double C = 0;
        double F = 0;
        String trash = "";


        System.out.println("enter temperature in celsius - ");

        if(in.hasNextInt())

        {
            C=in.nextDouble();

            if(C==0)
            {
                System.out.println("you have entered freezing point, it is 32 F");

            }

            else if(C==100)
            {
                System.out.println("you have entered boiling point, it is 212 F");

            }

            else
            {
                F= C * 9/5 + 32;

                System.out.println("your temperature in Fahrenheit is " + F +" F");
            }

        }

        else
        {
            trash =in.nextLine();
            System.out.println("you have entered an invalid number");
        }






    }
}