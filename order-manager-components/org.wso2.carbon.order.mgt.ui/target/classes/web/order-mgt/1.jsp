<!--
 ~ Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 ~
 ~ WSO2 Inc. licenses this file to you under the Apache License,
 ~ Version 2.0 (the "License"); you may not use this file except
 ~ in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~    http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing,
 ~ software distributed under the License is distributed on an
 ~ "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 ~ KIND, either express or implied.  See the License for the
 ~ specific language governing permissions and limitations
 ~ under the License.
 -->

<%@ page import="org.apache.axis2.context.ConfigurationContext" %>
<%@ page import="org.wso2.carbon.CarbonConstants" %>
<%@ page import="org.wso2.carbon.ui.CarbonUIUtil" %>
<%@ page import="org.wso2.carbon.utils.ServerConstants" %>
<%@ page import="org.wso2.carbon.ui.CarbonUIMessage" %>
<%@ page import="org.wso2.carbon.training.orderclient.ui" %>
<%@ page import="org.wso2.carbon.training.order.xsd.Order" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://wso2.org/projects/carbon/taglibs/carbontags.jar" prefix="carbon" %>
<%
        String serverURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
        ConfigurationContext configContext =
                (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
        String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);

        OrderManagerClient client;
        Order[] orders;

        try {
            client = new OrderManagerClient(configContext, serverURL, cookie);
            orders = client.getAllOrders();
        } catch (Exception e) {
            CarbonUIMessage.sendCarbonUIMessage(e.getMessage(), CarbonUIMessage.ERROR, request, e);
%>
            <script type="text/javascript">
                   // location.href = "../admin/error.jsp";
            </script>
<%
            return;
    }
%>

<%
           if(request.getMethod().equals("POST")) {

                if(request.getParameter("deleteBookIsbn") != "") {
                    client.deleteBook(request.getParameter("deleteBookIsbn"));
                 }

                if(request.getParameter("name") != "") {
                    Book book = new Book();
                    book.setName(request.getParameter("name"));
                    book.setAuthor(request.getParameter("author"));
                    book.setIsbnNumber(request.getParameter("isbn"));

                    client.addBook(book);
                }
               %>
              <script type="text/javascript">
                location.href="index.jsp";
              </script>
               <%


           }
%>



<div id="middle">
	<h2>Library Management</h2>

    <div id="workArea">
		<table class="styledLeft" id="moduleTable">
                <thead>
                <tr>
                    <th width="40%">Name</th>
                    <th width="40%">ISBN Number</th>
                    <th width="20%">Author</th>
                </tr>
                </thead>
                <tbody>
           <%
           		for(Order order:orders){
           %>
           		<tr>
                	<td><%=order.getOrderId()%></td>
                	<td></td>
                	<td></td>
                </tr>
           <%
           		}
           %>
                </tbody>
         </table>
    </div>


    <div id="libraryform">
        <form action="index.jsp" method="POST">
        <table class="styledLeft" id="formTable">
            <thead>
            <tr>
            <th>Enter New Book</th>
            </tr>
            </thead>
            <tr>
                <td>Book Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Author</td>
                <td><input type="text" name="author" /></td>
            </tr>
            <tr>
                <td>ISBN</td>
                <td><input type="text" name="isbn" /></td>
            </tr>
            <tr>
                <th>Delete Book</th>
            </tr>
            <tr>
                <td>Delete Book ISBN :</td>
                <td><input type="text" name="deleteBookIsbn" /></td>
            </tr>
        </table>


        <input type="submit" value="Submit" />
        </form>
    </div>

</div>