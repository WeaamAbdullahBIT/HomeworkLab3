import java.util.Scanner;
public class ex3 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        if (input.hasNextLong())
        {

            long x = input.nextLong();

            if (x < 0)
            {
                x*=-1; // x *-1
            }
            if (x >= 10000000000L) //10000000000
            {
                System.out.println("Number is greater or equals 10000000000");
            }
            else
            {
                int digits = 1 ;
                if (x >= 10 && x < 100)
                {
                    digits = 2;
                }
                else if (x >= 100 && x < 1000)
                {
                    digits = 3;
                }
                else if (x >= 1000 && x < 10000)
                {
                    digits = 4;
                }
                else if (x >= 10000 && x < 100000)
                {
                    digits = 5;
                }
                else if (x >= 100000 && x < 1000000)
                {
                    digits = 6;
                }
                else if (x >= 1000000 && x < 10000000)
                {
                    digits = 7;
                }
                else if (x >= 10000000 && x < 100000000)
                {
                    digits = 8;
                }
                else if (x >= 100000000 && x < 1000000000)
                {
                    digits = 9;
                }
                else if (x >= 1000000000 && x < 10000000000L)
                {
                    digits = 10;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        }
        else
        {
            System.out.println("The number is not an integer");
        }
    }
}
