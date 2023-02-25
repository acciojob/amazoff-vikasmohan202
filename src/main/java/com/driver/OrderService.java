package com.driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {


    OrderRepository orderRepository=new OrderRepository();


    public void addOrder(Order order){
        orderRepository.addOrder(order);
    }

    public void addPartner(String id){
        orderRepository.addPartner(id);
    }

    public void addOrderPartnerPair(String orderId,String partnerId){
        orderRepository.addOrderPartnerPair(orderId,partnerId);
    }

    public Order getByOrderId(String orderId){
        return orderRepository.getOrderById(orderId);
    }

    public DeliveryPartner getPartnerById(String partnerId){
        return orderRepository.getPartnerById(partnerId);
    }

    public Integer getOrderCountByPartnerId(String partnerId){
        return orderRepository.getOrderCountByPartnerId(partnerId);
    }

    public List<String> getOrdersByPartnerId(String partnerId){
        return orderRepository.getOrdersByPartnerId(partnerId);
    }

    public List<String> getAllOrder(){
        return orderRepository.getAllOrders();
    }

    public int getCountOfUnassignedOrder(){
        return orderRepository.getCountOfUnassignedOrders();
    }

    public int getOrdersLeftAfterTime(String time,String partnerId){
        return orderRepository.getOrdersLeftAfterGivenTimeByPartnerId(time, partnerId);
    }

    public String getLastDeliveryTime(String partnerId){
        return orderRepository.getLastDeliveryTimeByPartnerId(partnerId);
    }

    public void deletePartnerById(String partnerId){
        orderRepository.deletePartnerById(partnerId);
    }

    public void deleteOrderById(String orderId){
        orderRepository.deleteOrderById(orderId);
    }
}