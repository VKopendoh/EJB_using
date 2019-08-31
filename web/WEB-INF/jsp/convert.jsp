<%--
  Created by IntelliJ IDEA.
  User: vkopendoh
  Date: 31.08.2019
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/style.css">

    <title>Currency Converter</title>
</head>
<body>

<section>
    <form method="post" action="converter" enctype="application/x-www-form-urlencoded">
        <h3>Enter currency to convert:</h3>
        <dl>
            <dt>Dollars:</dt>
            <dd><input type="number" step="0.01" name="dollarsAmount" size=20 value="0"></dd>
        </dl>
        <dl>
            <dt>Yens:</dt>
            <dd><input type="number" step="0.01" name="yensAmount" size=20 value="0"></dd>
        </dl>
        <button type="submit">Convert</button>
        <button onclick="window.history.back()">Cancel</button>
    </form>
    <hr>
    <h3>Yens from dollars: </h3>
    <p>${yens}</p>
    <h3>Euros from yens: </h3>
    <p>${euros}</p>
</section>

</body>
</html>
