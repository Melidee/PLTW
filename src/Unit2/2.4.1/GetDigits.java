/*
 * Activity 2.4.1
 */
import java.util.Scanner;
import java.util.LinkedList;

public class GetDigits
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer to see its digits: ");
    int number = sc.nextInt();
    
    LinkedList<Integer> queue = new LinkedList<Integer>();
    while (number > 0) {
        queue.addFirst(number % 10);
        number = number / 10;
    } for (int n : queue) {
        System.out.println(n);
    }
    sc.close();
  }
}