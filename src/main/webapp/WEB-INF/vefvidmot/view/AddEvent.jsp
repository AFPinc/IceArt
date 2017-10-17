<!DOCTYPE html>

<!--
Höfundar

Ása Júlía Aðalsteinsdóttir - aja11@hi.is
Melkorka Mjöll Jóhannesdóttir - mmj8@hi.is
Sigurlaug Þórðardóttir - sth301@hi.is
Valgerður Sigfinnsdóttir - vas30@hi.is

Pakkinn view geymir allar .jsp skrár sem segja til um hvað er á vefnum.
Þessi klasi geymir uppbyggingu notendaviðmóts á viðburðum
-->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="is">

<head>
    <meta charset="UTF-8">
    <title>Add Event</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/addevent.css"/>"/>
</head>

<body>

<div class="navbar">
    <a href="/">Home</a>
    <a href="/event/add">Add Event</a>
    <a href="/location/add">Add Location</a>
    <a href="/artist/add">Add Artist</a>
</div>

<div class="addEventDiv">
    <h1>Add a new event</h1>

    <form action="/event/add" method="POST">
        Title: <input type="text" name="title"\><br>

        Location:
        <c:choose>
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

        Name of artist:
        <c:choose>
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

        Date begin: <input type="date" name="dateBegin"\><br>
        Time begin: <input type="time" name="timeBegin"\><br>
        Date end: <input type="date" name="dateEnd"\><br>
        Time end: <input type="time" name="timeEnd"\><br>

        Category:
        <c:choose>
            <c:when test="${not empty categories}">
                <select name="category">
                    <c:forEach var="category" items="${categories}">
                        <option value="${category.getId()}">${category.getTitle()}</option>
                    </c:forEach>
                </select><br>
            </c:when>
            <c:otherwise>
                Enginn flokkur hefur verið skráður.<br>
            </c:otherwise>
        </c:choose>

        Description: <textarea type="text" name="description"\></textarea><br>

        <input type="submit" value="Submit"/>
    </form>
</div>

<form method="POST" action="/">
    <input type="submit" value="Back to home"/>

</form>

</body>

</html>