<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
    <form action="addAlien" method="post">
        Enter your id: <input type="text" name="alien_id"><br>
        Enter your name: <input type="text" name="alien_name"><br>
        <input type="submit">
    </form>
    <hr>
    <form action="getAliens" method="get">
        Get all Aliens
    	<input type="submit">
    </form>
    <hr>
    <form action="getAlien" method="get">
     	Enter your id : <input type="text" name="alien_id"><br>
     	<input type="submit">
  	</form>
</body>
</html>
