import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("Введите данные радиуса круга");
        Scanner sc = new Scanner(System.in);
        double cir = sc.nextDouble();
        System.out.println("Введите данные стороны квадрата");
        Scanner scс = new Scanner(System.in);
        double qua = scс.nextDouble();

        if (cir > qua) {
            System.out.println("Радиус круга больше стороны квадрата");
        }
        if (cir < qua) {
            System.out.println("Сторона квадрата больше радиуса круга");
        }
        if (cir == qua) {
            System.out.println("Равны");
        }
    }
}
