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
    <a href="/">Home</a>
    <div class="dropdown">
        <div class="dropdown-content">
            <a href="/event/add">Add Event</a>
            <a href="/location/add">Add Location</a>
            <a href="/artist/add">Add Artist</a>
        </div>
    </div>
</div>

<div class="addDiv">
    <h1>Upplýsingar um Event</h1>
    <hr />
    <dl class="dl-horizontal">
        <dt>
            Title:
        </dt>

        <dd>
            ${event.getTitle()}
        </dd>

        <dt>
            Location:
        </dt>

        <dd>
            ${event.getLocation()}
        </dd>

        <dt>
            From:
        </dt>

        <dd>
            ${event.getDateBegin()}
        </dd>

        <dt>
            To:
        </dt>

        <dd>
            ${event.getDateEnd()}
        </dd>
        <dt>
        <a href="../artist/${event.getArtistId()}">Artist:</a>
        </dt>

        <dd>
            ${event.getArtist()}
        </dd>
        <dt>
            <a href="../location/${event.getLocationId()}">Category:</a>
        </dt>

        <dd>
            ${event.getCategory()}
        </dd>
        <dt>
            Description:
        </dt>

        <dd>
            ${event.getDescription()}
        </dd>
    </dl>

    <!--  <form method="GET" action="../artist/${event.getArtistId()}">
        <button type="submit" class="btn btn-default">
            Nánar um listamann
        </button>
    </form>
    <form method="GET" action="../location/${event.getLocationId()}">
        <button type="submit" class="btn btn-default">
            Nánar um staðsetningu
        </button>
    </form> -->

</div>

</body>

</html>