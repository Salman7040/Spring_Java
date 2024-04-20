package org.example.DependencyInjectionEx.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");
        Emp emp = (Emp) cont.getBean("EmpCollEx");

        System.out.println(emp);

    }
}
