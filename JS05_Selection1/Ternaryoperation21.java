import java.util.Scanner;
/**
 * Ternaryoperation21
 */
public class Ternaryoperation21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.println("Input a number = ");
        int number = input21.nextInt();
        int even = 2;
        if (number%2 == 0) {
            String  = number >= even? "even number":"odd number";
            System.out.println(number+" is an even number! ");
        } else {
            System.out.println(number+" is an odd number! ");
        }
    }
}