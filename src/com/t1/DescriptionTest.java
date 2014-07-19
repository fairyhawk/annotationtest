package com.t1;

/**
 * @ClassName  com.test.DescriptionTest
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-19 下午2:58:17
 */
@Description(author="helloworld",size=200)
public class DescriptionTest {
    public static void main(String[] args) {
        Class clazz = DescriptionTest.class;
        
        if(clazz.isAnnotationPresent(Description.class)){
            Description desc = (Description)clazz.getAnnotation(Description.class);
            System.out.println("desc.author:" + desc.author());
            System.out.println("desc.size:" + desc.size());
        }else{
            System.out.println("没有在DescriptionTest上使用注解!");
        }
  
     }
}
