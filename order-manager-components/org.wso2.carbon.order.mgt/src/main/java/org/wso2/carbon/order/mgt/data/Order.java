package org.wso2.carbon.order.mgt.data;

/**
 * Created by pumudu on 10/30/14.
 */
public class Order {

    private Integer orderId = null;
    private String customerName =null;
    private String orderValue =null;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(String orderValue) {
        this.orderValue = orderValue;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }





}
