package diannao;

public class computer {
	cpu c;
	ems e;
	HardDisk h;
	public HardDisk getH() {
		return h;
	}
	public void setH(HardDisk h) {
		this.h = h;
	}
	public cpu getC() {
		return c;
	}
	public void setC(cpu c) {
		this.c = c;
	}
	public ems getE() {
		return e;
	}
	public void setE(ems e) {
		this.e = e;
	}
	
public void show(){
		System.out.println("���������Ϣ���£�");
		System.out.println("Cpu��Ʒ����:"+c.getCPUXinghao());
		System.out.println("��Ƶ��:"+c.getCPUzhupin());
		System.out.println("Ӳ�̵�����:"+h.getHDronliang());
		System.out.println("�ڴ��������:"+e.getEMSname());
	}
}
