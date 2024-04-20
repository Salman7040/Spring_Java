package org.example.StereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class StereoTypeMain {
    public static void main(String[] args) {

        ApplicationContext cont=new ClassPathXmlApplicationContext("StereoTypeCfg.xml");
//
//        Student std=(Student)cont.getBean("student");
//
//        System.out.println(std);

    }
}
