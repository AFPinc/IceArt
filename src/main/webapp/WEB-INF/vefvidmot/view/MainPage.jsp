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
    <link rel="stylesheet" type="text/css" href="<c:url value="resources/static.css/mainpage.css"/>"/>
</head>

<body>

<div class="navbar">
    <a href="">Home</a>
    <div class="dropdown">
        <button class="dropbtn">Add
            <i class="fa fa-caret-down"></i>
        </button>
        <div class="dropdown-content">
            <a href="/event/event">Add Event</a>
            <a href="/location/location">Add Location</a>
            <a href="/artist/artist">Add Artist</a>
        </div>
    </div>
</div>

<h1>Welcome to IceArt</h1>

<form method="GET" action="/search/search">
    Search for a title: <input type="text" name="title"\><br>
    <input type="submit" value="Search"/>
</form>

<form method="POST" action="/event/event">
    <input type="submit" value="Add Event"/>
</form>
<!--
<form method="POST" action="/AddLocation">
    <input type="submit" value="Add Location"/>
</form>

<form method="POST" action="/AddArtist">
    <input type="submit" value="Add Location"/>
</form>

<form method="POST" action="/AccountController">
    <input type="submit" value="AccountController"/>
</form>
-->

</body>

</html>