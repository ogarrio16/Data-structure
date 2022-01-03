import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class Main {
    
    public static void main (String[] args) throws java.lang.Exception {
        	int a[]= {1,2, 3, 4, 5, 6, 7};
        	int n =	7;
            findZigZagSequence(a, n);
        }
   
   
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n + 1)/2;
        int temp = a[mid-1]; // cambio 1
        a[mid-1] = a[n - 1]; // cambio 2
        a[n - 1] = temp;
    
        int st = mid;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1; // tercer cambio tem
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}



