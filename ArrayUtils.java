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
        System.out.println("8. Check Palindrome");
        System.out.println("9. Linear Search");
        System.out.println("10. Binary Search");
        System.out.println("11. Bubble Sort");
        System.out.println("12. Two Sum");
        System.out.println("13. Exit");



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
                System.out.println("Palindrome: " + Functions.isPalindrom(arr));
                break;      

            case 9:
                System.out.println("Enter the target element:");
                int target1 = sc.nextInt();
                System.out.println("Index: " + Functions.linearSearch(arr, target1));
                break;

            case 10:
                System.out.println("Enter the target element:");
                target1 = sc.nextInt();
                System.out.println("Index: " + Functions.binarySearch(arr, target1));
                break;
            case 11:
                Functions.bubbleSort(arr);
                System.out.println("Sorted: " + arr);
                break;      

            case 12:
                System.out.println("Enter the target element:");
                int target2 = sc.nextInt();
                System.out.println( "two sums :" + Functions.twoSum(arr, target2));
                break;

            case 13:
                System.out.println("Exiting...");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice");
        }
    }
    }
}