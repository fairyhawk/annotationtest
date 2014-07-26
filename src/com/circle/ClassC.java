package com.circle;

/**
 * @ClassName  com.circle.ClassC
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-22 下午5:23:25
 */
public class ClassC {

    private ClassA a;
    
    /**
     * @return the a
     */
    public ClassA getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(ClassA a) {
        this.a = a;
    }

    public  void say(){
        System.out.println("C+++自己");
    };
    

    public  void sayOther(){
        System.out.print("C++调用:");
        a.say();
    };
    
}
