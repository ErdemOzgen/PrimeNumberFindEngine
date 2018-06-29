import java.util.ArrayList;

public class generate {
	public static  ArrayList<Integer> generate(int n){
		Thread []  t = new Thread[Main.THREADS];
		
		for(int i=0 ;i <Main.THREADS ;i++)
        {
            t[i] = new Thread (new PrimeStart(i));
            t[i].start();

        }
		

        for(int i=0 ;i <Main.THREADS ;i++)
        {
            try
            {
                t[i].join();

            }catch(Exception e){
                System.out.println("Thread interrupted");

            }


        }
        return Main.primes;
		}
}
//http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=2568658