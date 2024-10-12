/**
 * linearsearch21
 */
public class linearsearch21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int totalarray = 8;
        int[] arrayInt = { 12, 18, -6, 10, 6, 15, 11, 9 };
        int key = 10;
        int result = 0;

        System.out.println("Enter the number of array elements : " + totalarray);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Enter the array element " + i + " : ");
            arrayInt[i] = input21.nextInt();
        }

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }
        System.out.println("Enter the key you want to search for : " + key);
        System.out.println("The key in the array is located at index position " + result);
        input21.close();
    }
}
