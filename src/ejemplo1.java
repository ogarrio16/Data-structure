
public class ejemplo1 {

	public static void main(String[] args) {
		
		ejemplo1 ejem = new ejemplo1();
		
		ejem.comparacion();
		
		
		}	
	
	boolean bandera= true;
	int numero1=20, numero2=30;
	float resultado=0;
	public void comparacion()
	{
		
	if (bandera)
	{
	if(numero1>numero2)
	{
	resultado=(float)(Math.pow(numero2,2)-Math.pow(numero1, 2));
	}
	else
	{
	resultado=(float)Math.sqrt(numero2-numero1);
	}
	System.out.println("la variable resultado= " +resultado);
	}
	
	}
}
