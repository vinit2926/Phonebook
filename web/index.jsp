<%@page import="java.sql.Connection"%>
<%@page import="com.connection.DbConnect"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PhonebookProject</title>
<%@include file="allFiles/allCss.jsp"%>

<style>
.back-img
{

 background: url("img/black.png");
 width: 100%;
 height: 80vh;
 background-repeat: no-repeat;
 background-size: cover;

}
</style>

</head>
<body style="background: url(img/black.png); background-size: cover;background-attachment: fixed;">

<%@include file="allFiles/navbar.jsp"%>

<div class="back-img text-center text-white mt-5">

<h1>Welcome to Phonebook App</h1>

</div>

<%@include file="allFiles/footer.jsp" %>

</body>
</html>