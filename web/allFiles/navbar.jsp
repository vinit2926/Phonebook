<%@page import="com.entity.User"%>


<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <a class="navbar-brand" href="index.jsp"><i class="fa-solid fa-phone"></i> PhoneBook</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse"
            data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false"
            aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    
        <%

            User user = (User) session.getAttribute("user");

            if (user == null) {
        %>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <%
            
            %>
            <ul class="navbar-nav mr-auto">
     
        </ul>
            
        <form class="form-inline my-2 my-lg-0">

            <a class="btn btn-primary" href="login.jsp"><i class="fa-solid fa-user"></i>Login</a> <a
                class="btn btn-primary ml-2" href="register.jsp"><i class="fa-solid fa-address-card"></i> Register</a>

        </form>
        <%
        } 
        else
        {%>
                    
		<form class="form-inline my-2 my-lg-0">
                         <a class="btn btn-primary" href="addContact.jsp"><i class="fa-solid fa-user"></i>Add Contact</a> <a
                class="btn btn-primary ml-2" href="viewContact.jsp"><i class="fa-solid fa-address-card"></i>View Contact</a>

                   
                    <button class="btn btn-primary"><%= user.getName() %></button>
                    
                    <a  data-toggle="modal" data-target="#exampleModalCenter" class="btn btn-primary text-white">Logout</a>
		</form>
        <%}
        %>


    </div>
        
        <!--Logout popup-->
  
        
<!-- Modal -->
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
  
          
             <h5 class="modal-title pl-5 offset-md-2" id="exampleModalLongTitle">Do you want to Logout</h5>
             
             
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
 
        
      </div>
      <div class="modal-body text-center">
    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
    <a type="button" href="LogoutServlet"  class="btn btn-primary">Logout<a>
      </div>
      <div class="modal-footer">
       
      </div>
    </div>
  </div>
</div>
        <!--Logout popup-->
        
</nav>