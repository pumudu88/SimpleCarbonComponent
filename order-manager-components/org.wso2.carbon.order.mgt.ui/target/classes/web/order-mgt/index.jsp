
<%@ include file="config.jsp"%>
<%@ include file="deleteOrder.jsp"%>
<div id="middle">
	<h2>Order Management System</h2>
    <div id="workArea">
		<table class="styledLeft" id="moduleTable">
                <thead>
                <tr>
                    <th width="10%">id</th>
                    <th width="40%">Customer Name</th>
                    <th width="30%">Order Value</th>
                    <th width="20%"></th>
                </tr>
                </thead>
                <tbody>
                           <%
                               if(orders != null) {
                           		for(Order order:orders){
                           %>
                           		<tr>
                                	<td><%=order.getOrderId()%></td>
                                	<td><%=order.getCustomerName()%></td>
                                	<td><%=order.getOrderValue()%></td>
                                	<td>
                                        <FORM NAME="form_<%=order.getOrderId()%>"  METHOD="POST">
                                            <button TYPE="SUBMIT" NAME="delete" VALUE="<%=order.getOrderId()%>">Delete</button>
                                        </FORM>
                                    </td>
                                </tr>
                           <%
                           		}
                               } else {
                           %>
                                <tr>
                                    <td>
                                        No orders available
                                    </td>
                                </tr>
                           <%
                               }
                           %>
                </tbody>
         </table>
    </div>

</div>

