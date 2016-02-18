package com.epam.spring.project01;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
	UserService userService;
	
	public App(UserService userService){
		this.userService = userService;
	}
    public static void main( String[] args )
    {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("main.xml");
    	UserService userService =  ctx.getBean("userService", UserService.class);
    	
    	for (User user:userService.getAllUsers() ){
    		System.out.println(user.toString());
    	}
    }
}
