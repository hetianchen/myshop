package com.factory;

import com.service.GoodsService;
import com.service.OrderService;
import com.service.ShoppingCarService;
import com.service.UsersService;
import com.serviceimpl.GoodsServiceImpl;
import com.serviceimpl.OrderServiceImpl;
import com.serviceimpl.ShoppingCarServiceImpl;
import com.serviceimpl.UsersServiceImpl;

public class ServiceFactory {
	
	//获取 UsersService 实例
	public static UsersService getUsersServiceInstance(){
		return new UsersServiceImpl();
	}
	
	//获取 GoodsService 实例
	public static GoodsService getGoodsServiceInstance(){
		return new GoodsServiceImpl();
	}
	
	//获取 ShoppingCarService 实例
	public static ShoppingCarService getShoppingCarServiceInstance(){
		return new ShoppingCarServiceImpl();
	}
	
	//获取 OrderService 实例
	public static OrderService getOrderServiceInstance(){
		return new OrderServiceImpl();
	}

}
