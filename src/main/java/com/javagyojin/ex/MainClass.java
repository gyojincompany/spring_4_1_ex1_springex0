package com.javagyojin.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyInfo myInfo2 = ctx.getBean("myInfo2", MyInfo.class);
		
		myInfo2.getInfoPrint();
		
		ctx.close();
		
		
	}

}
