package computer;

public class computer {
	public void Print(CPU p){
		System.out.println("CPU��Ʒ���ǣ�"+p.mather()+"��Ƶ�ǣ�"+p.zhupin());
	}
	public void print1(HHD h){
		System.out.println("Ӳ�̵������ǣ�"+h.TD());
	}
	public void print2(Nc n){
		System.out.println("�ڴ��С��"+n.neicun());
		
	}
	public static void main(String[] args) {
		computer c =new computer();
		c.Print(new Inter());
		c.print1(new Td());
		c.print2(new Bnc());
		
	}

}
