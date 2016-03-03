
public class emptyState implements VendingMachineState {

	 VendingMachine machine;
	    public emptyState(VendingMachine machine) {
	        this.machine =  machine;
	    }
	    
	    public void pressButton(){
	    	System.out.println("Invalid Action");
	    }
	    
	    public void dispenseProduct(){
	    	System.out.println("Invalid Action");
	    }
		
		public void insertCoins(int amt) {
			System.out.println("Cannot process this request");
		}

}
