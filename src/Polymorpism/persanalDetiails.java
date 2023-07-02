package Polymorpism;

public class persanalDetiails extends Overriding {

	
	public void name() {
		System.out.println("siva");
		}
		public void age() {
		System.out.println("15");
		}

		public void city() {
			
			System.out.println("krc");
		}
	
	
	
	public static void main(String[] args) {
		persanalDetiails pd=new persanalDetiails();
		pd.age();
		Overriding o=new Overriding();
		o.age();
	}

}
