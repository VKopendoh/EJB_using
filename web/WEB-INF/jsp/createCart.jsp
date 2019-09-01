<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/style.css">

    <title>Create new Cart</title>
</head>
<body>
<section>
    <form method="post" action="newcart" enctype="application/x-www-form-urlencoded">
        <h3>Enter your name: </h3>
        <dl>
            <dt>Name:</dt>
            <dd><input type="text" name="name" size=50 value="New Person"></dd>
            <dt>Name:</dt>
            <dd><input type="text" name="id" size=36 value="0"></dd>
        </dl>
        <button type="submit">Create</button>
    </form>
    <hr>

</section>

</body>
</html>