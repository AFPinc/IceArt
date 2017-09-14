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

<form action="/addArtist.jsp" method="get">
    Name: <input type="text" name="aName"><br>
    Age: <input type="text" name="aAge"><br>
    Country: <input type="text" name="aCountry"><br>
    Description: <textarea type="text" name="aDescription"></textarea><br>
    <input type="submit" value="Submit">
</form>

</body>

</html>