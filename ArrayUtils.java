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
        System.out.println("2. Reverse");
        System.out.println("3. Find Min");
        System.out.println("4. Find Average");
        System.out.println("5. Find Sum");
        System.out.println("6. Find Occurrence");
        System.out.println("7. Check Order");
        System.out.println("8. Exit");


        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Max: " + Functions.findMax(arr));
                break;

            case 2:
                Functions.reverse(arr);
                System.out.println("Reversed: " + arr);
                break;
                

            case 3:
                System.out.println("Min: " + Functions.findMin(arr));
                break;

            case 4:
                System.out.println("Average: " + Functions.findAverage(arr));
                break;

            case 5:
                System.out.println("Sum: " + Functions.findSum(arr));
                break;

            case 6:
                System.out.println("Enter the target element:");
                int target = sc.nextInt();
                System.out.println("Occurrence: " + Functions.findOccurence(arr, target));
                break;

            case 7:
                System.out.println("Order: " + Functions.checkOrder(arr));
                break;

            case 8:
                System.out.println("Exiting...");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice");
        }
    }
    }
}