package com.qhit.t04.Shou_Ji;

public class Handset {
	String type;
	String brand;
	
	public void call(String s) {
		System.out.println("��ʼ"+s);
	}
	public void info(String k) {
		System.out.println("����"+k);
	}
	
	public void sendlnfo() {
		System.out.println("����һ���ͺ�Ϊ"+type+"��"+brand+"�ֻ�");
	}

}
