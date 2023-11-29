<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String id = request.getParameter("id");
	String fName = request.getParameter("fName");
	String lName = request.getParameter("lName");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
%>

<form  class="formp" action="delete" method="POST" >
 <fieldset>
  <legend>User Profile Delete</legend><br>
  <label for="namel">User ID</label><br><br>
  <input type="text"  name="id"  value = "<%= id %>" readonly><br><br><br>
  <label for="namel">First Name</label><br><br>
  <input type="text"  name="name1"  value = "<%= fName %>" readonly><br><br><br>
  <label for="namen">Last Name</label><br><br>
  <input type="text"  name="name2" value = "<%= lName %>" readonly><br><br><br>
  <label for="email">Email</label><br><br>
  <input type="email"  name="mail" value = "<%= email %>" readonly><br><br><br>
  <label for="phoneno">Phone</label><br><br>
  <input type="phone" name="cmobile" pattern="[0-9]{10}" value = "<%= phone %>" readonly><br><br><br>
  <label for="name">UserName</label><br><br>
  <input type="text"  name="nameid1"  value = "<%= username %>" readonly><br><br><br>
  
  <br/><button name="submit" type="submit"  class="loginbtn">Delete My Account</button>
 </fieldset>
</form>

</body>
</html>