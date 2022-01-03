import java.util.Arrays;

public class Epam {
	
	
	
	 public static void rotate(int[][] matrix) {
	        
	        int n = matrix.length;
	        
	        for (int i = 0; i < (n + 1) / 2; i ++) {
	            for (int j = 0; j < n / 2; j++) {
	                int temp = matrix[n - 1 - j][i];
	                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
	                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
	                matrix[j][n - 1 - i] = matrix[i][j];
	                matrix[i][j] = temp;
	                
	                
	            }
	             
	        }
	        
	        
	        
	    }
	 
	 public static void printMatrix(int[][] matrix)
	    {
		 for(int i=0; i < matrix.length; i++) {
	    	   for(int j=0; j < matrix[0].length;j++) {
	    		   System.out.print(matrix[i][j]+" ");
	    		   }
	    	   System.out.println();
	    	   
	       }
	    } 
	 

	public static void main(String[] args) {
		
		
		int arr[][] ={ {2,7,9},{3,6,1},{2,7,1}};
		
		rotate(arr);
		printMatrix(arr);
		

		
		
		
		

	}

}
