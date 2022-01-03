
public class Palindrome {
	public static int palindrome(String s) {
		
		int l = s.length();
        int i,j,a,b;
        for (i=0, j=l-1; i<l; i++,j--){
            if (s.charAt(i)!=s.charAt(j))
            	
                break;
        }
        if (i>j) return -1;
        	//
        	
        	
        	
        for (a = i+1, b = j;a<j && b>i+1; a++,b--){
            if (s.charAt(a)!=s.charAt(b))
                return j;
        }
        System.out.println(i);
        return i;
		 
		 
		//System.out.println(s.substring(0,s.length()-1)+ "+"+reverse.substring(1,reverse.length()));	
		 //System.out.println("estamos fuera");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "baaa";  //3
		String s2 = "baa";  //0
		String s3 = "aaa";//-1
		String s4 = "hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh";
		String s5 = "fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf";
		palindrome(s2);
		
		
		

	}
	

}

