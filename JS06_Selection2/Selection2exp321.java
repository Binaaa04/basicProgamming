import java.util.Scanner;

/**
 * Selection2exp321
 */
public class Selection2exp321 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        String category;
        int income, netSalary;
        double tax = 0;

        System.out.print("Input category : ");
        category = input21.nextLine();
        System.out.print("Input income : ");
        income = input21.nextInt();

        if (category.equalsIgnoreCase("WOrker")) {
            if (income <= 2000000) {
                tax = 0.1;
            } else if (income <= 3000000) {
                tax = 0.15;
            } else {
                tax = 0.2;
            }
            netSalary = (int) (income - (tax * income));
            System.out.println("Net salary = " + netSalary);

        } else if (category.equalsIgnoreCase("BusinessmaN")) {
            if (income <= 2500000) {
                tax = 0.15;
            } else if (income <= 3500000) {
                tax = 0.2;
            } else {
                tax = 0.25;
            }
            netSalary = (int) (income - (tax * income));
            System.out.println("Net salary = " + netSalary);
        } else {
            System.out.println("Invalid category!");
        }
        input21.close();
    }
}
