package src.main.java;

public class FindMissingNumber {
    public static void main(String[] args) {
        printMissingNumbers(new int[]{1,2,3,5,6}, 6);
        System.out.println("Java");
    }

    private static void printMissingNumbers(int[] arr, int count){
            int initial_count = 0;
            for (int i= 0; i< arr.length; i++) {
                initial_count += arr[i];
            }
            int sum_of_numbers = count * (count + 1) / 2;
            System.out.println(initial_count);
            System.out.println(sum_of_numbers - initial_count);
    }
}
