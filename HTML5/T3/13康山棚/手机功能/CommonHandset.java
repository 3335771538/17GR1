package com.qinghuaIT;

public class CommonHandset extends Handset implements PlayWiring{
	public void info(String brank,String type){
		super.toString(brank,type);
	}
	public void play(String yinyue) {
		String y=yinyue;
		System.out.println("��ʼ��������"+y+"......");
	}
	public void sendInfo() {
		System.out.println("����������Ϣ......");
	}
	public void call() {
		System.out.println("��ʼ����ͨ��......");
	}
}
