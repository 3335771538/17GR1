package com.t02;

public abstract class Handset {
	
	String brand;//�ֻ��̱�
	String type;//�ֻ�����
	
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	
	public void toString(String type,String brand) {
		System.out.println("����һ���ͺ�Ϊ" + type + "��" + brand + "�ֻ�"); 
	}
	//����Ϣ
	public abstract void sendInfo();
	//��绰
	public abstract void call();
	//����
	
}
