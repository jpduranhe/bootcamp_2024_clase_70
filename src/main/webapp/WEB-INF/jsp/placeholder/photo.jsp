<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="card" style="width: 18rem;">
		  <img src="<c:url value = "${photo.url}"/>" class="card-img-top" alt="...">
		  <div class="card-body">
		    <h5 class="card-title">${ photo.title }</h5>
		    <p class="card-text">${ photo.id }</p>
		    <a href="#" class="btn btn-primary">${photo.albumId}</a>
		  </div>
		</div>
	</div>

</body>
</html>