<!DOCTYPE html>

<!--
    Pakkinn view geymir allar .jsp skrár sem segja til um hvað er á vefnum.
    Þessi klasi geymir uppbyggingu notendaviðmóts á forsíðu

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
    <title>IceArt</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/main.css"/>" as=""/>
    <link rel="shortcut icon" type="image/x-icon" href="../resources/picture/icon.png" sizes="16x16">
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

<div class="container">
    <h1>Viðburðarleit IceArt</h1>
</div>


<div class="container">
    <form method="GET" action="/search/">
        <div class="form-group col-xs-3 col-md-3">
            <div class="form-group row">
                <label for="search" class="control-label">Leitarorð</label>
                <input type="text" name="text" id="search" class="form-control" placeholder="Leitarorð" \>
            </div>
        </div>
        <div class="form-group col-xs-6 col-md-6">
            <label for="dateBegin" class="control-label">Dagsetning</label>
            <div class="form-group row">
                <div class="col-md-5">
                    <input type="date" class="form-control" id="dateBegin" name="dateBegin" required value="${todayDate}">
                </div>
                <label for="dateEnd" class="col-md-1 control-label"> - </label>
                <div class="col-md-5">
                    <input type="date" class="form-control" id="dateEnd" name="dateEnd" required value="${inWeekDate}">
                </div>
            </div>
        </div>
        <div class="form-group col-xs-3 col-md-3">
            <div class="form-group row">
                <label for="category" class="control-label">Flokkur</label>
                <c:choose>
                    <c:when test="${not empty categories}">
                        <select name="category" id="category" class="form-control">
                            <c:forEach var="category" items="${categories}">
                                <option value="${category.getId()}">${category.getTitle()}</option>
                            </c:forEach>
                        </select>
                    </c:when>
                    <c:otherwise>
                        Enginn flokkur hefur verið skráður.<br>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
        <button type="submit" value="Search" class="btn btn-default">
            <span class="glyphicon glyphicon-search"></span> Leita
        </button>
    </form>
    <br>
</div>

<div class="container">
    <h2>Topp 10 viðburðir</h2>
</div>

<c:choose>
    <c:when test="${not empty events}">
        <c:forEach var ="event" items="${events}">
            <div class="container well">
                <h3>${event.getTitle()}</h3>
                <p>${event.getDateBegin()} - ${event.getTimeBegin()}</p>
                <p>${event.getArtist()}</p>

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
        <h3>Engir viðburðir</h3>
    </c:otherwise>
</c:choose>

</body>

</html>