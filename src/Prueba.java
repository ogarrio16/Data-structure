import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prueba {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		
	    int[] freq = new int[100];
	    for(Integer each: arr) {
	            freq[each] =freq[each] +1;
	    		System.out.println(freq[each]);
	    		}
	        
	            
	    for(int each : freq)
	            result.add(each);
	    	System.out.println(result);
	    }
			
			//System.out.println(s1.substring(2));//returns vatpoint  
			
		
		
		
		
		
	}

