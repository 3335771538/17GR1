package com.t02;

public class Test {
	public static void main(String[] args) {
		
		CommonHandset ch = new CommonHandset();
		AptitudeHandset ah = new AptitudeHandset();
		ch.info("G502c","����");
		ch.sendInfo();
		ch.call();
		ch.play("����ѩ��");
		ah.info("HTC", "I9100");
		ah.nteworkConn();
		ah.play("��Сʱ����");
		ah.takePictures();
		ah.sendInfo();
		ah.call();
	}
}
