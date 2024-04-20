package org.example.DependencyInjectionEx.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");

        Person p=(Person)cont.getBean("conInjection");
        System.out.println(p);
    }

}
