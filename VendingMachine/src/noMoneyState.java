
public class noMoneyState implements VendingMachineState{

	VendingMachine machine;
    public noMoneyState(VendingMachine machine) {
        this.machine =  machine;
    }
    public void insertCoins(int amt){
        if (!machine.isEmpty()) {
            machine.setMachineState(machine.getCoinInsertedState());
        }
        else {
        	System.out.println("Can not process request .. Machine is out of stock");
        }
    }
    public void pressButton(){
    	System.out.println("No coin inserted ..");
    }
    public void dispenseProduct(){
    	System.out.println("Invalid Operation");
    }

}

