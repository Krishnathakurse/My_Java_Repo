package springioc.lab.test;

public class Hai {
	
	int x;
	String msg;
	
	public Hai (int x, String msg) {
		super();
		this.x = x;
		this.msg = msg;
	}

	void show() {
		 System.out.println(x);
		 System.out.println(msg);
	}
}
