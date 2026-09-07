package lab2;
import java.util.HashMap;
import java.util.Map;

public class strfreq {
    public static void main(String[] args) {
        String str = "ketham babu";
       char[]c=str.toCharArray();
       int a[][]=new int[150][150];
        for(int i=97;i<=122;i++) {
             a[i][0]=0;
        }
        for(int j=0;j<c.length;j++) {
             for(int i=97;i<=122;i++) {
            	 if(c[j]==(char)i) {
            		 a[i][0]++;
            	 }
          }    
      }
        for(int i=97;i<=122;i++) {
           if(a[i][0]>0) {
        	   System.out.println((char)i+" frequency is "+a[i][0]);
        
           }
       }
        
    }
}



