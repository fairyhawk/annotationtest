package com.circle;

/**
 * @ClassName  com.circle.ClassA
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-22 下午5:23:14
 */
public class ClassA {
    private ClassB b;

    /**
     * @return the b
     */
    public ClassB getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(ClassB b) {
        this.b = b;
    }
    
  
    
    public  void say(){
        System.out.println("A+++自己");
    };
    
    public  void sayOther(){
        System.out.print("A++调用:");
        b.say();
    };
    
    
    
}
