package org.debarshee;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.FileSystemResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        System.out.println("This is a Maven Project.");

        /* BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        Alien object = (Alien) factory.getBean("alien");
        object.information(); */

//      This is a Singleton object. That means it will only create one object per class.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien object = (Alien) context.getBean("alien");
        object.information();

        System.out.println(object.getIdentity());
    }
}