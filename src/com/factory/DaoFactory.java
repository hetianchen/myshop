package com.factory;

import com.dao.GoodsDao;
import com.dao.OrderDao;
import com.dao.UsersDao;
import com.daoimpl.GoodsDaoImpl;
import com.daoimpl.OrderDaoImpl;
import com.daoimpl.UsersDaoImpl;

/**
 * 静态工厂 ， 生产对象
 * @author Administrator
 *
 */
public class DaoFactory {
	
	//获取 UsersDao 实例
	public static UsersDao getUsersDaoInstance(){
		return new UsersDaoImpl();
	}
	
	//获取 GoodsDao 实例
	public static GoodsDao getGoodsDaoInstance(){
		return new GoodsDaoImpl();
	}
	
	//获取 OrderDao 实例
	public static OrderDao getOrderDaoInstance(){
		return new OrderDaoImpl();
	}
	
}
