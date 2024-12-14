//Write a program to calculate the factorial of a given Number using a for loop.

public class Factorial {
    public static void main(String[] args) {
        int no = 5;
        int fact = 1;
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of the Number " + no + " is " + fact);
    }
}

// Output: Factorial of the Number 5 is 120