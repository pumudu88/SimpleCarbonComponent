
/**
 * OrderManagerServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Aug 20, 2014 (01:52:10 IST)
 */

    package org.wso2.carbon.order.mgt.stub;

    /**
     *  OrderManagerServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class OrderManagerServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public OrderManagerServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public OrderManagerServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getAllOrdersForCustomer method
            * override this method for handling normal response from getAllOrdersForCustomer operation
            */
           public void receiveResultgetAllOrdersForCustomer(
                    org.wso2.carbon.order.mgt.data.xsd.Order[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllOrdersForCustomer operation
           */
            public void receiveErrorgetAllOrdersForCustomer(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for echoString method
            * override this method for handling normal response from echoString operation
            */
           public void receiveResultechoString(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from echoString operation
           */
            public void receiveErrorechoString(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllOrdersArray method
            * override this method for handling normal response from getAllOrdersArray operation
            */
           public void receiveResultgetAllOrdersArray(
                    org.wso2.carbon.order.mgt.data.xsd.Order[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllOrdersArray operation
           */
            public void receiveErrorgetAllOrdersArray(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOrder method
            * override this method for handling normal response from getOrder operation
            */
           public void receiveResultgetOrder(
                    org.wso2.carbon.order.mgt.data.xsd.Order result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOrder operation
           */
            public void receiveErrorgetOrder(java.lang.Exception e) {
            }
                


    }
    