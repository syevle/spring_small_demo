package com.java2novice.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class SpringDemo {
 
    public static void main(String a[]){
        String confFile = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
        SpringFirstTest sft = (SpringFirstTest) context.getBean("springTest");
        sft.testMe();
    }
}
