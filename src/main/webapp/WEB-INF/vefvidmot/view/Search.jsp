<!DOCTYPE html>

<!--
@author Ása Júlía Aðalsteinsdóttir
@date September 2017
Háskóli Íslands

Pakkinn view geymir allar .jsp skrár sem segja til um hvað er á vefnum.
Þessi klasi geymir uppbyggingu notendaviðmóts á leitarvélinni
-->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="is">

<head>
    <meta charset="UTF-8">
    <title>Search</title>
</head>
<body>

<h1>Search</h1>

<form action="/addArtist.jsp" method="get">
    Search for: <input type="text" name="keyWords"><br>

</form>

</body>

</html>