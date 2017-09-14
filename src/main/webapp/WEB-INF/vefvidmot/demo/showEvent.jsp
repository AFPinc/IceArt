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
    <title>Event</title>
</head>
<body>

<h1>Info</h1>
<p><strong>Title:</strong>${eventTitle}</p>
<p><strong>Location:</strong>${eventLocation}</p>
<p><strong>From:</strong>${eventTimeBegin}</p>
<p><strong>To:</strong>${eventTimeEnds}</p>
<p><strong>Artist:</strong>${eventArtist}</p>
<p><strong>Description:</strong></p>
<p><strong>Delete:</strong></p>


</body>

</html>