package edu.eci.arsw.primefinder;

public class Main {

	public static void main(String[] args) {
		
		PrimeFinderThread pft1=new PrimeFinderThread(0, 10000000);
		PrimeFinderThread pft2=new PrimeFinderThread(10000000, 20000000);
		PrimeFinderThread pft3=new PrimeFinderThread(20000000, 30000000);
		TimeThread time = new TimeThread(pft1,pft2,pft3);
		time.start();
		pft1.start();
		pft2.start();
		pft3.start();
		
		
	}
	
}
