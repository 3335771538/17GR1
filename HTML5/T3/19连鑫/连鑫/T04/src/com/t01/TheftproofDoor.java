package com.t01;

public class TheftproofDoor extends Door implements Lock ,DoorBell {
	



public void open() {
	System.out.println("����");
	
}


public void close() {
	System.out.println("����");
	
}

public void bell(){
	System.out.println("�塤�������������ꡤ����������Ƭ�Ѵ���");
}

public void lockUp() {
	System.out.println("����,������ת��Ȧ");
	
}



public void openLock() {
	System.out.println("����,������ת��Ȧ");
	
}
}