import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner userInput;
        System.out.println("To how high would you like to print Fibonacci numbers?");
        userInput = new Scanner(System.in);
        int fiboLimit = userInput.nextInt();
        userInput.close();

        int x = 1;
        int y = 1;
        System.out.print("Fibonacci numbers: ");
        for (int i = 0; i < fiboLimit; i++) {
            System.out.print(x);
            if (i < fiboLimit - 1) System.out.print(", ");
            int next = x + y;
            x = y;
            y = next; // this puts the result to make the fibonacci number
        }
    }
}