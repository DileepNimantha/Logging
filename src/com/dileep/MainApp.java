package com.dileep;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static Logger log = Logger.getLogger(MainApp.class.getName());
	static Log logCommonsLogging = LogFactory.getLog(MainApp.class.getName());

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		log.info("Going to create HelloWorld Obj");
		logCommonsLogging.info("Commons Logging: Going to create HelloWorld Obj");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

		obj.getMessage();

		log.info("Exiting the program");
		logCommonsLogging.info("Commons Logging: Exiting the program");
	}
}
