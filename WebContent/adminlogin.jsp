<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adminlogin</title>
</head>
<body bgcolor="skyblue">
<form action="HomeServlet" method="post">
  <div class="adminlogin">
  <center>
    <img src="image/admin.jpg" alt="Avatar" class="avatar">
    <h4>Admin Login</h4>
    </center>
  </div>

  <div class="adminlogin">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="AdName" required><br>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="AdPassword" required><br>

    <button type="submit" name="submit" value="AdminLogin">AdminLogin</button><br>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="adminlogin" style="background-color:#f1f1f1">
  </div>
</form>
</body>
</html>