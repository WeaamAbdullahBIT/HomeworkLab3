public class ex1 {
    public static void main(String[] args) {
        System.out.println("What do these code fragments print:");
        System.out.println("___________________________________");
        System.out.println("(A) :");
        int n = 1;
        int m = -1;
        if (n < -m)
        { System.out.print(n); }
        else { System.out.println(m); }
        System.out.println("___________________________________");
        System.out.println("(B) :");
        int z = 1;
        int y = -1;
        if (-z >= y)
        { System.out.print(z); }
        else { System.out.print(y); }
        System.out.println("___________________________________");
        System.out.println("(C) :");
        double j = 0;
        double h = 1;
        if (Math.abs(j - h) < 1)
        { System.out.print(j); }
        else { System.out.print(h); }
        System.out.println("___________________________________");
        System.out.println("(D) :");
        double p = Math.sqrt(2);
        double u = 2;
        if (p * p == u)
        { System.out.print(p); }
        else { System.out.print(u); }
    }



}
