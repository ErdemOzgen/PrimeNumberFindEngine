public class PrintingPrime {
    public  synchronized  static void PrintingPrime()
    {
        for (int n : Main.primes)
        {
            System.out.print(""+n+" ");
        }
        System.out.println();
    }
}
