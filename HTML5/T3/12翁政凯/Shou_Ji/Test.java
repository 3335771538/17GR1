package com.qhit.t04.Shou_Ji;

public class Test {
	
	public static void main(String[] args) {
		CommoHandset c = new CommoHandset();
		c.brand="G502c";
		c.type="���������";
		c.sendlnfo();
		c.play("��������","����ѩ��");
		c.call("����ͨ��.....");
		c.info("������Ϣ.....");
		
		System.out.println("\n");
		
		AptitudeHandset a = new AptitudeHandset();
		a.brand="HTC";
		a.type="I9100";
		a.sendlnfo();
		a.networkconn();
		a.play("������Ƶ","��Сʱ����....");
		a.takePictures();
		a.call("����ͨ������������������.");
		a.info("��ͼƬ�����ֵ���Ϣ����������");
		
	}
	
}
