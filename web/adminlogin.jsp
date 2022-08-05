
<%@include file="header.jsp" %>
 
<div class="banner_1">
     
	<div class="container">
        
   </div> 
</div>	
<div class="container">
	 <div class="col-md-8 single_right">
	 	   <div class="login-form-section">
                <div class="login-content">
                    <form action="adminlogin" method="post">
                        <div class="section-title">
                            <h3>LogIn to Admin</h3>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon "><i class="fa fa-user"></i></span>
                                <input type="text" name="txtuserid" class="form-control" placeholder="Username" required="">
                            </div>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon "><i class="fa fa-key"></i></span>
                                <input type="password" name="txtpass" class="form-control " placeholder="Password" required="">
                            </div>
                        </div>
                     
                     
                   
					<div class="login-btn">
                                               
					   <input type="submit" value="Log in">
                                        
					</div>
                    </form>
		           </div>
                </div>
         
                </div>
    
             <%
                         if(request.getParameter("c")!=null)
                         {
                             out.println(request.getParameter("c"));
                         }
                    %>

         </div>
   </div>
    
  <div class="clearfix"> </div>
    <%@include file="footer.jsp" %>