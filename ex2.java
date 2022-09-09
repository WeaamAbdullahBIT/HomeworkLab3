import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer number :");
        int x= input.nextInt();
        if (x>0)
            System.out.println("positive");
        else if (x<0)
            System.out.println("negative");
        else System.out.print("zero");
    }
}
