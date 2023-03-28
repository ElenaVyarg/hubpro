import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner scc = new Scanner(System.in);
        int b = scc.nextInt();

        double c = Math.sqrt(b);
         if (c < a) {

             System.out.println( b * 5);
             b = b * 5;
         }


        System.out.println(a);
        System.out.println(b);




    }
}
