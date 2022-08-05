<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="header.jsp" %>
<div class="bannerwithoutimg">
	<div class="container">
       </div>
<style type="text/css">
   
   table td a
   {
       color:#000;
      
   }
   
   table {
  width: 100%;
}

th {
  height: 70px;
}
    
</style>
<body>
    <h1>Staff Record</h1>
    <table border="10">
        <tr><th>Staff Name</th>
        <th>Staff Id</th>
        <th>password</th>
        <th>category</th>
        <th>dateOfPost</th>
        <th>dateOfClosing</th>
        <th>Operation</th>
        </tr>
        <%
          String staffid = (String)session.getAttribute("sid");            
  Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbstaff","root","");
  Statement st = con.createStatement();
 ResultSet res = st.executeQuery("select * from s_register");
 while(res.next())
 { %>
        <tr><td><%= res.getString(1)  %></td>
            <td><%= res.getString(2)  %></td>
            <td><%= res.getString(3)  %></td>
            <td><%= res.getString(4)  %></td>
            <td><%= res.getString(5)  %></td>
            <td><%= res.getString(6)  %></td>
            </td>
        
            <td> <a href="adminedit.jsp?q=<%= res.getString(1)  %>">Edit</a>||<a href="admindelete.jsp?q=<%= res.getString(1)  %>">Delete</a></td>
        </tr>
 <%}%>
    </table>
    
 </div>

 <%@include  file="footer.jsp" %>

   	
