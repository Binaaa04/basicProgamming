import java.util.Scanner;

/**
 * Selection2Exp121
 */
public class Selection2Exp121 {
  public static void main(String[] args) {
    Scanner input21 = new Scanner(System.in);
    int year;
    System.out.println("Enter a leap year: ");
    year = input21.nextInt();

    if (year % 4 == 0) {
      if (year % 100 != 0) {
        System.out.println("leap the year");
      }
    } else {
      System.out.println("not a leap year");
    }
    input21.close();
  }

}
