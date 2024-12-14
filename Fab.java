//Write a program that prints the Fibonacci series up to the nth term using a for loop.

public class Fab {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }

    }
}

// Fibonacci Series up to 10 terms:
// 0 1 1 2 3 5 8 13 21 34