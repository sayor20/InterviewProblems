
public class Client {
	public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        
        //refill the stock
        machine.reFill(2);
        
        // demonstrating the output by console based print
        // first test
        machine.insertCoins(4);
        machine.pressButton();
    
        // second test 
        machine.insertCoins(1);
        machine.insertCoins(3);
        machine.pressButton();				
        
        // third test 
        machine.pressButton();
        
        // fourth test
        machine.insertCoins(2);
       
    }
}
