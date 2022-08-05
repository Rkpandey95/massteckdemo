<%@page import="staff.PostJobDAO"%>
<%@page import="staff.PostJobBean"%>
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
    List<PostJobBean> list = PostJobDAO.getRecords(pageid, total);

    out.print("<h1>Page No: " + spageid + "</h1>");
    out.print("<table border='1' cellpadding='4' width='60%'>");
    out.print("<tr><th>EmailId</th><th>Mobileno</th><th>Location</th><th>Category</th><th>Description</th>");
    for (PostJobBean pb : list) {
        out.print("<tr><td>"+pb.getEmailid()+"</td><td>"+pb.getMobileno() +"</td><td>"+pb.getLocation()+"</td><td>"+pb.getCategory()+"</td><td>"+pb.getDescription()+"</td></tr> ");
        
}  
out.print("</table>");
%>  
<a href="paginationPage.jsp?page=1">1</a>  
<a href="paginationPage.jsp?page=2">2</a>  
<a href="paginationPage.jsp?page=3">3</a>
<a href="paginationPage.jsp?page=4">4</a>  
<a href="paginationPage.jsp?page=5">5</a>  
<a href="paginationPage.jsp?page=6">6</a> 