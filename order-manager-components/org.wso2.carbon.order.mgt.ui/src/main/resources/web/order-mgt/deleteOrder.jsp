<%
    if(request.getMethod().equals("POST")) {
        if(request.getParameter("delete") != null) {
            client.deleteOrder(request.getParameter("delete"));
%>
            <script type="text/javascript">
            location.href="index.jsp";
            <%--alert("clicked delete<%= request.getParameter("delete") %>");--%>
            </script>

<%
        }
    }
%>