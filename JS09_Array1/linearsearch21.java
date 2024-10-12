/**
 * linearsearch21
 */
public class linearsearch21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int totalarray = 6;
        int arrayInt[] = { 19, 23, 29, 31, 37, 43 };
        int key = 0;
        int result = 0;

        System.out.println("Enter the number of array elements : " + totalarray);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter the array element " + i + " : ");
            arrayInt[i] = input21.nextInt();
        }
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
            } else {
                System.out.print("Enter the key you want to search for : ");
                arrayInt[i] = input21.nextInt();
                System.out.println("Key not found!");
                break;
            }
        }
        input21.close();
    }
}
