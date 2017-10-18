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
    <title>Add Artist</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/static.css/main.css"/>"/>
</head>

<body>

<div class="navbar">
    <a href="/">Home</a>
    <a href="/event/add">Add Event</a>
    <a href="/location/add">Add Location</a>
    <a href="/artist/add">Add Artist</a>
</div>

<div class="addDiv">
    <h1>Add a new artist</h1>

    <form class="form-horizontal">
        <div class="form-group">
            <label for="name" class="col-sm-2 control-label">Name:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" name="name" pattern=".{1,50}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="age" class="col-sm-2 control-label">Age:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="age" name="age" pattern="\d{1,2}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="country" class="col-sm-2 control-label">Country:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="country" name="country" pattern=".{1,50}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="description" class="col-sm-2 control-label">Description:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="description" name="description" pattern=".{1,100}" required>
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