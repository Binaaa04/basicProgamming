import java.util.Scanner;

/**
 * Selection2Exp121
 */
public class Selection2Exp121 {
 public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int year;
        System.out.println("Enter the year: ");
        year = input21.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("a leap year");
                } else {
                    System.out.println("not a leap year");
                }
            } else {
                System.out.println("a leap year");
            }
        } else {
            System.out.println("not a leap year");
        }
        input21.close();
    }
}
