<%
    
session.removeAttribute("uid");
session.invalidate();
 response.sendRedirect("../adminlogin.jsp");





%>