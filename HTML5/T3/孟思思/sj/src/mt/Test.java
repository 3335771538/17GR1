package mt;

public class Test {
public static void gai(sj s){
	if(s instanceof Putong){
		Putong k =(Putong)s;
		k.dian();
		k.bl("��ѩ");
		k.dian();
		k.dianhua();
	}else if(s instanceof Zhineng){
		Zhineng z = (Zhineng)s;
		z.bl("Сʱ��");
		z.zhao();
		z.dian();
		z.dianhua();
		
	}

}
public static void main(String[] args) {
	sj p=new Putong("ŵ65","ŵ����");
    p.print();
    gai(p);
    System.out.println();
    System.out.println("......");
    System.out.println();
    System.out.println();
    sj z=new Zhineng("vivo x20Plus","������");
    z.print();
    gai(z);
}
}


