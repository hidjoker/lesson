package innerClass;

interface Anonymous {
	void out();
}

public class AnonymousEx {
	public static void main(String[] args) {
		
		Anonymous an;
		
		an = new Anonymous() {
			@Override
			public void out() {
				System.out.println("劳疙按眉 1锅");
			}
		};
		an.out();
		
		Anonymous an2 = new Anonymous() {
			@Override
			public void out() {
				System.out.println("劳疙按眉 2锅");
			}
		};
		an2.out();
		
		new Anonymous() {
			@Override
			public void out() {
				System.out.println("劳疙按眉 3锅");
			}
		}.out();
		
		
		
//		class A{
//			public A(){	
//			}
//		    public void out() { 	
//		    }
//		}
//		
//		A a = new A();
//	     a.out();
//		 new A().out();
		    
		
		
	}
}
