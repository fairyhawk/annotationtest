package com.t1;

/**
 * @ClassName com.test.UseId
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-19 上午11:00:53
 */
public class UseId {
    // 普通的方法
    public void SayHiDefault(String name) {
        System.out.println("Hi, " + name);
    }

    // 使用注解并传入参数的方法
    @SayHiAnnotation("Jack")
    public void SayHiAnnotation(String name) {
        System.out.println("Hi, " + name);
    }

    // 使用注解并使用默认参数的方法
    @SayHiAnnotation
    public void SayHiAnnotationDefault(String name) {
        System.out.println("Hi, " + name);
    }
}
