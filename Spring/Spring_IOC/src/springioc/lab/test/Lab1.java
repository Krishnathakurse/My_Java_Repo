package springioc.lab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {

	public static void main(String[] args) {
		
		// Spring container creation 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the beans required from spring container
		
		A ao = (A)ctx.getBean("aobj");
		ao.m1();
		
		B bo = (B) ctx.getBean("bobj");
		bo.m2();
	}
}
