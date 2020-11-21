package springioc.lab.test;

public class Hello {

	int a;
	String str;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	public void show() {
		System.out.println(a);
		System.out.println(str);
	}
}
