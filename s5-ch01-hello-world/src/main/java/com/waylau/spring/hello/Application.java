/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Main.
 * 
 * @since 1.0.0 2018年1月25日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@ComponentScan
public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new
				ClassPathXmlApplicationContext("spring.xml");
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
	}


}
