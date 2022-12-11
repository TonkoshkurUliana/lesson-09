package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {

        System.out.println("Введіть перше число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Введіть друге число");
        sc = new Scanner(System.in);
        int b = sc.nextInt();

        Methods m = new Methods();

        double res1 = 0;
        double res2 = 0;
        double res3 = 0;
        double res4 = 0;
        try {
            res1 = m.Plus(a, b);
            res2 = m.Minus(a, b);
            res3 = m.Div(a, b);
            res4 = m.Multi(a, b);

            if (a < 0 && b < 0) {
                throw new IllegalArgumentException("Значення повинні бути більше 0");
            } else if (a == 0 && b != 0 || a != 0 && b == 0) {
                throw new ArithmeticException("Одне із значення дорівнює 0");
            } else if (a == 0 && b == 0) {
                throw new IllegalAccessException("Значення не можуть дорівнювати 0");
            } else if (a > 0 && b > 0) {
                throw new MyException("Мій exception");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (MyException e) {
            System.out.println(e);
        } finally {
            System.out.println("Cумма чисел = " + res1);
            System.out.println("Різниця чисел = " + res2);
            System.out.println("Ділення чисел = " + res3);
            System.out.println("Добуток чисел = " + res4);

        }
    }
}
