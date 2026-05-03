import java.util.*;

public class Functions {
    public static int findMax(ArrayList<Integer> arr){
        int max= arr.get(0);
        for(int i = 1 ; i < arr.size(); i++){
            if (arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max;     
    }
    public static void reverse(ArrayList<Integer> arr){
       int left =0;
       int right = arr.size()-1;
       while(left < right){
        int temp = arr.get(left);
        arr.set(left, arr.get(right));
        arr.set(right, temp);
        left++;
        right--;
       }
    }
    public static int findMin(ArrayList<Integer> arr){
        int min = arr.get(0);
        for(int i =1; i<arr.size(); i++){
            if(arr.get(i)<min){
                min=arr.get(i);
            }
        }
        return min;
    }
    public static int findSum(ArrayList<Integer> arr){
        int sum=0;
        for (int i=0; i < arr.size(); i++){
            sum+=arr.get(i);
        }
        return sum;
    }
    public static int findAverage(ArrayList<Integer> arr){
        int sum= findSum(arr);
        return sum/arr.size();
    }
    public static int findOccurence(ArrayList<  Integer> arr , int target){
        int occurence=0;
        for (int i =0; i<arr.size(); i++){
            if (arr.get(i)==target){
                occurence++;
            } 
        }
        return occurence;

    }
    public static int findSecondLargest(ArrayList<Integer> arr){
        int max = Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.size(); i++){
            if (arr.get(i) > max){
                secondMax = max;
                max = arr.get(i);
            } else if (arr.get(i) > secondMax && arr.get(i) != max){
                secondMax = arr.get(i);
            }
        }
        return secondMax;
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr){
        HashSet<Integer> uniqueArr = new HashSet<>();
        for (int num : arr) {
            uniqueArr.add(num);
        }
        return new ArrayList<>(uniqueArr);
    }
    public static String isPalindrom(ArrayList<Integer> arr){
        int left=0;
        int right=arr.size()-1;
        while(left<right){
            if (arr.get(left)!=arr.get(right)){
                return "Not Palindrome";
            }
            left++;
            right--;    
        }
        return "Palindrome";
    }
    public static String checkOrder(ArrayList<Integer> arr) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                isDescending = false;
            } else if (arr.get(i) < arr.get(i - 1)) {
                isAscending = false;
            }
        }

        if (isAscending) {
            return "Ascending";
        } else if (isDescending) {
            return "Descending";
        } else {
            return "Unordered";
        }
    }
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr){
        for(int i=0; i< arr.size()-1;i++){
            for(int j=0; j< arr.size()-i-1;j++){
                if(arr.get(j)> arr.get(j+1)){
                    int temp= arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);

                }
            }
        }
        return arr;

        
    }
    public static int linearSearch(ArrayList<Integer> arr, int target){
        for(int i =0 ; i < arr.size();i++){
            if(arr.get(i)==target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(ArrayList<Integer> arr,int target){
        int left=0;
        int right = arr.size()-1;
        while(left<=right){
            int mid= (left + right)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            else if(arr.get(mid)<target){
                left=mid+1;
            }
            else{
                right=mid-1;        
            }
            }
        return -1;
    }
    public static ArrayList<Integer> twoSum(ArrayList<Integer> arr, int target){
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i =0 ; i<arr.size();i++){
            int complement =  target -  arr.get(i);
            if(map.containsKey(complement)){
                return new ArrayList<Integer>(Arrays.asList(map.get(complement), i));
            }
            map.put(arr.get(i), i);
        }
        return new ArrayList<Integer>(Arrays.asList(-1, -1));

   }  
 }






