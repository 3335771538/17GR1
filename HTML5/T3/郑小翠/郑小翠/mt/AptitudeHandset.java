package mt;

	public class AptitudeHandset extends sj implements TheakePicture,Network,PlayWirring{

	

		
		public AptitudeHandset(String brand, String type) {
			super("htc", "I9100");
		}
	
		public void play1() {
			System.out.println( "��ʼ���š���ѩ��......");
		}

		public void networkConn() {
			
			System.out.println("�Ѿ������ƶ�����......");
		}
		
		public void takePictures() {
			System.out.println("����......���ճɹ�");
		}
		
		
		public static void main(String[] args){
			
			AptitudeHandset tpd = new AptitudeHandset("G502c", "���ᰮ����");
			tpd.setBrand("G502c");
			tpd.setType( "���ᰮ����");
			
			tpd.Info();
		
			tpd.call();
			tpd.sendInfo();
			 tpd.play();
			 
				AptitudeHandset tpd1 = new AptitudeHandset("htc", "I9100");
				tpd1.setBrand("htc");
				tpd1.setType(  "I9100");
				tpd1.Info();
				 tpd1.play1();
				 tpd.takePictures();
					tpd.networkConn();
		}

		@Override
		public void play() {
			System.out.println( "��ʼ����������......");
			
		}

		

	}	
		
		

