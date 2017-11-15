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
    <title>Bæta við listamanni - IceArt</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/main.css"/>"/>
</head>

<body>

<div class="navbar">
    <a href="/">Forsíða</a>

    <c:if test="${currentUser != null}"><a href="/event/add">Skrá viðburð</a></c:if>

    <c:if test="${currentUser != null}"><a href="/location/add">Skrá staðsetningu</a></c:if>

    <c:if test="${currentUser != null}"><a href="/artist/add">Skrá listamann</a></c:if>

    <c:choose>
        <c:when test="${currentUser == null}"><a href="/user/loginPage">Innskrá</a></c:when>
        <c:otherwise><a href="/user/logout">Útskrá</a></c:otherwise>
    </c:choose>
</div>

<div class="addDiv">
    <h1>Skrá nýjan listamann</h1>

    <form class="form-horizontal" action="/artist/artist" method="POST" id="addArtist" >
        <div class="form-group">
            <label for="name" class="col-sm-2 control-label">Nafn:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Nafn" id="name" name="name" pattern=".{1,50}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="age" class="col-sm-2 control-label">Aldur:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="35" id="age" name="age" pattern="\d{1,2}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="country" class="col-sm-2 control-label">Land:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Ísland" id="country" name="country" pattern=".{1,50}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="description" class="col-sm-2 control-label">Stutt lýsing:</label>
            <div class="col-sm-10">
                <textarea form="addArtist" class="form-control" placeholder="..." name="description" id="description" cols="35" wrap="soft"  pattern=".{1,100}" required></textarea>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Skrá</button>
            </div>
        </div>
    </form>
</div>

</body>

</html>