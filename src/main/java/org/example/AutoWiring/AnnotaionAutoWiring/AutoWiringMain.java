package org.example.AutoWiring.AnnotaionAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringMain {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("AutoWiringCfg.xml");
        Emp emp1=(Emp)cont.getBean("emp1");
        System.out.println(emp1);
    }
}
