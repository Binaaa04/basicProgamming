import java.util.Scanner;

/**
 * NestedLoop_2341760155
 */
public class NestedLoop_2341760155 {
       public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        double[][] temps = new double[7][5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = input21.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (double temperature : temps[i]) {
                System.out.print(temperature + " ");
            }
            System.out.println();
        }
        input21.close();
    }
}
