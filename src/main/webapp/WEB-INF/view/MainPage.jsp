<!DOCTYPE html>

<!--
    Pakkinn vefvidmot geymir allar .jsp skrár sem segja til um hvað er á vefnum.

    Höfundar

    Ása Júlía Aðalsteinsdóttir - aja11@hi.is
    Melkorka Mjöll Jóhannesdóttir - mmj8@hi.is
    Sigurlaug Þórðardóttir - sth301@hi.is
    Valgerður Sigfinnsdóttir - vas30@hi.is
-->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="is">

<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
</head>
<body>

<h1>Welcome to IceArt</h1>

<form method="POST" action="/Search">
    <input type="submit" value="Search"/>
</form>

<form method="POST" action="/AddEvent">
    <input type="submit" value="Add Event"/>
</form>

<form method="POST" action="/AddLocation">
    <input type="submit" value="Add Location"/>
</form>

<form method="POST" action="/AddArtist">
    <input type="submit" value="Add Location"/>
</form>

<form method="POST" action="/AccountController">
    <input type="submit" value="AccountController"/>
</form>


</body>

</html>