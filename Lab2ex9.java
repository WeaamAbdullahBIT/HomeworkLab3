import java.util.Scanner;

public class Lab2ex9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int x = input.nextInt();
        System.out.print("Enter 2nd integer: ");
        int y = input.nextInt();

        System.out.println("Sum :"+ (x+y));
        System.out.println("Difference : "+ (x-y));
        System.out.println("Product:"+ (x*y));
        double z=x+y;
        System.out.println("Average :"+ z / 2);
        System.out.println("Distance : "+ Math.abs(x-y));
        System.out.println("Max integer: "+ Math.max(x,y));
        System.out.print("Min integer:"+ Math.min(x,y));
    }
}

