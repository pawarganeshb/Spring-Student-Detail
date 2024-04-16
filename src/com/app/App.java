package com.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // Load the Spring XML configuration file
        BeanFactory bf = new FileSystemXmlApplicationContext("bean.xml");
        
        // Retrieve the Address bean from the Spring container
        Address add = (Address) bf.getBean("addr1");
        // Print the information of the Address object
        System.out.println(add.toString());
    }
}
