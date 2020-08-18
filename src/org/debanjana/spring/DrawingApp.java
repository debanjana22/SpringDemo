package org.debanjana.spring;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Triangle triangle = new Triangle();
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Triangle triangle = (Triangle) factory.getBean("triangle"); //Type casted as getBean returns an object of type Object
		Triangle triangle = (Triangle) context.getBean("triangle"); //Type casted as getBean returns an object of type Object
		triangle.draw();
	}

}
