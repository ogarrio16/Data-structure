
public class Caesar {
	
	 public static String caesarCipher(String s, int k) {
		    // Write your code here
		    
		        final StringBuilder ciph = new StringBuilder();
		        
		        for (Character cha : s.toCharArray()){
		            if (Character.isLetter(cha)){
		               final int valueNum =Character.isUpperCase(cha)? 'A':'a';
		                final int val =(cha + k - valueNum)%26;
		                ciph.append((char)(val+valueNum));
		            }else{
		                 ciph.append(cha);
		                }
		            System.out.println(ciph);
		        }
		    return ciph.toString();
    }
		  

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "middle-Outz";
		
		caesarCipher(s, 2);

	}

}
