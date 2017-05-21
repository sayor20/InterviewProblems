
public class MaxProfit {

	public static void main(String[] args) {
		System.out.println(maxProfits(new int[]{7,1,5,3,6,4}));

	}
	
    public static int maxProfits(int[] prices) {
        int min = 0;
        int max = Integer.MIN_VALUE;
        int i=0;
        while(prices[i+1]-prices[i]>0)
            i++;
        min = prices[i+1];
        i++;
        while(i<prices.length){
            if(prices[i]>max)
                max = prices[i];
            i++;
        }
        return max-min;
    }

}
