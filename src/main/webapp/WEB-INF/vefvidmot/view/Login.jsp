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
    <title>Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/main.css"/>" as=""/>
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
    <h1>Innskráning</h1>

    <form class="form-horizontal" action="/user/login" method="GET" id="login" >
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">Notendanafn:</label>
            <div class="col-sm-10">
                 <input type="text" class="form-control" placeholder="Notendanafn" id="username" name="username" pattern=".{1,50}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">Lykilorð:</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" placeholder="Lykilorð" id="password" name="password" pattern=".{1,50}" required>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Innskrá</button>
            </div>
        </div>
    </form>

    <form class="form-horizontal" action="/user/signUpPage" method="GET" id="newUserButton">
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Stofna nýjan aðgang</button>
            </div>
        </div>
    </form>
 </div>

</body>

</html>