package com.t0404;

public class Computers extends Computer implements Ems , Harddisk{

	
	void pinpai(String pp, String zp) {
		// TODO Auto-generated method stub
		System.out.println("�������Ϣ���£�");
		System.out.println("CPU��Ʒ����:"+pp+"    "+"��Ƶ��:"+zp);
	}

	
	public void rl1(String gb1) {
		// TODO Auto-generated method stub
		System.out.println("Ӳ��������:"+gb1);
	}
	
	public void rl(String gb) {
		// TODO Auto-generated method stub
		System.out.println("�ڴ�������:"+gb);
	}

}
