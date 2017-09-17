<!DOCTYPE html>

/**
* @author Ása Júlía Aðalsteinsdóttir - aja11@hi.is
* @date September 2017
* Háskóli Íslands
*
*
*/

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

<form action="/addLocation" method="get">
    Name of location: <input type="text" name="locationName"\><br>
    Description: <textarea type="text" name="locationDescription"\></textarea><br>
    Opening hours: <input type="text" name="locationOpenHours"\><br>
    Max people: <input type="text" name="locationMaxPeople"\><br>

    <input type="submit" value="Submit"/>
</form>

</body>

</html>