package com.circle;

import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName com.circle.TestCircle
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-22 下午5:23:41
 */
public class TestCircle {

    private static ClassPathXmlApplicationContext ctx;

    public static void main(String[] args) {
        try {

            ctx = new ClassPathXmlApplicationContext("spring-circle.xml");

            ClassA a = (ClassA) ctx.getBean("a");
            a.say();
            a.sayOther();

            ClassB b = (ClassB) ctx.getBean("b");
            b.say();
            b.sayOther();

            ClassC c = (ClassC) ctx.getBean("c");
            c.say();
            c.sayOther();
            //AbstractBeanFactory
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
