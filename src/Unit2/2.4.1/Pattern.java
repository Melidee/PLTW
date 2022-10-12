/*
 * Activity 2.4.1
 */
import java.util.Scanner;
import java.util.LinkedList;

public class Pattern
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int number = sc.nextInt();

    boolean last1 = false;
    int total = 0;
    LinkedList<Integer> queue = new LinkedList<Integer>();
    while (number > 0) {
        queue.addFirst(number % 10);
        number = number / 10;
    } 
    
    for (int n : queue) {
      if (n == 1 && !last1) {
        last1 = true;
        continue;
      } else if (n == 0 && last1) {
        total++;
        last1 = false;
      } else {
        last1 = false;
      }
    }
    System.out.println(total);
    sc.close();
  }
}