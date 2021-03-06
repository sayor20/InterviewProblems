import java.util.Arrays;

public class PrimeGap {

	public static void main(String[] args) {
		 System.out.println(Arrays.toString(gap(6,100,110)));
	}
	
	public static long[] gap(int g, long m, long n) {
	    long last=0;
	    long current =0;
	    boolean notPrime =false;
	    long[] output;
	outer:   
	    for(long i=m; i<=n;i++){
	      notPrime = isNotPrime(i);
	      //System.out.println(i+" "+notPrime);
	      if(notPrime){
	        current = i;
	        if(current - last == (long) g){
	          System.out.println(last+" "+current);
	          return new long[]{last, current};
	        }
	        last = current;
	        notPrime = false;
	      }
	    }
	    return null;
	    }
	    
	    public static boolean isNotPrime(long p){
	      for(long k=2;k<p;k++)
	        if(p%k==0)
	          return false;
	     return true;      
	    }
}


