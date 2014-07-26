package com.circle;

/**
 * @ClassName  com.circle.ClassB
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-22 下午5:23:20
 */
public class ClassB {
    
    private ClassC c;
    
    /**
     * @return the c
     */
    public ClassC getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(ClassC c) {
        this.c = c;
    }

    
    public  void say(){
        System.out.println("B+++自己");
    };
    
    
    public  void sayOther(){
        System.out.print("B++调用:");
        c.say();
    };
}
