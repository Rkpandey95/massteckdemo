<%-- 
    Document   : postjob
    Created on : May 24, 2022, 4:05:57 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      <!--  <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">-->

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
	
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
	integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<%@include file="header.jsp" %>
    </head>
    <body>
        
        <div class="container p-2">
		<div class="col-md-10 offset-md-1" style="margin: 15px">
			<div class="card">
				<div class="card-body">
					<div class="text-center text-success">
					<i class="fas fa-user-friends fa-3x" ></i>
					
					<c:if test="${not empty succMsg }">
					<div class="alert alert-seccess" role="alert">${ succMsg}</div>
					<c:remove var="succMsg"/>
					</c:if>
					<h5>Add Jobs</h5>
					</div>
					
					<form action="postjobServlet" method="post">
					
					<div class="form-group">
					<label>Enter Email</label>
                                        <input type="text" class="form-control" name="emailid" required="">
					</div>
                                        <div class="form-group">
					<label>Enter Mobile</label>
                                        <input type="text" class="form-control" name="mobileno" required="">
					</div>
                                            
					
					<div class="form-row">
					<div class="form-group col-md-4">
					<label >Location</label>
					<select name="location" class="custom-select" id="inlineFormCustomSelectPref">
					<option selected="selected">Choose...</option>
					<option value="Odisha">Odisha</option>
					<option value="Mumbai">Mumbai</option>
					<option value="Gujrat">Gujrat</option>
					<option value="Jharkhand">Jharkhand</option>
					<option value="Delhi">Delhi</option>
					<option value="Bangalore">Bangalore</option>
					<option value="Chennai">Chennai</option>
					<option value="Hyderabad">Hyderabad</option>
					</select>
					</div>
					
					<div class="form-group col-md-4">
					<label >Category</label>
					<select name="category" class="custom-select" id="inlineFormCustomSelectPref">
					<option selected="selected">Choose...</option>
					<option value="IT">IT</option>
					<option value="Developer">Developer</option>
					<option value="Banking">Banking</option>
					<option value="Engineer">Engineer</option>
					<option value="Teacher">Teacher</option>
					</select>
					</div>
					
                                            
					<!--<div class="form-group col-md-4">
					<label >Status</label>
					<select name="status" class="form-control" >
					<option class="Active" value="Active">Active</option>
					<option class="Inactive" value="Inactive">Inactive</option>
					</select>
					</div> -->
					</div>
                                            
                                        <!--<div>
                                        <label>Upload Resume</label>
                                        <input type="file" name="file" />
                                        </div> --> 
                                         <br><br>   
					<div class="form-group">
					<label >Enter Description</label>
                                        <textarea rows="6" cols="" name="desc" class="form-control" required=""></textarea>
					</div>
						
				<!--<button class="btn btn-success">Publish Job</button>-->
                                <input type="submit" value="Publish Job" name="btnsubmit" />
					
					</form>
                                        <%
                  if(request.getParameter("m")!=null)   
                  {
                      out.print(request.getParameter("m"));
                  }
                  %>
				</div>
			</div>
		</div>
</div>
<%@include file="footer.jsp" %>
    </body>
</html>
