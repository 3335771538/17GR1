package men;

public class TheftProofDoor extends Door implements Locker,DoorBell{

	public String lock() {
		return "������";

	}

	public String unlock() {
		return "������";
	}
	
	public String doorBell() {
		return "��";
	}
	

	public static void main(String[] args){
		TheftProofDoor t = new TheftProofDoor();
		System.out.println( t.close());
		System.out.println(t.lock());
		System.out.println(t.doorBell());
		System.out.println(t.unlock());
		System.out.println(t.open());
		
		
		
		
	}
	
	
	
}
