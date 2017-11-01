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
    <a href="/user/loginPage">Innskrá</a>
</div>

<div class="addDiv">
    <h1>Upplýsingar um viðburð</h1>
    <hr />
    <dl class="dl-horizontal">
        <dt>
            Title:
        </dt>

        <dd>
            ${event.getTitle()}
        </dd>

        <dt>
            <a class="a-info" href="../location/${event.getLocationId()}">Location:</a>
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
        <a class="a-info" href="../artist/${event.getArtistId()}">Artist:</a>
        </dt>

        <dd>
            ${event.getArtist()}
        </dd>
        <dt>
            Category:
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

</div>

</body>

</html>