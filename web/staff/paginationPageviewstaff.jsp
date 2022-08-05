<%@page import="admin.AddStaffJobDAO"%>
<%@page import="admin.AddStaff"%>
<%@ page import="java.util.*"%>  
 <%@ include file="header.jsp" %>  <br>
<%
    String spageid = request.getParameter("page");
    int pageid = Integer.parseInt(spageid);
    int total = 3;
    if (pageid == 1) {
    } else {
        pageid = pageid - 1;
        pageid = pageid * total + 1;
    }
    List<AddStaff> list = AddStaffJobDAO.getRecords(pageid, total);

    out.print("<h1>Page No: " + spageid + "</h1>");
    out.print("<table border='1' cellpadding='4' width='60%'>");
    out.print("<tr><th>EmailId</th><th>Mobileno</th><th>Location</th><th>Category</th><th>Description</th>");
    for (AddStaff as : list) {
        out.print("<tr><td>"+as.getStaffname()+"</td><td>"+as.getStaffid() +"</td><td>"+as.getStaffpass()+"</td><td>"+as.getCitem()+"</td><td>"+as.getDateofpost()+"</td><td>"+as.getDateofclosing()+"</td></tr> ");
        
}  
out.print("</table>");
%>  
<a href="paginationPageviewstaff.jsp?page=1">1</a>  
<a href="paginationPageviewstaff.jsp?page=2">2</a>  
<a href="paginationPageviewstaff.jsp?page=3">3</a>
<a href="paginationPageviewstaff.jsp?page=4">4</a>  
<a href="paginationPageviewstaff.jsp?page=5">5</a>  
<a href="paginationPageviewstaff.jsp?page=6">6</a> 