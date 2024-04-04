package com.example.learning.springpractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("app-context.xml");
        Sim sim = applicationContext.getBean("sim", Sim.class);
        sim.data();
        sim.calling();


        BeanFactory factory = new ClassPathXmlApplicationContext("app-context.xml");
        Student student = (Student) factory.getBean("student");
        System.out.println(student);

        BeanFactory employeeFactory = new ClassPathXmlApplicationContext("app-context.xml");
        Employee employee= (Employee) employeeFactory.getBean("employee");
        System.out.println(employee);



        BeanFactory quesFactory = new ClassPathXmlApplicationContext("app-context.xml");
        Question ques= (Question) quesFactory.getBean("question");
        System.out.println(ques);

       /* Sim sim= new Airtel();
        sim.calling();
        sim.data();*/

    }
}
