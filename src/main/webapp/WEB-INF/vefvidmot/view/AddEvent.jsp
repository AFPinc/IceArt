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

    Location: <c:choose>
    <c:when test="${not empty locations}">
        <select name="location">
            <c:forEach var="location" items="${locations}">
                <option value="${location.getId()}">${location.getName()}</option>
            </c:forEach>
        </select><br>
    </c:when>
    <c:otherwise>
        Engar staðsetningar hafa verið skráðar.<br>
    </c:otherwise>
</c:choose>

    Name of artist: <c:choose>
    <c:when test="${not empty artists}">
        <select name="artist">
            <c:forEach var="artist" items="${artists}">
                <option value="${artist.getId()}">${artist.getName()}</option>
            </c:forEach>
        </select><br>
    </c:when>
    <c:otherwise>
        Enginn listamaður hefur verið skráður.<br>
    </c:otherwise>
</c:choose>
    Time begin: <input type="text" name="timeBegin"\><br>
    Time end: <input type="text" name="timeEnd"\><br>
    Description: <textarea type="text" name="description"\></textarea><br>

    <input type="submit" value="Submit"/>
</form>

<form method="POST" action="/artist/artist">
    <input type="submit" value="Add Artist"/>
</form>

<form method="POST" action="/location/location">
    <input type="submit" value="Add Location"/>
</form>

</body>

</html>