	import java.util.SortedSet;
	import java.util.TreeSet;
	
	public class Elevator {
	
		int currentFloor = 1;
		int max = 9;
		char currentDirection='U';
		
		SortedSet<Integer> upSet = new TreeSet<Integer>();
		SortedSet<Integer> downSet = new TreeSet<Integer>();
		SortedSet<Integer> bufferSet = new TreeSet<Integer>();
	
		public void getCurrentFloor() {
			System.out.println("you are in Floor " + currentFloor);
		}
		
		public void setMax(int max) {
			this.max = max;
		}
		
		public void gotoFloor(int x){
			if((x<1)||(x>max)){
				System.out.println("Requested Floor is not in the permitted range.");
			}else{
				while(currentFloor!=x){
					if(currentFloor<x)
						currentFloor++;
					else
						currentFloor--;
					getCurrentFloor();
				}
				System.out.println("Doors are opened and closed at Floor "+x);
			}	
		}
		
		public void gotoNextReqFloor(){
			if(currentDirection=='U'){
				if(upSet.isEmpty()){
					currentDirection='D';
					upSet.addAll(bufferSet);
					bufferSet.clear();
					gotoNextReqFloor();
				}else{
					gotoFloor(upSet.first());
					upSet.remove(upSet.first());
				}
				
			}else{
				if(downSet.isEmpty()){
					currentDirection='U';
					downSet.addAll(bufferSet);
					bufferSet.clear();
					gotoNextReqFloor();
				}else{
				gotoFloor(downSet.last());
				downSet.remove(downSet.last());
				}
			}
		}
		
		public void requestFloor(int reqFloor, char reqDirection){
			if(currentDirection=='U' && reqDirection=='U'){
				if(reqFloor<currentFloor)
					bufferSet.add(reqFloor);
				else
					upSet.add(reqFloor);
			}else if(currentDirection=='U' && reqDirection=='D'){
				downSet.add(reqFloor);
			}else if(currentDirection=='D' && reqDirection=='U'){
				upSet.add(reqFloor);
			}else{
				if(reqFloor>currentFloor)
					bufferSet.add(reqFloor);
				else
					downSet.add(reqFloor);
			}		
		}
		
	}
