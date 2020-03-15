package org.springLookup;

import org.springLookup.beans.Department;
import org.springLookup.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Employee emp1=(Employee)context.getBean("employee");
        Department dept1=emp1.lookup();
        dept1.setDeptName("CS");
        dept1.setCreatedOn(new Date(System.currentTimeMillis()));
        System.out.println("Dept1 " + dept1);

        Employee emp2=(Employee)context.getBean("employee");
        System.out.println("Dept2 " + emp2.lookup());
    }
}
