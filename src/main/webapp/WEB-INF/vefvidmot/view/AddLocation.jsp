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
    <title>Add Location</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/main.css"/>" as=""/>
</head>

<body>

<div class="navbar">
    <a href="/">Home</a>
    <a href="/event/add">Add Event</a>
    <a href="/location/add">Add Location</a>
    <a href="/artist/add">Add Artist</a>
</div>

<div class="addDiv">
    <h1>Add a new location</h1>

    <form class="form-horizontal" action="/location/location" method="POST">
        <div class="form-group">
            <label for="name" class="col-sm-2 control-label">Name:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Name" id="name" name="name" pattern=".{1,50}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="openHours" class="col-sm-2 control-label">Opening hours:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="08:00-12:00" id="openHours" name="openHours" pattern="(([01]?[0-9]|2[0-3]):[0-5][0-9])-(([01]?[0-9]|2[0-3]):[0-5][0-9])" required>
            </div>
        </div>
        <div class="form-group">
            <label for="maxPeople" class="col-sm-2 control-label">Max people:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="100" id="maxPeople" name="maxPeople" pattern=".{1,10000000}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="description" class="col-sm-2 control-label">Description:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="..." id="description" name="description" pattern=".{1,50}" required>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Add</button>
            </div>
        </div>
    </form>
</div>

</body>

</html>