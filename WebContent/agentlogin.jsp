<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>agentlogion</title>
</head>
<body bgcolor="skyblue">
<form action="HomeServlet" method="post">
  <div class="adminlogin">
  <center>
    <img src="image/agent1login.jpg" alt="Avatar" class="avatar">
    <h4>Agent Login</h4>
    </center>
  </div>

  <div class="adminlogin">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="AgName" required><br>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="AgPassword" required><br>

    <button type="submit" name="submit" value="AgentLogin">Login</button><br>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="adminlogin" style="background-color:#f1f1f1">
  </div>
</form>
</body>
</html>