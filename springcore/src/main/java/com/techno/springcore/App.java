package com.techno.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");  
//     Airtel air =context.getBean("airtel",Airtel.class); 
//     air.network();
//     air.signal();
//     
     Jio jio =context.getBean("jio",Jio.class);
     jio.network();
     jio.signal();
     
     
    // System.out.println("ioc reading the config file");
     
    }
}
