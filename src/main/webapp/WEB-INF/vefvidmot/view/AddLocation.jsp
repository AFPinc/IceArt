<!DOCTYPE html>

<!--
@author Ása Júlía Aðalsteinsdóttir
@date September 2017
Háskóli Íslands

Pakkinn view geymir allar .jsp skrár sem segja til um hvað er á vefnum.
Þessi klasi geymir uppbyggingu notendaviðmóts á staðsetningum
-->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

<html lang="is">

<head>
    <meta charset="UTF-8">
    <title>Add location</title>
</head>
<body>

<h1>Add a new location</h1>

<form action="/location/add" method="POST">
    Name of location: <input type="text" name="name"\><br>
    Opening hours: <input type="text" name="openHours"\><br>
    Max people: <input type="text" name="maxPeople"\><br>
    Description: <textarea type="text" name="description"\></textarea><br>

    <input type="submit" class="newwhitebtn" value="Add"/>

</form>

<form method="POST" action="/event/event">
    <input type="submit" value="Add Event"/>
</form>

<form method="POST" action="/">
    <input type="submit" value="Back to home"/>
</form>

</body>

</html>