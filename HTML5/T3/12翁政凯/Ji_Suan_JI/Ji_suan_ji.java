package com.qhit.t04.Ji_Suan_JI;

public class Ji_suan_ji implements CPU,EMS,HardDisk {

	public String hardDisk(String h) {
		
		return "Ӳ�������ǣ�"+h;
	}

	public String ems(String e) {
		
		return "�ڴ������ǣ�"+e;
	}

	public String cpu(String c, String p) {
		
		return "CPU��Ʒ���ǣ�" +c+ ",��Ƶ�ǣ�"+p;
	}

	
	public static void main(String[] args) {
		Ji_suan_ji j = new Ji_suan_ji();
		System.out.println(j.cpu("Intel", "3.8GHz"));
		System.out.println(j.hardDisk("3000GB"));
		System.out.println(j.ems("4GB"));
	}
}
