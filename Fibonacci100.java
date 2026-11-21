import java.math.BigInteger;

public class Fibonacci100 {
    public static void main(String[] args) {
        int count = 100;
        
        // Use BigInteger to prevent integer overflow for large Fibonacci numbers
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        System.out.println("First " + count + " numbers of the Fibonacci sequence:");

        for (int i = 1; i <= count; i++) {
            System.out.println(i + ": " + first);
            
            // Calculate the next number in the sequence
            BigInteger next = first.add(second);
            first = second;
            second = next;
        }
    }
}

    
