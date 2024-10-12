import java.util.Scanner;
/**
 * ExpressingGratitude_21
 */
public class ExpressingGratitude_21 {
   public static String getGreetingRecipient() {
        Scanner input21 = new Scanner(System.in);
        System.out.println("Input the name of the person you want to greet: ");
        String recipientName = input21.nextLine();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world. \n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void additionalMessage(String additionalMessage) {
        System.out.println("Additional Greeting: " + additionalMessage);
    }

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.println("Enter an additional greeting message: ");
        String additionalGreeting = input21.nextLine();
        sayThankyou();
        additionalMessage(additionalGreeting);
        
        input21.close();
    }
}
