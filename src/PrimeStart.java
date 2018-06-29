public class PrimeStart implements Runnable {

    public static  Watcher m;
    public static  PrintingPrime p;

    final int ID;

    public PrimeStart(int i){ID = i; }

    public void run()
    {
        for(int i =0;i<Main.MAX;i++)
        {
            if(i%Main.THREADS ==ID)
                if(isPrime.isPrime(i))
                    m.addPrime(i);
        }
    }
}
