<!DOCTYPE html>

<!--
@author Ása Júlía Aðalsteinsdóttir
@date September 2017
Háskóli Íslands

Pakkinn view geymir allar .jsp skrár sem segja til um hvað er á vefnum.
Þessi klasi geymir uppbyggingu notendaviðmóts á forsíðu
-->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
<html lang="is">

<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
</head>
<body>

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