

public class Fibo {
	
	public static int fib(int n) {
		
		if (n<=1) {
		return n;
		}else {
			
			
			return fib(n-1)+fib(n-2);
			
		}
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i =0 ;i<=n;i++){
			System.out.println(i+ "=" +fib(i));
		}
	}

}
