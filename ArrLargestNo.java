// Write a program that finds the largest number in an array using a for loop

public class ArrLargestNo {

    public static void main(String[] args) {
        int i;
        int max = 0;
        int arr[] = { 120, 689, 450, 68, 90 };
        for (i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max Value is :" + max);
    }
}

// Max Value is : 689