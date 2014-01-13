package com.aurorasolutions.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurorasolutions.springframework.beans.Writer;

public class Main {
	public static void main(String[] args) {
		// get context definition
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aurorasolutions/springframework/application-context.xml");
        Writer writer; 
        
        // get sentence writer bean and execute
        writer = (Writer) ctx.getBean("sentence");
        writer.write();
        System.out.println("---------------------");
        // get poetic writer bean and execute
        writer = (Writer) ctx.getBean("poet");
        writer.write();
	}
}