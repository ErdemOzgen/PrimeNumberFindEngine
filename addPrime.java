import java.util.Collections;

public class addPrime {
    public synchronized static void addPrime(int n)
    {
        Main.primes.add(n);
        Collections.sort(Main.primes);
    }
}
