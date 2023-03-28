import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Введите количество очков");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println("Проигрыш");
        }
        if (a == 1) {
            System.out.println("Ничья");
        }
        if (a == 3) {
            System.out.println("Выигрыш");
        }
    }
}
