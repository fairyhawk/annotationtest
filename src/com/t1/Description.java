package com.t1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName  com.test.Description
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-19 下午2:57:23
 */
@Target({ElementType.TYPE}) 
@Retention(RetentionPolicy.RUNTIME) 
@Documented 
@Inherited
public @interface Description {
    String author() default "william"; //定义"作者"参数
    int size(); //定义"大小"参数
}
