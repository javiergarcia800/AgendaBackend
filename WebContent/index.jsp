<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda BackEnd</title>
</head>
<body style="text-align: center;">
	<h2>Agenda BackEnd</h2>
	
	<form action="/AgendaBackend/rest/user/validate" method="post">
	   <textarea rows="10" cols="80">
{
  username:"testuser", 
  password:"testpassword"
}</textarea>
	   
	   <br>
	   
	   <input type="submit" value="Send">
	   
	</form>
	
</body>
</html>
