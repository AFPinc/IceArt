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
    <title>Listamaður - IceArt</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/main.css"/>"/
    <link rel="shortcut icon" type="image/x-icon" href="../resources/picture/icon.png" sizes="16x16">
</head>

<body>

<div class="navbar">
    <a href="/">Forsíða</a>

    <c:if test="${currentUser != null}"><a href="/event/add">Skrá viðburð</a></c:if>

    <c:if test="${currentUser != null}"><a href="/location/add">Skrá staðsetningu</a></c:if>

    <c:if test="${currentUser != null}"><a href="/artist/add">Skrá listamann</a></c:if>

    <c:choose>
        <c:when test="${currentUser == null}"><a href="/user/login">Innskrá</a></c:when>
        <c:otherwise><a href="/user/logout">Útskrá</a></c:otherwise>
    </c:choose>
</div>

<div class="addDiv">
    <h1>Upplýsingar um listamann</h1>
    <hr />
    <dl class="dl-horizontal">
        <dt>
            Nafn:
        </dt>

        <dd>
            ${artist.getName()}
        </dd>

        <dt>
            Aldur:
        </dt>

        <dd>
            ${artist.getAge()}
        </dd>

        <dt>
            Land:
        </dt>

        <dd>
            ${artist.getCountry()}
        </dd>

        <dt>
            Stutt lýsing:
        </dt>

        <dd>
            ${artist.getDescription()}
        </dd>
    </dl>
    </div>
</body>

</html>