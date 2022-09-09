import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Three Numbers :");
        int x= input.nextInt();
        int y= input.nextInt();
        int z= input.nextInt();
        if (x==y&&y==z)
            System.out.println("All the same");
        else if (x!=y&&y!=z)
            System.out.println("All different");
        else System.out.println("neither otherwise");


    }
}
