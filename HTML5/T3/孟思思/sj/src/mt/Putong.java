package mt;

public class Putong extends sj implements Bofang{
public Putong(){
	super();
}
public  Putong (String xinxi,String dianhua){
	super(xinxi,dianhua);
}
	@Override
	public void bl(String name) {
		// TODO Auto-generated method stub
		System.out.println("��ʼ�������֡�"+name+"��");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("����һ���ͺ�Ϊ"+super.getXinghao()+super.getPinpai()+"�ֻ�" );
	}

	@Override
	public void dian() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ�������ֶ���");
	}

	@Override
	public void dianhua() {
		// TODO Auto-generated method stub
	System.out.println("��ʼ��绰");	
	}

}
