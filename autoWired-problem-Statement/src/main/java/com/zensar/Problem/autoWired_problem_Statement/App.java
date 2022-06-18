package com.zensar.Problem.autoWired_problem_Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.bean.Department;
import com.zensar.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        Employee emp=context.getBean("employee", Employee.class);
        System.out.println(emp);
    }
}
