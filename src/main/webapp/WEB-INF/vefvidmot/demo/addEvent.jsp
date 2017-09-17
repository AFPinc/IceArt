<!DOCTYPE html>

<!--
    Pakkinn vefvidmot geymir allar .jsp skrár sem segja til um hvað er á vefnum.

    Höfundar

    Ása Júlía Aðalsteinsdóttir - aja11@hi.is

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

<form action="/addEvent" method="get">
    Title: <input type="text" name="eventTitle"\>
    Location: <input type="text" name="eventLocation"\>
    Name of artist: <input type="text" name="eventArtist"\>
    Description: <textarea type="text" name="eventDescription"\></textarea><br>
    Time begin: <input type="text" name="eventTimeBegin"\>
    Time end: <input type="text" name="eventTimeEnds"\>

    <input type="submit" value="Submit"/>
</form>

</body>

</html>