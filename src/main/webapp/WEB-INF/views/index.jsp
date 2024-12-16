<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Email</h1>
<br/>
<p>${message}</p>
<form action="validate" method="post">
input email: <input type="text" name="email" />
<input type="submit" value="validate">
</form>
</body>
</html>
