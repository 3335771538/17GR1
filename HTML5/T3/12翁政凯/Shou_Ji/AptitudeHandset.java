package com.qhit.t04.Shou_Ji;

public class AptitudeHandset extends Handset implements Network,TheakePictures,PlayWiring{
	
	
	public void takePictures() {
		System.out.println("���ꡣ�������������������ճɹ�");
	}

	public void networkconn() {
		System.out.println("�Ѿ������ƶ����硣����������");
	}

	public void play(String in, String content) {
		System.out.println("��ʼ"+in+content);
	}
	
}