package com.learn.learn001;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhoupeng
 */
public class Client {

    public static void main(String[] args) {
        String beanXml = "classpath:bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(beanXml);
        HelloWorld helloWorld1 = applicationContext.getBean("helloWorld1", HelloWorld.class);
        helloWorld1.say();
    }

}
