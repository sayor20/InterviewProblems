
public class hasMoneyState implements VendingMachineState{

	VendingMachine machine =null;
    public hasMoneyState(VendingMachine machine) {
        this.machine =  machine;
    }
    public void insertCoins(int amt){
    	System.out.println("Coins are already inserted.");
    }
    public void dispenseProduct(){
    	System.out.println("Dispense button is not pressed.");
    
    }
    public void pressButton(){
        machine.setMachineState(machine.getDispensingState());
    }
    
	

}
