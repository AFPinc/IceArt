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
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/main.css"/>"/>
</head>

<body>

<div class="navbar">
    <a href="/">Forsíða</a>
    <a href="/event/add">Skrá viðburð</a>
    <a href="/location/add">Skrá staðsetningu</a>
    <a href="/artist/add">Skrá listamann</a>
</div>

<div class="addDiv">
    <h1>Upplýsingar</h1>
    <p><strong>Nafn: </strong>${event.getTitle()}</p>
    <p><strong>Staðsetning: </strong>${event.getLocation()}</p>
    <p><strong>Frá: </strong>${event.getDateBegin()} - ${event.getTimeBegin()}</p>
    <p><strong>Til: </strong>${event.getDateEnd()} - ${event.getTimeEnd()}</p>
    <p><strong>Listamaður: </strong>${event.getArtist()}</p>
    <p><strong>Tegund: </strong>${event.getCategory()}</p>
    <p><strong>Stutt lýsing: </strong>${event.getDescription()}</p>

    <form method="GET" action="../artist/${event.getArtistId()}">
        <button type="submit" class="btn btn-default">
            Nánar um listamann
        </button>
    </form>
    <form method="GET" action="../location/${event.getLocationId()}">
        <button type="submit" class="btn btn-default">
            Nánar um staðsetningu
        </button>
    </form>

</div>

</body>

</html>