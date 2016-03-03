
public class VendingMachine {

	VendingMachineState coinInsertedState = new hasMoneyState(this);
	VendingMachineState emptyState = new emptyState(this);
	VendingMachineState noCoinInsertedState = new noMoneyState(this);
	VendingMachineState dispensingState = new dispensingState(this);
	VendingMachineState machineState = null;
    int capacity = 0;
    int money = 0;
    int quarters, dimes, fcents, ocent;
    static int amount;
    
    public VendingMachine() {
        machineState = noCoinInsertedState;
    }
    public void reFill(int count) {
        capacity += count;
        machineState = noCoinInsertedState;
    }
    
    public void denomination(int money){
    	
    	amount = money - 1;
    	quarters = amount/25;
    	amount = amount %25;
    	dimes = amount/10;
    	amount = amount%10;
    	fcents = amount/5;
    	amount = amount%5;
    	ocent = amount;
    	
    	System.out.println("The change would be provided as below: ");
    	System.out.println("quarters: "+quarters);
    	System.out.println("dimes: "+dimes);
    	System.out.println("fcents: "+fcents);
    	System.out.println("ocent: "+ocent);
    	
    }
    
    public void insertCoins(int amt) {
        machineState.insertCoins(amt);
        amount = amt;
    }
    
    public void pressButton() {
        machineState.pressButton();
        machineState.dispenseProduct();
        capacity--;
    }
    
    public boolean isEmpty(){
        if(capacity<=0)
            return true;
        else
            return false;
    }
    
    public void setMachineState(VendingMachineState machineState) {
        this.machineState = machineState;
    }
    public VendingMachineState getMachineState() {
        return machineState;
    }
    public void setCoinInsertedState(VendingMachineState coninInsertedState) {
        this.coinInsertedState = coninInsertedState;
    }
    public VendingMachineState getCoinInsertedState() {
        return coinInsertedState;
    }
    public void setEmptyState(VendingMachineState emptyState) {
        this.emptyState = emptyState;
    }
    public VendingMachineState getEmptyState() {
        return emptyState;
    }
    public void setNoCoinInsertedState(VendingMachineState noCoinInsertedState) {
        this.noCoinInsertedState = noCoinInsertedState;
    }
    public VendingMachineState getNoCoinInsertedState() {
        return noCoinInsertedState;
    }
    public void setDispensingState(VendingMachineState dispensingState) {
        this.dispensingState = dispensingState;
    }
    public VendingMachineState getDispensingState() {
        return dispensingState;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    
}
