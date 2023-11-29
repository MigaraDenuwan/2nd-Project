<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  class="formp" action="insert" method="POST" >
 <fieldset>
  <legend>User Profile</legend><br>
  <label for="namel">First Name</label><br><br>
  <input type="text"  name="name1" placeholder="Enter First Name"  required><br><br><br>
  <label for="namen">Last Name</label><br><br>
  <input type="text"  name="name2" placeholder="Enter Last Name"  required><br><br><br>
  <label for="email">Email</label><br><br>
  <input type="email"  name="mail" placeholder="Enter E-mail"  required><br><br><br>
  <label for="phoneno">Phone</label><br><br>
  <input type="phone" name="cmobile" placeholder="+94xxxxxxxxxx" pattern="[0-9]{10}" required><br><br><br>
  <label for="name">UserName</label><br><br>
  <input type="text"  name="nameid1" placeholder="Enter Username"  required><br><br><br>
  <label for="pwd">Password</label><br><br>
  <input type="password"  name="passw" placeholder="Enter Password"  required><br><br><br>
  <br/><button name="submit" type="submit"  class="loginbtn">Submit</button><br>
 </fieldset>
</form>
</body>
</html>