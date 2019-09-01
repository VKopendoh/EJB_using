<%--
  Created by IntelliJ IDEA.
  User: vkopendoh
  Date: 31.08.2019
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/style.css">

    <title>Shopping cart</title>
</head>
<body>
<h2>Shopping cart</h2>
<section>
    <form method="post" action="cart" enctype="application/x-www-form-urlencoded">
        <h3>Enter book title to add to shopping cart: </h3>
        <dl>
            <dt>Book title:</dt>
            <dd><input type="text" name="title" size=50 value="New Book"></dd>
        </dl>
        <button type="submit">Add</button>
    </form>
    <hr>
    <table border="1" cellpadding="8" cellspacing="0">
        <h3>${personName}  your ID is ${customerId}</h3>
        <tr>
            <th>Title</th>
            <th></th>
            <th></th>
        </tr>
        <c:forEach items="${booksInCart}" var="book">
            <tr>
                <td><a href="cart?title=${book}&action=view">${book}</a></td>
                <td><a href="cart?title=${book}&action=delete">Delete</a></td>
            </tr>
        </c:forEach>
    </table>

</section>

</body>
</html>