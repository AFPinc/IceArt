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
    <title>Artist</title>
</head>
<body>

<h1>Add a new artist</h1>

<form action="/artist/add" method="POST">
    Name: <input type="text" name="name"><br>
    Age: <input type="text" name="age"><br>
    Country: <input type="text" name="country"><br>
    Description: <textarea type="text" name="description"></textarea><br>

    <input type="submit" class="newwhitebtn" value="Add"/>
</form>

<form method="POST" action="/event/event">
    <input type="submit" value="Add Event"/>
</form>

<form method="POST" action="/">
    <input type="submit" value="Back to home"/>
</form>

</body>

</html>