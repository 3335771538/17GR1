package T4�ӿ�2;

public class ZhiNeng extends Shouji implements BoFang ,ShangWang,ZhaoXiang {
	public ZhiNeng() {
		super();
	}

	public ZhiNeng(String xinxi, String dianhua) {
		super(xinxi, dianhua);
	}

	@Override
	public void bo(String name) {
		System.out.println("��ʼ������Ƶ����"+name+"��......");
	}

	@Override
	public void duan() {
		System.out.println("���ʹ�ͼƬ��������Ϣ��������");
	}

	@Override
	public void dianhua() {
		System.out.println("��ʼ��Ƶͨ������������");
	}
public void print() {
   System.out.println("����һ���ͺ�Ϊ��"+super.getXinghao()+"��"+super.getPinpai()+"�ֻ���");
}

@Override
public void zhao() {
	System.out.println("����.......���ճɹ�");
}

@Override
public void wang() {
	System.out.println("�Ѿ������ƶ�����......");
}
}
