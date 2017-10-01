<!DOCTYPE html>

<!--
@author Ása Júlía Aðalsteinsdóttir
@date September 2017
Háskóli Íslands

Pakkinn view geymir allar .jsp skrár sem segja til um hvað er á vefnum.
Þessi klasi geymir uppbyggingu notendaviðmóts á viðburðum
-->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="is">

<head>
    <meta charset="UTF-8">
    <title>Add event</title>
</head>
<body>

<h1>Add a new event</h1>

<form action="/event/add" method="POST">
    Title: <input type="text" name="title"\><br>
    Location: <input type="text" name="location"\><br>
    Name of artist: <input type="text" name="artist"\><br>
    Time begin: <input type="text" name="timeBegin"\><br>
    Time end: <input type="text" name="timeEnd"\><br>
    Description: <textarea type="text" name="description"\></textarea><br>

    <input type="submit" value="Submit"/>
</form>

</body>

</html>