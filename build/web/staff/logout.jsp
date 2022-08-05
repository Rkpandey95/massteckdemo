<%
    
session.removeAttribute("uid");
session.invalidate();
 response.sendRedirect("../stafflogin.jsp");





%>