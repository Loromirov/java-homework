// // Task_2.
// // Вводится число n, затем n чисел целых, по одному на каждой строке. 
// // Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.

// // Sample Input:

// // 4
// // 1
// // 2
// // 3
// // 5
// // 2
// // Sample Output:

// // 2
// // 4
// // 6
// // 10

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int n = iScanner.nextInt();
        int[] list1 = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("Введите числа массива: ");
            list1[j] = iScanner.nextInt();
        }
        System.out.println("Введите число, на которое нужно умножить все элементы массива: ");
        int k = iScanner.nextInt();
        for (int j = 0; j < n; j++) {
            list1[j] *= k;
            System.out.println(list1[j]);
        }

    }
}