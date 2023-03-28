import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(greeaten(a));

    }

    public static boolean greeaten(int a) {
        boolean result  = true;

        if (a < 5) {
            result = false;
        }
        return result;

    }
}
