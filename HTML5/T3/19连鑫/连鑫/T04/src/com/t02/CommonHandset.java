package com.t02;

//��ͨ�ֻ�
public class CommonHandset extends Handset implements PlayWiring {
	


	

	public void info(String type, String brand) {
		super.toString(type, brand);
	}
	
	public void sendInfo() {
		System.out.println("����������Ϣ������");
	}
	public void call() {
		System.out.println("��ʼ����ͨ��������");
	}


	public void play(String dianying) {
		String s = dianying;
		System.out.println("��������"+s+"�С�����");
	}

	
	
	
}
