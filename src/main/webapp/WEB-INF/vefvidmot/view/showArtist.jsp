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
    <title>Artist</title>
</head>
<body>

    <c:choose>
        <c:when test="${not empty artists}">
            <table class="artists">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Country</th>
                    <th>Description</th>
                </tr>
                </thead>
                <c:forEach var ="artist" items="${artists}">
                    <tr>
                        <td>${artist.artistName} </td>
                        <td>${artist.artistAge}</td>
                        <td>${artist.artistCountry}</td>
                        <td>${artist.artistDescription}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h3>No artists></h3>
        </c:otherwise>
    </c:choose>
</body>

</html>