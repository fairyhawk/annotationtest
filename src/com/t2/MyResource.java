package com.t2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @ClassName com.t2.ZxfResource
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-19 下午5:44:17
 */
// 在运行时执行
@Retention(RetentionPolicy.RUNTIME)
// 注解适用地方(字段和方法)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface MyResource {

    // 注解的name属性
    public String name() default "";
}
