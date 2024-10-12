import java.util.Scanner;
/**
 * Greetings_21
 */
public class Greetings_21 {

    public static String getGreetingRecipient(){
        Scanner input21 = new Scanner (System.in);
        System.out.println("Input the name of people you want to greet : ");
        String recepientName = input21.nextLine();
        input21.close();
        return recepientName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" may the force be with you");
    }
}