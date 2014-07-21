package com.t3;

/**
 * @ClassName com.t3.TestTable
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-21 下午3:23:56
 */
public class TestTable {
    
    
    public static void main(String[] args) {
        System.out.println(Table2.class.isAnnotationPresent(Table.class));
        System.out.println(Table3.class.isAnnotationPresent(Table.class));
    }
}
