<%-- 
    Document   : header
    Created on : Mar 4, 2017, 3:33:20 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


            
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="../css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="../css/style.css" rel='stylesheet' type='text/css' />
<link href='//fonts.googleapis.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!----font-Awesome----->
<link href="../css/font-awesome.css" rel="stylesheet"> 
    </head>
    <body>
       <nav class="navbar navbar-default" role="navigation">
	<div class="container">
	    <div class="navbar-header">
	        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
	        </button>
                <a class="navbar-brand" href="index.jsp"><h1 style="color:white;">Staff Panel</h1></a>
	    </div>
	    <!--/.navbar-header-->
	    <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
	        <ul class="nav navbar-nav">
		       
		      
		        <li class="dropdown">
		            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Manage Staff<b class="caret"></b></a>
		             <ul class="dropdown-menu">
			            <li><a href="paginationPageviewstaff.jsp?page=1">View Staff Details</a></li>
			            
		             </ul>
		        </li>
                        <!--<li class="dropdown">
		            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Manage Dept Head<b class="caret"></b></a>
		             <ul class="dropdown-menu">
			            <li><a href="addheaddept.jsp">Add</a></li>
                                    <li><a href="viewheaddept.jsp">View</a></li>
			      </ul>
		        </li>-->
		       
		   <li><a href="staffpostjob.jsp">PostJob</a></li>
	              
                        <li><a href="logout.jsp">Logout</a></li>
	        </ul>
	    </div>
	    <div class="clearfix"> </div>
	  </div>
	    <!--/.navbar-collapse-->
	</nav>