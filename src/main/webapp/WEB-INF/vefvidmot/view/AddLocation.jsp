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

</body>

</html>