package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		WishMessageGenerator genrator = ctx.getBean("wmg",WishMessageGenerator.class);
			String result=genrator.ShowWishMessage("Suryateja kesireddy");
			System.out.println("result is:"+result);
			ctx.close();
	}
	

}
