package edu.eci.arsw.primefinder;
import java.util.*;
import edu.eci.arsw.primefinder.PrimeFinderThread;

public class TimeThread extends Thread{
	PrimeFinderThread pft1, pft2, pft3;
	
	public TimeThread(PrimeFinderThread pft1, PrimeFinderThread pft2, PrimeFinderThread pft3) {
		this.pft1 = pft1;
		this.pft2 = pft2;
		this.pft3 = pft3;
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		String enter = new String();
		try {
			Thread.sleep(5000);
			pft1.Desactivar();
			pft2.Desactivar();
			pft3.Desactivar();
			synchronized(this) {
				
				System.out.println("Presione ENTER para continuar");
				
				enter = scanner.nextLine();
				while (!enter.equals("")) {
					enter = scanner.nextLine();
				}	
				System.out.println("Listo para continuar");
				pft1.activar();
				pft2.activar();
				pft3.activar();
				notify();
				
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
