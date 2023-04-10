/*
 Даны два Deque представляющие два неотрицательных целых числа. 
 Цифры хранятся в обратном порядке, и каждый из их узловсодержит одну цифру.
 Сложите два числа и верните сумму в виде связанного списка
 */

 import java.util.*;
 public class task4 {
     public static void main(String[] args) {
         Deque<Integer> deque1 = new ArrayDeque<>(Arrays.asList(1,2,3));
         Deque<Integer> deque2 = new ArrayDeque<>(Arrays.asList(5,4,7));
         LinkedList<Integer> ll = new LinkedList<Integer>();
         String string1 = new String();
         String string2 = new String();
         int deque1Size = deque1.size();
         int deque2Size = deque2.size();
         for(int i = 0; i < deque1Size; i++){
             string1 += deque1.pollLast();
         }
         for(int j = 0; j < deque2Size; j++){
             string2 += deque2.pollLast();
         }
         System.out.println(string1);
         System.out.println(string2);
         int summ = Integer.parseInt(string1) + Integer.parseInt(string2);
         System.out.println(summ);
 
         while (summ > 0) {
             ll.add(summ % 10);
             summ /= 10;
         }
         System.out.println(ll);
     }
 
     
 }
 