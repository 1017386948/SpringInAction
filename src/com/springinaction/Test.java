package com.springinaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.knights.Knight;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"knights.xml");
		Knight k = ctx.getBean(Knight.class);
		ctx.close();
		k.embarkOnQuest();
	}
}
