package com.zuoye5;

public class Jisuanji implements Cup,Neicun,Yingpan{

	@Override
	public void ying(String daxiao) {
		// TODO Auto-generated method stub
		System.out.println("Ӳ�̴�СΪ��"+daxiao);
	}

	@Override
	public void cun(String rong) {
		// TODO Auto-generated method stub
		System.out.println("�ڴ��С��"+rong);
	}

	@Override
	public void cup(String pin, String zhupin) {
		// TODO Auto-generated method stub
		System.out.println("�������Ʒ����"+pin+"��Ƶ�ǣ�"+zhupin);
	}

	
	
	
	
}
