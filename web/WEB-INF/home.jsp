<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body style="background-color: #121212; color: limegreen">
        <div style="text-align: left; margin-top: 10rem; margin-left: 40%; font-size: 1vw">
        <h2>Home Page</h2>
        
        <b>Hello ${user["username"]}.<b> <br>
        <a href="login?logout" name="logout">Log out</a>
        </div>
    </body>
</html>
