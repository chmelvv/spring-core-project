package com.epam.spring.project01;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.spring.project01.dao.UserDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	UserDaoImpl userDaoImpl;
	
	public App(UserDaoImpl userDaoImpl){
		this.userDaoImpl = userDaoImpl;
	}
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("main.xml");
    	UserDaoImpl userDaoImpl =  ctx.getBean("UserDaoImpl", UserDaoImpl.class);
    	
    	for (User user:userDaoImpl.getAllUsers() ){
    		System.out.println(user.toString());
    	}
    }
}
