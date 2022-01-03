import java.util.Iterator;

public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proceso1 hilo1 = new Proceso1();
		
		Thread hilo2 = new Thread(new Proceso2());
		hilo1.start();
		hilo2.start();
		
	}

}
