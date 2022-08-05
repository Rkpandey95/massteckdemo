

<%@include file="header.jsp" %>
<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
  <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

   <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
  
  <script>
$(function() {
    $( "#dateOfclosing" ).datepicker();
    $( "#dateOfposting" ).datepicker();
});

function validate(){
    var regName = /^[a-zA-Z]/;
    var regPass = /^[a-zA-Z0-9!@#$%^&*]{6,16}$/;
    var name = document.getElementById('staffname').value;
    var namePass = document.getElementById('staffpass').value;
    if(!regName.test(name)){
        alert('Please enter correct name.');
        document.getElementById('staffname').focus();
        return false;
    }
   else if(!regPass.test(namePass))
    {
        alert('Please enter password name.');
        document.getElementById('staffname').focus();
        return false;
    }
    
    
}
</script>
<div class="banner">
    
	<div class="container">
            <form action="RegisterServlet" method="post">
            <table style="height: 250px;">
            <tr><td>Staff Name</td><td><input type="text" name="staffname" id="staffname" required></td></tr>
            <tr><td>Staff Id</td><td><input type="text" name="staffid" id="staffid" required></td></tr>
            <tr><td>Password</td><td><input type="password" name="staffpass" id="staffpass" required></td></tr>
            <tr><td>Category of the sales Item</td>
                <td> <select name="citem" required>
                        <option>Item1</option>
                        <option>Item2</option>
                        <option>Item3</option>
                        <option>Item4</option>
                    </select></td>
            <tr><td>Date of post Creation</td>
                <td><input type="datetime" id="dateOfposting" name="dateofpost" required=""></td></tr>
            <tr><td>Date of Closing</td>
                <td><input type="datetime" id="dateOfclosing" name="dateofclosing" required></td></tr>
        
            </tr>
                <tr><td colspan="2" align="right"><input type="submit" onclick="validate();" value="ADD" name="btnsubmit" id="btnsubmit" /></td></tr>
            </table>
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