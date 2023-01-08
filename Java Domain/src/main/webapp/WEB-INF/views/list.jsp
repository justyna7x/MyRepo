<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>List of Objects</title>
</head>
<body>
<h2>Customers</h2>
	<c:forEach items="${customers}" var="a">
		<p>${a}</p>
	</c:forEach>
	<h2>Advisors</h2>
	<c:forEach items="${advisors}" var="a">
		<p>${a}</p>
	</c:forEach>

<h2>Department</h2>
	<c:forEach items="${department}" var="a">
		<p>${a}</p>
	</c:forEach>

<h2>Loans</h2>
	<c:forEach items="${loans}" var="a">
		<p>${a}</p>
	</c:forEach>
</body>
</html>