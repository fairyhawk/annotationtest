package com.t2;

/**
 * 
 * @ClassName  com.t2.UserServiceImpl
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-19 下午5:44:13
 */
public class UserServiceImpl {

    @MyResource
	public UserDao userDao;
	
	@MyResource
	public UserDao user1Dao;

	@MyResource
	public UserDao user2Dao;

	/*// set方法上的注解，带有name属性
	@ZxfResource(name = "userDao")
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}*/

	// set方法上的注解，没有配置name属性
	/*@ZxfResource
	public void setUser1Dao(User1DaoImpl user1Dao) {
		this.user1Dao = user1Dao;
	}*/

	public void show() {
	    System.out.println("UserServiceImpl 开始执行");
	    userDao.show();
        user1Dao.show();
        user2Dao.show();
	}
}
