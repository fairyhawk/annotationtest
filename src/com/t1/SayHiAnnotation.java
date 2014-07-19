package com.t1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName com.test.Id
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-19 上午10:56:52
 */
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SayHiAnnotation {
    String paramValue() default "default value"; // 表示我的注解需要一个参数 名为"paramValue"
                                                 // 默认值为"default value"

    String value() default "";
}
