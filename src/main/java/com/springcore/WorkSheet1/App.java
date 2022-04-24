package com.springcore.WorkSheet1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Worksheet1" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/WorkSheet1/employee.xml");
        
        Address add1 = (Address) context.getBean("add1");
        Address add2 = (Address) context.getBean("add2");
        Address add3 = (Address) context.getBean("add3");
        Address add4 = (Address) context.getBean("add4");
        
        Employee emp1 = (Employee)context.getBean("emp1");
        Employee emp2 = (Employee)context.getBean("emp2");
        Employee emp3 = (Employee)context.getBean("emp3");
        Employee emp4 = (Employee)context.getBean("emp4");
        System.out.println("");
        System.out.println(emp1);
        System.out.println("");
        System.out.println(emp2);
        System.out.println("");
        System.out.println(emp3);
        System.out.println("");
        System.out.println(emp4);
    }
}
