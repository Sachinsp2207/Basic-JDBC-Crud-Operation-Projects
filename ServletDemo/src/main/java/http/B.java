package http;
public class B{
	public static void main(String[] args) {
		A a1=A.getA();
		A a2=A.getA();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
	}
	
}

