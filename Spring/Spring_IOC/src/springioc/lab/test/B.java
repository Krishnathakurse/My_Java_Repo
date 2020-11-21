package springioc.lab.test;

public class B {

	Hello hello = null;
	Hai hai = null;
	
	public B(Hello hello, Hai hai) {
		this.hello = hello;
		this.hai = hai;
	}
	
	void m2()
	{
		hello.show();
		hai.show();
	}
}
