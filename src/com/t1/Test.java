package com.t1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName com.test.Test
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-19 上午11:01:55
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
        try {
            String str = "com.test.UseId";
            Class c = Class.forName(str);
            Object obj = c.newInstance();
            
            
            Method[] methods = obj.getClass().getDeclaredMethods(); // 获得所有方法
            for (Method method : methods) {
                SayHiAnnotation annotationTmp = method.getAnnotation(SayHiAnnotation.class);
                if (annotationTmp != null) // 检测是否使用了我们的注解
                    method.invoke(obj, annotationTmp.paramValue()); // 如果使用了我们的注解，我们就把注解里的"paramValue"参数值作为方法参数来调用方法
                else
                    method.invoke(obj, "Rose"); // 如果没有使用我们的注解，我们就需要使用普通的方式来调用方法了
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
