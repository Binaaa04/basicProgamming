import java.util.Scanner;

/**
 * triangle21
 */
public class triangle21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = input21.nextInt();
        int i = 0;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        input21.close();
    }
}