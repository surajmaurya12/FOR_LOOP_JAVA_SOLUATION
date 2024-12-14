
// Write a program to print a number pattern like this:
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class Pattern {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
