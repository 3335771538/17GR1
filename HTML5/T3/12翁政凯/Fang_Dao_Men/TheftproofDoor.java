package com.qhit.t04.Fang_Dao_Men;

public class TheftproofDoor implements Lock,DoorBell,Door{

	public void Pai_Zhao() {
		System.out.println("����");
	}

	public void Shang_Suo() {
		System.out.println("������");
		
	}

	public void Kai_Suo() {
		System.out.println("������");
		
	}

	public void Kai() {
		System.out.println("����");
	}

	public void Guan() {
		System.out.println("����");
	}
	
public static void main(String[] args) {
	TheftproofDoor t = new TheftproofDoor();
	t.Guan();
	t.Shang_Suo();
	t.Pai_Zhao();
	t.Kai_Suo();
	t.Kai();
	}
}
