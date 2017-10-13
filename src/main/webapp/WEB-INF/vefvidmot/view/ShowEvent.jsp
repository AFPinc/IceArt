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

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

<html lang="is">

<head>
    <meta charset="UTF-8">
    <title>Event</title>
</head>
<body>

<h1>Info</h1>
<p><strong>Title:</strong>${event.getTitle()}</p>
<p><strong>Location:</strong>${event.getLocation()}</p>
<p><strong>From:</strong>${event.getTimeBegin()}</p>
<p><strong>To:</strong>${event.getTimeEnd()}</p>
<p><strong>Artist:</strong>${event.getArtist()}</p>
<p><strong>Description:</strong>${event.getDescription()}</p>

<form method="POST" action="/event/event">
    <input type="submit" value="Add Event"/>
</form>

<form method="POST" action="/">
    <input type="submit" value="Back to home"/>
</form>


</body>

</html>