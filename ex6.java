import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Three Numbers :");
        int x= input.nextInt();
        System.out.println("-----");
        int y= input.nextInt();
        System.out.println("-----");
        int z= input.nextInt();
        if(x<=y && y<=z || z<=y && y<=x)// increasing and decreasing
            System.out.println("in order");
        else System.out.println("not in order");


    }

}
