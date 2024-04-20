package org.example.DependencyInjectionEx.SetterType;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterMain {
    public static void main(String[] args) {

//      TODO:Dependency Injection Using Setter Method
        ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");
        Student std1 = (Student) cont.getBean("student1");
        Student std2 = (Student) cont.getBean("student2");
        Student std3 = (Student) cont.getBean("student3");
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);


    }
}
