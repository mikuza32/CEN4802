public class fibonacciSequence {
 /**
     * Calculates the nth numeral of the fibonacciSequence
     * @param n the numeral to calculate
     * @return value of the n numeral
     */
    public static int fibonacci(int n) { // fibonacci method is used to manipulate the int n as instructed
        if (n <= 1) { // if n is less than or equal to 1, than the console will return 10. Since n = 10 in the main method
            return n; // returns n to the console
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // if n is greater than 1, execute and return n(n-1) + n(n-2)
    }
}
