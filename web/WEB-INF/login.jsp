<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In page</title>
    </head>
    <body style="background-color: #121212; color: aliceblue">
        <div style="text-align: left; margin-top: 10rem; margin-left: 40%; font-size: 1vw">
        <h2><b>Login</b></h2>
        <form action="login" method="post">
            Username: <input type="text" name="username" value="${userInput}"><br>
            Password: <input type="password" name="password" value="${passInput}"><br>
            <input type="submit" value="Log In">
        </form>
        ${message}

        </div>
    </body>
</html>
