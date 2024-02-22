package http;

 class A {
	static A a;
	private A()
	{
		
	}
	public static A getA()
	{
		if (a!=null) {
			return a;
		}
		else
		{
			a=new A();
			return a;
		}
	}
}
 
