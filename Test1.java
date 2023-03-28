import java.util.Scanner;

public class Test1{

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double P = Math.PI;
        double L = 2 * P * r;
        System.out.println("Длина окружности = " + L);

    }
}
