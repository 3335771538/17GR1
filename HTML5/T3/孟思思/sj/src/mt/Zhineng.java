package mt;

public class Zhineng extends sj implements Shangwang,Bofang,Zhaoxiang{
private static final String name = null;

public Zhineng(){
	super();
}
public Zhineng(String xinxi,String dianhua){
	super(xinxi,dianhua);
}
public void bl(String name) {
	// TODO Auto-generated method stub
	System.out.println("��ʼ������Ƶ����"+name+"��...");
}
public void dian() {
	// TODO Auto-generated method stub
	System.out.println("���ʹ����ֵ�ͼƬ");
}
public void dianhua() {
	// TODO Auto-generated method stub
	System.out.println("��ʼ��Ƶͨ��");
}
public void print() {
	// TODO Auto-generated method stub
	System.out.println("����һ���ͺ�Ϊ��"+super.getXinghao()+"��"+super.getPinpai()+"�ֻ���");
}
public void zhao() {
	// TODO Auto-generated method stub
	System.out.println("���ꡣ�������ճɹ�");
}
public void wang() {
	// TODO Auto-generated method stub
	System.out.println("�������ƶ�����");
}
	

}
