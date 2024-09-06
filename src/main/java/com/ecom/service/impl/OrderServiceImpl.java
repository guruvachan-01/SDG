package com.ecom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.ecom.model.Order;
import com.ecom.repository.OrderRepository;
import com.ecom.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	

	@Override
	public Order saveOrder(Order order) {
		
		return orderRepository.save(order);
	}

	@Override
	public Boolean deleteOrder(int id) {
		Order order = orderRepository.findById(id).orElse(null);
		if (!ObjectUtils.isEmpty(order)) {
			orderRepository.delete(order);
			return true;
		}
		return false;
	}

	@Override
	public List<Order> getAllorders() {
		
		return orderRepository.findAll();
	}

	

}
