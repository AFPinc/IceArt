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
    <title>Viðburður - IceArt</title>
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
    <h1>Upplýsingar um viðburð</h1>
    <hr />
    <form id="deleteEvent" action="/event/delete/${event.getId()}" method="POST" class="form-horizontal">
        <div class="form-group">
            <dl class="dl-horizontal">
                <dt>
                    Titill:
                </dt>

                <dd>
                    ${event.getTitle()}
                </dd>

                <dt>
                    Staðsetning:
                </dt>

                <dd>
                    <a class="a-info" href="../location/${event.getLocationId()}">${event.getLocation()}</a>
                </dd>

                <dt>
                    Frá:
                </dt>

                <dd>
                    ${event.getDateBegin()}
                    </br>
                        kl. ${event.getTimeBegin()}
                </dd>
                <dt>
                    Til:
                </dt>

                <dd>
                    ${event.getDateEnd()}
                </br>
                       kl. ${event.getTimeEnd()}

                </dd>
                <dt>
                    Listamaður:
                </dt>

                <dd>
                    <a class="a-info" href="../artist/${event.getArtistId()}">${event.getArtist()}</a>
                </dd>
                <dt>
                    Flokkur:
                </dt>

                <dd>
                    ${event.getCategory()}
                </dd>
                <dt>
                    Lýsing:
                </dt>

                <dd>
                    ${event.getDescription()}
                </dd>
            </dl>
        </div>
        <div class="form-group">
                <c:if test="${currentUser != null}">
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">Eyða viðburði</button>
                        </div>
                    </div>
                </c:if>
        </div>
    </form>

</div>

</body>

</html>