package springioc.lab.test;

public class A {

	Hello hello = null;
	Hai hai = null;
	
	public void setHello(Hello hello) {
		this.hello = hello;
	}
	
	public void setHai(Hai hai) {
		this.hai = hai;
	}
	
	void m1() {
		hello.show();
		hai.show();
	}
}
