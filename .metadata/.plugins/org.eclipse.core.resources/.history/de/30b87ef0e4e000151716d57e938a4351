
// balancing weights

public class BalTest {

	public static void main(String[] args) {
		Balances b3 = new Balances(0, null, 0, null);
		Balances b2 = new Balances(3, null, 0, null);
		Balances b1= new Balances(0, null, 0, b3);
		Balances b0 = new Balances(0, b1, 0, b2);
		
		val(b0);
		
		System.out.println(b0);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(b0.totalWeight);
		System.out.println(b1.totalWeight);
		System.out.println(b2.totalWeight);
		System.out.println(b3.totalWeight);
	}
	
	public static void val(Balances b){
		if(b!=null){
			val(b.leftBal);
			val(b.rightBal);
			bal(b);
		}	
	}
	
	public static void bal(Balances b){
		int totalL = 0;
		int totalR = 0;
		int diff = 0 ;
		if(b.leftBal!=null)
			totalL = b.leftBal.totalWeight;
		if(b.rightBal!=null)
			totalR = b.rightBal.totalWeight;
		if(b.leftWeight + totalL >= b.rightWeight + totalR){
			diff = (b.leftWeight + totalL) - (b.rightWeight + totalR);
			b.weightToRight = diff;
			b.rightWeight+=diff;
			b.totalWeight += (b.rightWeight + b.leftWeight + totalR + totalL);
		}else{
			diff = (b.rightWeight  + totalR) - (b.leftWeight + totalL);
			b.weightToLeft = diff;
			b.leftWeight+=diff;
			b.totalWeight += (b.rightWeight + b.leftWeight + totalR + totalL);
		}
	}	
}
