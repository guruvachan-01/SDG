package com.ecom.service;

import java.util.List;

import com.ecom.model.Order;

public interface OrderService {

	public Order saveOrder(Order order);
	
	public Boolean deleteOrder(int id);
	
	public List<Order> getAllorders();
}
