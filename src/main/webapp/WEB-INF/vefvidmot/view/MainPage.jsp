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
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/main.css"/>" as=""/>
</head>

<body>

<div class="navbar">
    <a href="/">Forsíða</a>
    <div class="dropdown">
        <div class="dropdown-content">
            <a href="/event/add">Skrá viðburð</a>
            <a href="/location/add">Skrá staðsetningu</a>
            <a href="/artist/add">Skrá listamann</a>
        </div>
    </div>
</div>

<div class="container">
    <h1>IceArt</h1>
</div>


<div class="container ">
    <form method="GET" action="/search/">
        <div class="form-group col-xs-4 col-md-4">
            <div class="form-group row">
                <label for="search" class="control-label">Leita</label>
                <input type="text" name="title" id="search" class="form-control" placeholder="Search" \>
            </div>
            <div class="form-group row">
                <label for="category" class="control-label">Flokkar</label>
                <c:choose>
                    <c:when test="${not empty categories}">
                        <select name="category" id="category" class="form-control">
                            <c:forEach var="category" items="${categories}">
                                <option value="${category.getId()}">${category.getTitle()}</option>
                            </c:forEach>
                        </select><br>
                    </c:when>
                    <c:otherwise>
                        Enginn flokkur hefur verið skráður.<br>
                    </c:otherwise>
                </c:choose>
            </div>
            <button type="submit" value="Search" class="btn btn-default">
                <span class="glyphicon glyphicon-search"></span> Leita
            </button>
        </div>
        <div class="form-group col-xs-8 col-md-8">
            <label for="dateBegin" class="control-label">Dagsetning</label>
            <div class="form-group row">
                <div class="col-md-5">
                    <input type="date" class="form-control" id="dateBegin" name="dateBegin" value="${today}">
                </div>
                <label for="dateEnd" class="col-md-1 control-label"> - </label>
                <div class="col-md-5">
                    <input type="date" class="form-control" id="dateEnd" name="dateEnd" value="${dateInWeek}">
                </div>
            </div>
            <label for="timeBegin" class="control-label">Tími</label>
            <div class="form-group row">
                <div class="col-md-5">
                    <input type="time" class="form-control" id="timeBegin" name="timeBegin" value="${timeToday}">
                </div>
                <label for="timeEnd" class="col-md-1 control-label"> - </label>
                <div class="col-md-5">
                    <input type="time" class="form-control" id="timeEnd" name="timeEnd" value="${timeInWeek}">
                </div>
            </div>
        </div>
    </form>
    <br>
</div>

<div class="container">
    <h2>Viðburðir</h2>
</div>

<c:choose>
    <c:when test="${not empty events}">
        <c:forEach var ="event" items="${events}">
            <div class="container well">
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
        <h3>Engir viðburðir</h3>
    </c:otherwise>
</c:choose>

</body>

</html>