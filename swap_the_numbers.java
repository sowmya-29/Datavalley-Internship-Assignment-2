import java.io.*;
public class swap_the_numbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 16;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
