
public class dispensingState implements VendingMachineState {

	VendingMachine machine ;
    dispensingState(VendingMachine machine) {
        this.machine = machine;
    }
    public void insertCoins(int amt){
    	System.out.println("previous order is processing");
    }
    public void pressButton(){
    	System.out.println("previous order is processing");
    }
    public void dispenseProduct(){
    	System.out.println("Dispensing product");
    	machine.denomination(machine.amount);
        machine.setMachineState(machine.getNoCoinInsertedState());
    }

}
