package com.sist.main4;


import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/*
 * 	ApplicationContext
 * 	AnnotationConfigApplicationContext ==> ver.5
 */
public class MainClass {
	private Sawon sa;
	
	public Sawon getSa() {
		return sa;
	}

	public void setSa(Sawon sa) {
		this.sa = sa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext app=
		//		new ClassPathXmlApplicationContext("app4.xml");
		GenericApplicationContext app=
				new GenericXmlApplicationContext("app4.xml");
		//Sawon sa=(Sawon)app.getBean("sa1");
		//sa.init();
		//sa.print();
		// sa.destory() (X)
		//app.close();
	}

}
