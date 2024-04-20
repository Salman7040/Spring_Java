package org.example.DependencyInjectionEx.ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceMain {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");

        A a=(A) cont.getBean("aRef");
        B b=(B) cont.getBean("bRef");
        System.out.println(a);

    }
}
