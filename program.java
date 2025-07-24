import java.util.Scanner;

public class Main {

    // Function to calculate GCD using recursion
    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Printing GCD of the two numbers
        System.out.println(GCD(a, b));
        
        sc.close();}
}
