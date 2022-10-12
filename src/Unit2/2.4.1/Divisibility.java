/*
 * Activity 2.4.1
 */
import java.util.Scanner;

public class Divisibility
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the numerator: ");
    int numerator = sc.nextInt();
    System.out.println("Enter the denominator: ");
    int denominator = sc.nextInt();

    // O(n)
    while (numerator > denominator) {
        numerator -= denominator;
    }
    System.out.println(numerator == 0);
  }
}