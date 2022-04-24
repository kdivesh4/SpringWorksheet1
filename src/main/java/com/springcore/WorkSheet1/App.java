package com.springcore.WorkSheet1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Using Setter Injection!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/WorkSheet1/employee.xml");
        
        Address add1 = (Address) context.getBean("add1");
        Employee emp1 = (Employee)context.getBean("emp1");
        
        System.out.println("");
        System.out.println(emp1);
    }
}
