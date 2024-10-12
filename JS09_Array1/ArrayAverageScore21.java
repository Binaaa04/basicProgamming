import java.util.Scanner;
/**
 * ArrayAverageScore21
 */
public class ArrayAverageScore21 {

     public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int[] score = new int[10];
        double total = 0;
        double average;
        int totalpassed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + " : ");
            score[i] = input21.nextInt();
            if (score[i] > 70) {
                System.out.println("student score " + (i + 1) + " passed! ");
                totalpassed++;
            }
        }
        for (int i = 0; i < score.length; i++) {
            total += score[i];

            average = total / score.length;
            System.out.println("The class of the scores is: " + average);
        }
        System.out.println("number of students who passed : " + totalpassed);
        input21.close();
    }
}
