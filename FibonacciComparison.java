import java.util.Scanner;

public class FibonacciComparison {
    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static int iterativeFibonacci(int n) {
        if (n <= 1) { // Base Case for F(0) = 0 and F(1) = 1;
            return n;
        }
        int a = 0; // Placeholder for F(0);
        int b = 1; // Placeholder for F(1);
        int fib = 0; // Placeholder for F(n);
        for (int i = 2; i <= n; i++) {
            fib = a + b; // each iteration the sum of each fib number is calculated;
            a = b; // b (which holds F(i-1)) is swapped with 'a';
            b = fib; // newly calculated fib number is assigned 'b' (which represents F(i));
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        do { // Do-while loop to repeatedly prompt the user to enter a non-negative value for n
        System.out.print("Enter a positive integer n: ");
        n = input.nextInt();
 
        } while (n < 0);

            // Measure time for recursive Fibonacci
            long startTime = System.nanoTime();
            recursiveFibonacci(n); // function call to determine time complexity of the recursiveFibonacci function
            long endTime = System.nanoTime();
            long recursiveTime = endTime - startTime;

            // Measure time for iterative Fibonacci
            startTime = System.nanoTime();
            iterativeFibonacci(n); // function call to determine time complexity of the iterativeFibonacci function
            endTime = System.nanoTime();
            long iterativeTime = endTime - startTime;

            System.out.println("n: " + n + ", Recursive time: " + recursiveTime + " ns, Iterative time: " + iterativeTime + " ns");
            input.close(); // Close the scanner object to prevent memory or resource leaks
        }
    }
