package T4�ӿ�2;

public class Putong extends Shouji implements BoFang{

	public Putong() {
		super();
	}

	public Putong(String xinxi, String dianhua) {
		super(xinxi, dianhua);
	}

	@Override
	public void bo(String name) {
		System.out.println("��ʼ�������֡�"+name+"��......");
	}

	@Override
	public void duan() {
		System.out.println("����������Ϣ��������");
	}

	@Override
	public void dianhua() {
		System.out.println("��ʼ����ͨ������������");
	}
public void print() {
   System.out.println("����һ���ͺ�Ϊ��"+super.getXinghao()+"��"+super.getPinpai()+"�ֻ���");
}

}
