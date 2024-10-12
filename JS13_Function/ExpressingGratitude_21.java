import java.util.Scanner;
/**
 * ExpressingGratitude_21
 */
public class ExpressingGratitude_21 {
    public static String getGreetingRecipient(){
        Scanner input21 = new Scanner (System.in);
        System.out.println("Input the name of people you want to greet : ");
        String recepientName = input21.nextLine();
        input21.close();
        return recepientName;
    }
    public static void sayThankyou(){
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" for being the best teacher in the world. \n"+"You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void main(String[] args) {
        sayThankyou();
    }
}