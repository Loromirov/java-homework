/*
 Дан Deque состоящий из последовательности цифр
 Необходимо проверить, что последовательность цифр является палиндромом
 */
import java.util.*;
public class task3 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
        boolean res = true;
        for (int i = 0; i < deque.size() / 2; i++){
        int first = deque.pollFirst();
        int last = deque.pollLast();    
        if (first != last) {
            res = false;
            break;
        }
        }
        System.out.println(res ? "Палиндром" : "Не палиндром");
    }
}
