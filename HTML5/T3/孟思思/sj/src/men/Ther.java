package men;

public class Ther extends Door implements Locker,photo{

	public String lock() {
		// TODO Auto-generated method stub
		return "������";
	}

	public String unlock() {
		// TODO Auto-generated method stub
		return "������";
	}
	public static void main(String[] args) {
		Ther tpd = new  Ther();
		System.out.println(tpd.close());
		System.out.println(tpd.lock());
		System.out.println(tpd.unlock());
		System.out.println(tpd.pz());
	}
	
	public String pz() {
		// TODO Auto-generated method stub
		return "���ꡣ�������ճɹ�";
	}
	
}

	
