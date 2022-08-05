<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="hr.hr_login.*" %>
<%@include file="header.jsp" %>

<div class="banner_1">
	<div class="container">
		<div id="search_wrapper1">
		   <div id="search_form" class="clearfix">
		    <h1>Start your job search</h1>
		    <p>
			 <input type="text" class="text" placeholder=" " value="Enter Keyword(s)" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Keyword(s)';}">
			 <input type="text" class="text" placeholder=" " value="Location" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Location';}">
			 <label class="btn2 btn-2 btn2-1b"><input type="submit" value="Find Jobs"></label>
			</p>
           </div>
		</div>
   </div> 
</div>	
<div class="container">
    <div class="single">  
	   <div class="col-md-4">
	   	  <div class="col_3">
	   	  	<h3>Todays Jobs</h3>
<table border="5" style="margin: 00px">
       <th>Profile</th>    
            <%
            
  Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seeking1","root","");
  Statement st = con.createStatement();
 ResultSet res = st.executeQuery("select * from tbl_job");
 while(res.next())
 { %>
        <tr>
            <td><a href="#"><%= res.getString(3)  %></a></td>
            
        
        </tr>
        
 <%}%>
    </table>
	   	  </div>
	   	 
    	</div>
	 </div>
	 <div class="col-md-8 single_right">
	 	   <div class="login-form-section">
                <div class="login-content">
                   <form action="hr_login" method="post">
                        <div class="section-title">
                            <h3>LogIn to HR Account</h3>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon "><i class="fa fa-user"></i></span>
                                <input type="text" name="txtuser" required="required" class="form-control" placeholder="Username">
                            </div>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon "><i class="fa fa-key"></i></span>
                                <input type="password" name="txtpass" required="required" class="form-control " placeholder="Password">
                            </div>
                        </div>
                     
                     		<div class="login-btn">
					   <input type="submit" value="Log in">
					</div>
					
		           </div>
                       </form>

<%
                         if(request.getParameter("e")!=null)
                         {
                             out.println(request.getParameter("e"));
                         }
                    %>
                </div>
         </div>
   </div>
  <div class="clearfix"> </div>
 </div>
</div>
<%@include file="footer.jsp" %>