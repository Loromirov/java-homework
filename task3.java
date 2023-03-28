// // Task_3.
// // Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите операцию(+, -, /, *):  ");
        char sign = iScanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        int b = iScanner.nextInt();

        switch (sign) {
            case '+':
                System.out.println(a + "+" + b + "=" + (a + b) );
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a - b) );
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a / b) );
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a * b) );
                break;

            default:
                System.out.println("Неверный оператор");
                break;
        }
    }    
}
