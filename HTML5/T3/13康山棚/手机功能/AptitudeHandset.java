package com.qinghuaIT;

public class AptitudeHandset extends Handset implements Network,PlayWiring,TheakePictures{
	public void info(String brank,String type){
		super.toString(brank,type);
	}
	public void networkConn() {
		System.out.println("�Ѿ������ƶ�����......");
	}
	public void play(String yinyue) {
		String y=yinyue;
		System.out.println("��ʼ������Ƶ"+y+"......");
	}
	public void takePictures() {
		System.out.println("�ǲ�......���ճɹ�");
	}
	public void sendInfo() {
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ......");
	}
	public void call() {
		System.out.println("��ʼ����ͨ��......");
	}
}
