package com.theftproofdoor;

public class TheftProofDoor extends Door implements Locker,photo{

	public String lock() {
		return "������";

	}

	public String unlock() {
		// TODO Auto-generated method stub
		return "������";
	}

	public static void main(String[] args){
		TheftProofDoor tpd = new TheftProofDoor();

		System.out.println(tpd.close());
		System.out.println(tpd.lock());
		System.out.println(tpd.unlock());
		System.out.println(tpd.open());
		System.out.println(tpd.pz());

	}

	@Override
	public String pz() {
		
		return "����......���ճɹ�";
	}

	
	
	
}
