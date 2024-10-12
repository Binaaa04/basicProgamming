import java.util.Scanner;

/**
 * ArrayValue21
 */
public class ArrayValue21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int[] finalScore = new int[10];

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score " + i + " : ");
            finalScore[i] = input21.nextInt();
        }
        
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) {
                System.out.println("Final score " + i + " passed! ");
            } else {
                System.out.println("Final score " + i + " failed! ");
            }
        }
        input21.close();
    }
}
