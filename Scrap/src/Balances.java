
public class Balances {
	
	int leftWeight;
	int  rightWeight;
	int totalWeight;
	Balances leftBal;
	Balances rightBal;
	int weightToLeft;
	int weightToRight;
	
	public Balances (int lw, Balances lBal, int rw, Balances b3){
		leftWeight = lw;
		leftBal = lBal;
		rightWeight = rw;
		rightBal = b3;
		weightToLeft = 0;
		weightToRight = 0;
		totalWeight = 10;
	}
	
	public String toString(){
		return "weightToLeft="+weightToLeft+" "+"weightToRight="+weightToRight;
	}
}
