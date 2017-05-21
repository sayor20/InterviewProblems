
public class ElevatorTest {

	public static void main(String[] args) {
		Elevator testElevator = new Elevator();
		
		// test1	
/*		
		testElevator.setMax(20);
  		testElevator.getCurrentFloor();
		System.out.println("-------------");
		testElevator.gotoFloor(11);
*/		
		// test2
		
		testElevator.setMax(20);
		testElevator.requestFloor(5, 'U');
		testElevator.requestFloor(14, 'U');
		testElevator.requestFloor(12, 'D');
		testElevator.requestFloor(8, 'U');		
		
		testElevator.gotoNextReqFloor();
		testElevator.gotoNextReqFloor();
		testElevator.gotoNextReqFloor();
		testElevator.gotoNextReqFloor();
		
		/*
		testElevator.requestFloor(12, 'U');
		testElevator.requestFloor(15, 'U');
		testElevator.requestFloor(11, 'D');
		testElevator.requestFloor(7, 'D');
		testElevator.requestFloor(2, 'D');
		testElevator.requestFloor(3, 'D');
		 */	
	}
}
