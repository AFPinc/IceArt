<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="is">

<head>
    <meta charset="UTF-8">
    <title>Góðan daginn</title>
</head>
<body>

<h1>Góðan daginn</h1>

<form method="POST" action="/demo/hver">
    Hvað heitiru? <input name="nafn" type="text" placeholder="Nafn"\>
    <input type="submit" value="Í lagi"/>
</form>

</body>

</html>