import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        // months numbers
        int month = 12;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The number of the month to know the days of this month: ");
        month= input.nextInt();
        //Switch statement
        switch (month) {
            //case statements within the switch block

            case 1:
                System.out.println("31 Days");//January
                break;

            case 2:
                System.out.println("28 Days");// February
                break;

            case 3:
                System.out.println("30 Days");//March
                break;

            case 4:
                System.out.println("30 Days"); //April
                break;

            case 5:
                System.out.println("31 Days"); //May
                break;

            case 6:
                System.out.println("30 Days"); //june
                break;

            case 7:
                System.out.println("30 Days"); //july
                break;
            case 8:
                System.out.println("31 Days"); //august
                break;
            case 9:
                System.out.println("30 Days"); //september
                break;
            case 10:
                System.out.println("31 Days"); //october
                break;
            case 11:
                System.out.println("30 Days"); //November
                break;
            case 12:
                System.out.println("31 Days"); //december
                break;
            default:
                System.out.println("Invalid Month!");
                break;
        }
    }
}