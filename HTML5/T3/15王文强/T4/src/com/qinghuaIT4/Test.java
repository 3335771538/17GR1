package com.qinghuaIT4;

public class Test {

	public static void main(String[] args) {
		CommonHandset ch = new CommonHandset();
		AptitudeHandset ah = new AptitudeHandset();
		ch.info("G502c","����");
		ch.play("����ѩ��");
		ch.sendInfo();
		ch.call();
		ah.toString("I9100","HTC");
		ah.networkConn();
		ah.play("��Сʱ����");
		ah.takePictures();
		ah.sendInfo();
		ah.call();
	}
}
