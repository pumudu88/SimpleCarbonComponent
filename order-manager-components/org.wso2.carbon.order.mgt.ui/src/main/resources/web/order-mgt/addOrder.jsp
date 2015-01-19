<%@ include file="config.jsp"%>
<%
    if(request.getMethod().equals("POST")) {
        if(request.getParameter("orderId") != "") {

            if(request.getParameter("orderId").matches("[0-9]+")) {

                int intOrderId = Integer.parseInt(request.getParameter("orderId"));

                Order order = new Order();
                order.setOrderId(intOrderId);
                order.setCustomerName(request.getParameter("customerName"));
                order.setOrderValue(request.getParameter("value"));

                client.addNewOrder(order);
%>
            <script type="text/javascript">
                location.href="index.jsp";
                <%--alert("clicked delete<%= request.getParameter("delete") %>");--%>
            </script>
<%
            } else {
%>
            <script type="text/javascript">
                alert("please enter valid order id");
            </script>
<%
            }

        } else {
%>
            <script type="text/javascript">
                alert("please enter order id");
            </script>
<%
        }
    }
%>




<div id="middle">
    <h2>Order Management System</h2>
    <h3>Add New Order</h3>
    <div id="workArea">
        <form action="addOrder.jsp" method="POST">
            <table class="styledLeft" id="formTable">
                <thead>
                <tr>
                    <th>New Order</th>
                </tr>
                </thead>
                <tr>
                    <td>Order Id</td>
                    <td><input type="text" name="orderId"></td>
                </tr>
                <tr>
                    <td>Customer Name</td>
                    <td><input type="text" name="customerName" /></td>
                </tr>
                <tr>
                    <td>Order Value</td>
                    <td><input type="text" name="value" /></td>
                </tr>
            </table>
            <input type="submit" value="Submit" />
        </form>
    </div>



</div>