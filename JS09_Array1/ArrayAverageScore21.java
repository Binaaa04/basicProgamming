import java.util.Scanner;
/**
 * ArrayAverageScore21
 */
public class ArrayAverageScore21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int[] score = new int[5];
        double totalpassed = 0;
        double totalfailed = 0;
        double averagepassed;
        double averagefailed;
        double totalgradepassed = 0;
        double totalgradefailed = 0;
        int totalstudents = 5;

        System.out.println("Enter the number of students : " + totalstudents);

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter the final score " + (i + 1) + " : ");
            score[i] = input21.nextInt();
            total += score[i];

            if (score[i] < 70) {
                totalgradefailed += score[i];
                totalfailed++;
            } else if (score[i] > 70) {
                totalgradepassed += score[i];
                totalpassed++;
            }
        }
        averagepassed = totalgradepassed / totalpassed;
        System.out.println("The average score of students who passed is : " + averagepassed);

        averagefailed = totalgradefailed / totalfailed;
        System.out.println("The average score of students who failed is : " + averagefailed);
        input21.close();
    }
}
