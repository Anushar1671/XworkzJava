<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<nav class="navbar" style="background-color: black; color:white">
		<h2 >X-workz</h2>
		
		<button type="submit" ><a href="ContactSuccess.jsp">ContactSuccess</a></button>
		
	</nav><br>
	<h2>Contact Details..</h2>
<form action="contact" method="post"  class="p-3 mb-2 bg-secondary text-white" >
<div >
 Name : <input type="text" placeholder="name" name="name" />
</div><br>
<div >
 Email : <input type="email" placeholder="email" name="email" />
</div><br>
<div >
 Mobile : <input type="number" placeholder="mobile" name="mobile" />
</div><br>
<div >
 Comment : <input type="text" placeholder="comment" name="comment" />
</div><br>
<input type="submit" value="Send" class="btn btn-success" />
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>