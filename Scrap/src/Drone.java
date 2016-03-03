
public class Drone {
	public static void main(String args[]){
		// [{x:0, y:2, z:10}, {x:3, y:5, z:0}, {x:9, y:20, z:6}, {x:10, y:12, z:15}, {x:10, y:10, z:8}] 
		Pointer pointerList[] = {new Pointer(0, 2, 10), new Pointer(3, 5, 0), new Pointer(9, 20, 6), 
				new Pointer(10, 12, 15), new Pointer(10, 10, 8) };
		System.out.println(calculateEnergy(pointerList));
	}

	private static int calculateEnergy(Pointer[] pointerList) {
		int energy = 0;
		int literAdded = 0;
		for(int i = 1;i<pointerList.length;i++){
			energy += pointerList[i-1].getZ() - pointerList[i].getZ();
			//System.out.print(energy+ " ");
			if(energy < 0){
				literAdded = literAdded - energy;
				energy = 0;
			}
		}
	return literAdded;
	}
}

class Pointer{
	int x,y,z;
	public Pointer(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getZ(){
		return z;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setZ(int z){
		this.z = z;
	}
}