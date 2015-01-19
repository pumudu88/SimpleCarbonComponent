package org.wso2.carbon.order.mgt;

import org.wso2.carbon.order.mgt.data.Order;

import java.util.*;

/**
 * Created by pumudu on 10/30/14.
 */
public class OrderService {


    private HashMap orders = new HashMap();

    public OrderService() {

        Order order1 = new Order();
        order1.setOrderId(1);
        order1.setCustomerName("Rama");
        order1.setOrderValue("400.00");

        Order order2 = new Order();
        order2.setOrderId(2);
        order2.setCustomerName("Mobby");
        order2.setOrderValue("300.00");

        orders.put(order1.getOrderId(),order1);
        orders.put(order2.getOrderId(),order2);

    }


    /**
     * echo string method
     * @param input
     * @return
     */
    public String echoString(String input){
        String echoOut = "hello " + input ;
        return echoOut;
    }

    /**
     * Add an Order
     * @param order
     */
    public void addOrder(Order order) {

        this.orders.put(order.getOrderId(), order);
    }

    /**
     * Search an order
     *
     * @param id the order name
     * @return return order.
     */
    public Order getOrder(Integer id) {

        return (Order) this.orders.get(id);
    }

    /**
     * update an order
     * @param order
     * @return
     */
    public void updateOrder(Order order) {

        this.orders.put(order.getOrderId(), order);
    }

    /**
     * delete an order
     * @param id
     */
    public void deleteOrder(Integer id) {

        this.orders.remove(id);
    }


    /**
     * return all order list
     * @return
     */
    public Order[] getAllOrdersArray() {

        Order[] orders = new Order[this.orders.size()];
        this.orders.values().toArray(orders);

        return orders;

    }

    /**
     * return all orders from given customer
     * @param customerName
     * @return
     */
    public List<Order> getAllOrdersForCustomer(String customerName ) {

        List<Order>  customerOrderArray = new ArrayList<Order>();

        Iterator entries = this.orders.entrySet().iterator();
        String name;

        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            Order orderObject = (Order) entry.getValue();
            name = orderObject.getCustomerName();

            if(name.equals(customerName)) {
                customerOrderArray.add(orderObject);
            }
        }
        return customerOrderArray;
    }



}
