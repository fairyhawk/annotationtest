package com.t2;

/**
 * @ClassName com.t2.TestLoad
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-19 下午5:44:43
 */
public class TestLoad {
    public static void main(String[] args) {
        ClassPathXMLLoad path = new ClassPathXMLLoad("annotationconfig.xml");
        UserServiceImpl userService = (UserServiceImpl) path.getBean("userService");
        userService.show();
    }
}
