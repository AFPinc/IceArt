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
</head>
<body>

<c:choose>
    <c:when test="${not empty events}">
        <table class="events">
            <thead>
            <tr>
                <th>Title</th>
                <th>Location</th>
                <th>From</th>
                <th>To</th>
                <th>Artist</th>
                <th>Description</th>
            </tr>
            </thead>
            <c:forEach var ="event" items="${events}">
                <tr>
                    <td>${event.getTitle()} </td>
                    <td>${event.getLocation()}</td>
                    <td>${event.getTimeBegin()} </td>
                    <td>${event.getTimeEnd()}</td>
                    <td>${event.getArtist()} </td>
                    <td>${event.getDescription()}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h3> No events</h3>
    </c:otherwise>
</c:choose>

<form method="POST" action="/event/event">
    <input type="submit" value="Add Event"/>
</form>

<form method="POST" action="/">
    <input type="submit" value="Back to home"/>
</form>


</body>

</html>