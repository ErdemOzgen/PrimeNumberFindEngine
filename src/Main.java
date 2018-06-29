/*
 *       Filename:  Main.java 
 *
 *    Description: Using multicore feature to find prime numbers and test our code with JUnit...
 *                  
 *
 *        Created:  06/29/2018
 *       Revision:  none
 *
 *        @Author:  M.Erdem Ozgen
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static  int MAX;
    static final int THREADS = Runtime.getRuntime().availableProcessors();
    static final int ARRAYSIZE= 100000;
    public static ArrayList<Integer> primes = new ArrayList<>(ARRAYSIZE);


    public static  void main(String [] args )throws Exception
    {
        Thread []  t = new Thread[THREADS];
        PrimeStart.m =new Watcher();

        System.out.println(THREADS);

        Scanner input = new Scanner(System.in);
        System.out.println("There is "+THREADS+ "Cores in your pc and this will speed it up wait for it !!");
        System.out.println("Enter number to find prime ");

        MAX = Integer.parseInt(input.nextLine());

        for(int i=0 ;i <THREADS ;i++)
        {
            t[i] = new Thread (new PrimeStart(i));
            t[i].start();

        }



        for(int i=0 ;i <THREADS ;i++)
        {
            try
            {
                t[i].join();

            }catch(Exception e){
                System.out.println("Thread interrupted");

            }


        }
        PrintingPrime PP = new PrintingPrime();
        PP.PrintingPrime();
    }
}
