package com.qinghuaIT;

public abstract class Handset {

	String brand;
	String type;
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
	public abstract void sendInfo();
	public abstract void call();
	
	public void toString(String brand,String type) {
		System.out.println("����һ���ͺ�Ϊ" + brand + "��" + type + "�ֻ�"); 
	}
	
}
