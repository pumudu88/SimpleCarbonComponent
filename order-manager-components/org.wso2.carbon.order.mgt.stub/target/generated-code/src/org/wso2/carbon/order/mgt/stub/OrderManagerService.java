

/**
 * OrderManagerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Aug 20, 2014 (01:52:10 IST)
 */

    package org.wso2.carbon.order.mgt.stub;

    /*
     *  OrderManagerService java interface
     */

    public interface OrderManagerService {
          
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  updateOrder(
         org.wso2.carbon.order.mgt.data.xsd.Order order6

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getAllOrdersForCustomer7
                
         */

         
                     public org.wso2.carbon.order.mgt.data.xsd.Order[] getAllOrdersForCustomer(

                        java.lang.String customerName8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllOrdersForCustomer7
            
          */
        public void startgetAllOrdersForCustomer(

            java.lang.String customerName8,

            final org.wso2.carbon.order.mgt.stub.OrderManagerServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  deleteOrder(
         int id12

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addOrder(
         org.wso2.carbon.order.mgt.data.xsd.Order order14

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param echoString15
                
         */

         
                     public java.lang.String echoString(

                        java.lang.String input16)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param echoString15
            
          */
        public void startechoString(

            java.lang.String input16,

            final org.wso2.carbon.order.mgt.stub.OrderManagerServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAllOrdersArray19
                
         */

         
                     public org.wso2.carbon.order.mgt.data.xsd.Order[] getAllOrdersArray(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllOrdersArray19
            
          */
        public void startgetAllOrdersArray(

            

            final org.wso2.carbon.order.mgt.stub.OrderManagerServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getOrder22
                
         */

         
                     public org.wso2.carbon.order.mgt.data.xsd.Order getOrder(

                        int id23)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getOrder22
            
          */
        public void startgetOrder(

            int id23,

            final org.wso2.carbon.order.mgt.stub.OrderManagerServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    