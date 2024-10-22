<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <%@include file="allFiles/allCss.jsp"%>

    </head>
    <body style="background-color: none;">
        <%@include file="allFiles/navbar.jsp"%>

        <div class="container">
            <div class="row">

                <div class="col-md-6 offset-md-3 p-5">

                    <div class="card">
                        <div class="body">
                            <form action="RegisterServlet" method="POST">

                                <h4 class="p-3 mb-2 bg-info text-white text-center">Registration Page</h4>

                                <%
                                    String successMsg = (String) session.getAttribute("successMsg");
                                    String errorMsg = (String) session.getAttribute("errorMsg");
                                    if (successMsg != null) {
                                %>
                                <p class="text-success text-center alert alert-success"><%= successMsg%></p>
                                <%
                                    session.removeAttribute("successMsg");
                                    }

                                 if (errorMsg != null) {%>
                                 <p class="text-danger text-center alert alert-danger"><%= errorMsg %></p>
                                <%
                                    session.removeAttribute("errorMsg");
                                    }
                                
                                %>



                                <div class="form-group p-2">
                                    <label for="exampleInputEmail1">Enter name</label>
                                    <input type="text" name="name" class="form-control" id="exampleInputEmail1"
                                           aria-describedby="emailHelp" placeholder="Enter name" >


                                </div>




                                <div class="form-group p-2">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" name="email" class="form-control" id="exampleInputEmail1"
                                           aria-describedby="emailHelp" placeholder="Enter email">
                                </div>




                                <div class="form-group p-2">
                                    <label for="exampleInputPassword1">Password</label> <input
                                        type="password" name="password" class="form-control" id="exampleInputPassword1"
                                        placeholder="Password">
                                </div>
                                 <div class="form-group p-2">
                                    <label for="exampleInputPassword1">Phone No</label> <input
                                        type="password" name="password" class="form-control" id="exampleInputPassword1"
                                        placeholder="Phone No">
                                </div>
                                <div class="form-group p-2">
                                    <label for="exampleInputPassword1">Address</label> <input
                                        type="text" name="password" class="form-control" id="exampleInputPassword1"
                                        placeholder="Address">
                                </div>

                                <div class="text-center pb-3">

                                    <button type="submit" class="btn btn-primary">Register</button>
                                </div>						


                            </form>

                        </div>

                    </div>


                </div>


            </div>

        </div>
        <%@include file="allFiles/footer.jsp"%>



    </body>
</html>