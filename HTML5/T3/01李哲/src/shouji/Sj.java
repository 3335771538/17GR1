package shouji;

public class Sj extends Shouji implements Paizhao, Wangluo,
Bofang {

	public Sj(String brand, String type) {
		super("htc", "I9100");
	}

	public void bofang1() {
		System.out.println("��ʼ���š���ѩ��......");
	}

	public void wangluo() {

		System.out.println("�Ѿ������ƶ�����......");
	}

	public void paizhao() {
		System.out.println("����......���ճɹ�");
	}

	public static void main(String[] args) {

		Sj tpd = new Sj("G502c", "���ᰮ����");
		tpd.setBrand("G502c");
		tpd.setType("���ᰮ����");

		tpd.Info();

		tpd.call();
		tpd.sendInfo();
		tpd.bofang();

		Sj tpd1 = new Sj("htc", "I9100");
		tpd1.setBrand("htc");
		tpd1.setType("I9100");
		tpd1.Info();
		tpd1.bofang1();
		tpd.paizhao();
		tpd.wangluo();
	}

	@Override
	public void bofang() {
		System.out.println("��ʼ����������......");

	}


}
