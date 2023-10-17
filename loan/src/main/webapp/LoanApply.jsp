<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar" style="background-color: black; color:white">
		<h2 >X-workz</h2>
		<button  type="submit" style="margin-left: 160vh"><a href="Index.jsp">Home</a></button>
		<button type="submit" ><a href="LoanApplySuccess.jsp">Loan Success</a></button>
		
	</nav>
	
	<form action="loanInfo" method="post">
	
	<h1>Loan Application</h1>
	<div >
 Name :<input type="text" placeholder="name" name="name">
</div><br>

    <div>
 Amount :<input type="number"  placeholder="amount" name="amount">
</div><br>

<div >
 Working :<input type="text" placeholder="working" name="working">
</div><br>

<div >
 Interest :<input type="number" placeholder="interest" name="interest">
</div><br>

    <div>
 Surety :<input type="text"  placeholder="surety" name="surety">
</div><br>

<div >
 Company :<input type="text" placeholder="company" name="company">
</div><br>

<div >
 Loan Tenure :<input type="number" placeholder="loan tenure" name="tenure">
</div><br>

    <div>
 Loan Type :<input type="text"  placeholder="loan type" name="type">
</div><br>

<div >
 <div class="form-check">
  <input class="form-check-input" type="checkbox" id="flexCheckChecked" name="terms" value="yes">
  <label class="form-check-label" for="flexCheckChecked">
    Accept the terms
  </label>
</div>

<div>
<input type="submit" value="Save" class="btn btn-primary"/>
</div>
</span>
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>