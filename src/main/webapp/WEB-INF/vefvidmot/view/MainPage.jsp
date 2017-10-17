<!DOCTYPE html>

<!--
Höfundar

Ása Júlía Aðalsteinsdóttir - aja11@hi.is
Melkorka Mjöll Jóhannesdóttir - mmj8@hi.is
Sigurlaug Þórðardóttir - sth301@hi.is
Valgerður Sigfinnsdóttir - vas30@hi.is

Pakkinn view geymir allar .jsp skrár sem segja til um hvað er á vefnum.
Þessi klasi geymir uppbyggingu notendaviðmóts á forsíðu
-->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="is">

<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/mainpage.css"/>"/>
</head>

<body>

<div class="navbar">
    <a href="/">Home</a>
    <div class="dropdown">
        <div class="dropdown-content">
            <a href="/event/add">Add Event</a>
            <a href="/location/add">Add Location</a>
            <a href="/artist/add">Add Artist</a>
        </div>
    </div>
</div>

<div class="container">
<h1>Welcome to IceArt</h1>
</div>


<div class="container well">
    <h2>Leit</h2>
    <form method="GET" action="/search/search" class="form-inline">

<form method="GET" action="/search/" class="form-inline">

    <input type="text" name="title" class="form-control" placeholder="Leita" \>

    Date begin: <input type="date" name="dateBegin"\><br>
    Time begin: <input type="time" name="timeBegin"\><br>
    Date end: <input type="date" name="dateEnd"\><br>
    Time end: <input type="time" name="timeEnd"\><br>

    Choose Category:
        <c:choose>
        <c:when test="${not empty categories}">
        <select name="category">
            <c:forEach var="category" items="${categories}">
                <option value="${category.getId()}">${category.getTitle()}</option>
            </c:forEach>
        </select>
        </c:when>
        <c:otherwise>
        Enginn flokkur hefur verið skráður.<br>
        </c:otherwise>
        </c:choose>

    <button type="submit" value="Search" class="btn btn-default">
        <span class="glyphicon glyphicon-search"></span>
    </button>
    </form><br>
</div>


<c:choose>
    <c:when test="${not empty events}">
        <c:forEach var ="event" items="${events}">
            <div class="container well">
                <h2>Viðburðir</h2>
                <h3>${event.getTitle()}</h3><br>
                <p>${event.getArtist()} - ${event.getLocation()}</p><br>
                <p>${event.getDateBegin()} - ${event.getTimeBegin()}</p>
                <form method="GET" action="event/${event.getId()}">
                    <button type="submit" class="btn btn-default">
                        Nánar
                    </button>
                </form>
            </div>
            <br>
        </c:forEach>
    </c:when>
    <c:otherwise>
        <h3> No events</h3>
    </c:otherwise>
</c:choose>

</body>

</html>