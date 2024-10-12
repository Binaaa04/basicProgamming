import java.util.Scanner;
/**
 * Modifyselection2Exp2
 */
public class Modifyselection2Exp2 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int totalangle;
        System.out.println("Input angle 1 :");
        int angle1 = input21.nextInt();
        System.out.println("Input angle 2 :");
        int angle2 = input21.nextInt();
        System.out.println("Input angle 3 : ");
        int angle3 = input21.nextInt();

        totalangle = angle1 + angle2 + angle3;
        if (totalangle == 180) {
            if (angle1 <= 60) {
                if (angle2 <= 60) {
                    if (angle3 <= 60) {
                        System.out.println("a Equilateral Triangle");
                    } else {
                        System.out.println("Not a Equilateral Triangle");
                    }
                } else {
                    System.out.println("a Equilateral Triangle");
                }
            } else {
                System.out.println("Not a Equilateral Triangle");
            }
        } else {
            System.out.println("Not a Equilateral Triangle");
        }
        input21.close();
    }
}
