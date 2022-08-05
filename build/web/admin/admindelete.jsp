<%-- 
    Document   : edit
    Created on : Jan 18, 2017, 10:57:58 AM
    Author     : hp
--%>
<%@page import="java.sql.*" %>
<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 Class.forName("com.mysql.jdbc.Driver");
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbstaff","root","");
 Statement st = con.createStatement();
 ResultSet res = st.executeQuery("select * from s_register where staff_id='"+ request .getParameter("q") +"'");
 if(res.next())
 {  %>
    
 <form action="../admindeletestaff" method="post">
     <input type="text" name="staffname" value="<%=  res.getString(1)      %>" />
     <br>
     <br>
     <input type="text" name="staffid" value="<%=  res.getString(2)      %>" />
     <br>
     <br>
     <input type="text" name="staffpass" value="<%=  res.getString(3)      %>" />
     <br>
     <br>
     <input type="text" name="citem" value="<%=  res.getString(4)      %>" />
     <br>
     <br>
     <input type="text" name="dateofpost" value="<%=  res.getString(5)      %>" />
     <br>
     <br>
     <input type="text" name="dateofclosing" value="<%=  res.getString(6)      %>" />
     <br>
     <br>
          
     <input type="submit" name="btnsubmit" value="Click" />
 </form>
<% } %>

 <%@include  file="footer.jsp" %>
</form>