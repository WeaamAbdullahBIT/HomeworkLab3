import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Three numbers :");
        int x= input.nextInt();
        System.out.println("______");
        int y= input.nextInt();
        System.out.println("______");
        int z= input.nextInt();
        if (z<y && y<x)
            System.out.println("(decreasing)");
        else if (x<y && y<z)
            System.out.println("(Increasing)");
        else System.out.println("(neither)");
    }
}