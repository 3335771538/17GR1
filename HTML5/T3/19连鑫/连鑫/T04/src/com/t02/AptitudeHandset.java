package com.t02;

public class AptitudeHandset extends Handset implements PlayWiring , TheakePictures , Network {
	
	//��������
	public void takePictures() {
		System.out.println("���ꡤ��������ɹ�");
		
	}
	//����
	public void play(String dianying) {
		String sw  =  dianying;
		System.out.println("������Ƶ"+sw+"�С�����");
		
	}
	//����
	public void nteworkConn() {
		System.out.println("�Ѿ���������");
		
	}



	
	public void info(String type,String brand) {
		super.toString(type, brand);
		
	}
	public void sendInfo() {
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ������");
	}
	public void call() {
		System.out.println("��ʼ��Ƶͨ��������");
	}

}
