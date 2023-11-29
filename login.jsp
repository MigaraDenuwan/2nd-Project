<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flick-Flow</title>
</head>
<body>
<form  class="forml" action="log" method="POST" >
 <fieldset>
  <legend>User Profile</legend><br>
  <label for="name">UserName</label><br><br>
  <input type="text"  name="nameid" placeholder="Enter Username"  required><br><br><br>
  <label for="pwd">Password</label><br><br>
  <input type="password"  name="pass" placeholder="Enter Password"  required><br><br><br>
  <br/><button name="submit" type="submit"  class="loginbtn">Login</button>
 </fieldset>
</form>
</body>
</html>