import java.util.*;

public class ArrayUtils {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        for (int i = 0 ;  i < size; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
        

        while (true) {
        System.out.println("\nMENU");
        System.out.println("1. Find Max");
        //System.out.println("2. Reverse");
        System.out.println("2. Exit");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Max: " + Functions.findMax(arr));
                break;

            /**case 2:
                reverse(arr);
                System.out.println("Reversed: " + arr);
                break;
                **/

            case 2:
                return;

            default:
                System.out.println("Invalid choice");
        }
    }
    }
}