package org.wso2.carbon.order.mgt.ui;

import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.order.mgt.data.xsd.Order;
import org.wso2.carbon.order.mgt.stub.OrderManagerServiceStub;

import java.rmi.RemoteException;


/**
 * Created by pumudu on 10/30/14.
 */
public class OrderManagerClient {

    private OrderManagerServiceStub stub;

    public OrderManagerClient(ConfigurationContext configCtx, String backendServerURL, String cookie) throws Exception {
        String serviceURL = backendServerURL + "OrderManagerService";
        stub = new OrderManagerServiceStub(configCtx,serviceURL);
        ServiceClient client = stub._getServiceClient();
        Options options = client.getOptions();
        options.setManageSession(true);
        options.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,cookie);
    }



    public Order getOrder(Integer id) {

        Order order = null ;

        try {
            order = stub.getOrder(id);
        } catch (RemoteException e) {
            e.printStackTrace();
        }


        return order;
    }

    public String echoString(String string) {

        String a = "nothing came from back end :( ";

        try {
            a =  stub.echoString(string);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return a;

    }


    public void addNewOrder(Order order) {
        try {

            stub.addOrder(order);

        } catch (RemoteException e) {

            e.printStackTrace();
        }

    }

    public Order[] getAllOrders() {

        Order[] orders = null;
        try {
           orders = stub.getAllOrdersArray();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return orders;
    }

    public void deleteOrder(String orderId) {

        int intOrderId = Integer.parseInt(orderId);

        try {
            stub.deleteOrder(intOrderId);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }


}
