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
    <title>Event</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/mainpage.css"/>"/>
</head>
<body>

<div class="navbar">
    <a href="/">Home</a>
    <a href="/event/add">Add Event</a>
    <a href="/location/add">Add Location</a>
    <a href="/artist/add">Add Artist</a>
</div>

<c:choose>
    <c:when test="${not empty events}">
        <c:forEach var ="event" items="${events}">
            <div class="container well">
                <h3>${event.getTitle()}</h3><br>
                <p>${event.getArtist()} - ${event.getLocation()}</p><br>
                <p>${event.getDateBegin()} - ${event.getTimeBegin()}</p>
                <form method="GET" action="../event/${event.getId()}">
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