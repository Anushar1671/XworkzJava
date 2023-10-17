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
		<button type="submit" ><a href="ProductSuccess.jsp">ProductSuccess</a></button>
		
	</nav>
	
	<form action="products" method="post"  class="p-3 mb-2 bg-secondary text-white" >
	
	
	<h1>Product Information</h1>
	<span id="valid" style="padding-left:80px"></span>
	<h5 style="color: red"> ${cost}</h5>
	<div >
 Name : <input type="text" placeholder="name" name="name" onchange="handleName()" id="name"/>
</div><br>

    <div>
 Type : <select name="type" onchange="handleSelect()" id="select">
  <option >Select</option>
  <option>Shirt</option>
  <option>Tshirt</option>
  <option >Shoe</option>
  <option>Pant</option>
  <option>Jeans</option>
</select>
</div><br>

<div >
 Price : <input type="number" placeholder="price" name="price" onchange="handlePrice()" id="price"/>
</div><br>

<div>    
 Brand : <select name="brand" onchange="handleBrand()" id="brand"/>
  <option >Select</option>
  <option>Puma</option>
  <option>Adidas</option>
  <option >Levi's</option>
  <option>PeterEngland</option>
  <option>TokyoTalkies</option>
</select>
</div><br>

<div >
 Quantity : <input type="number" placeholder="quantity" name="quantity" onchange="handleQuantity()" id="quantity"/>
</div><br>

    <div>
 Description : <input type="text"  placeholder="desc" name="desc" onchange="handleDescription()" id="description"/>
</div><br>
        
        <input type="submit" value="Send" class="btn btn-success" id="button"/>
        
</span>
	</form>
	<script type="text/javascript">
	function handleName(event) {
		var disabled = true;
		var name = document.getElementById("name");
		console.log(name.value)
		var button = document.getElementById("button");
		if (name.value.length>=3&& name.value.length < 8) {
			document.getElementById("valid").innerHTML = disabled;
			document.getElementById("valid").innerHTML = "<span style='color:blue'>Name is valid</span>";
			button.removeAttribute("disabled");
		} else {
			document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter Valid name</span>";
			button.setAttribute("disabled","");
			return;
		}

	}
	
	function handlePrice(event) {
		var disabled = true;
		var price = document.getElementById("price");
		console.log(price.value)
		var button = document.getElementById("button");
		if (price.value>0&& price.value<50) {
			document.getElementById("valid").innerHTML = disabled;
			document.getElementById("valid").innerHTML = "<span style='color:blue'>Price is valid</span>";
			button.removeAttribute("disabled");
		} else {
			
			document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter valid price</span>";
			button.setAttribute("disabled","");
			return;
		}

	}
		
	
	
	function handleSelect() {
		var disabled = true;
		var select = document.getElementById("select");
		console.log(select.value)
		var button = document.getElementById("button");

		if (select.value === 'Select') {
			document.getElementById("valid").innerHTML = disabled;
			document.getElementById("valid").innerHTML = "<span style='color:blue'>Please Select Valid Option</span>";
			button.setAttribute("disabled", "");

		} else {
			button.removeAttribute("disabled");

			return;

		}

	}
	
	function handleQuantity(event) {
		var disabled = true;
		var quantity = document.getElementById("quantity");
		console.log(quantity.value)
		var button = document.getElementById("button");
		if (quantity.value>0&& quantity.value<50) {
			document.getElementById("valid").innerHTML = disabled;
			document.getElementById("valid").innerHTML = "<span style='color:blue'>quantity is valid</span>";
			button.removeAttribute("disabled");
		} else {
			document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter valid quantity</span>";
			button.setAttribute("disabled","");
			return;
		}

	}
	
	function handleBrand() {
		var disabled = true;
		var brand = document.getElementById("brand");
		console.log(brand.value)
		var button = document.getElementById("button");

		if (brand.value === 'Select') {
			document.getElementById("valid").innerHTML = disabled;

			document.getElementById("valid").innerHTML = "<span style='color:blue'>Please Select Valid Option</span>";
			button.setAttribute("disabled", "");

		} else {
			button.removeAttribute("disabled");

			return;

		}

	}
	
	function handleDescription(event) {
		var disabled = true;
		var description = document.getElementById("description");
		console.log(description.value)
		var button = document.getElementById("button");
		if (description.value.length>30 && description.value.length<100 ) {
			document.getElementById("valid").innerHTML = disabled;
			document.getElementById("valid").innerHTML = "<span style='color:blue'>Description is valid</span>";
			button.removeAttribute("disabled");
		} else {
			document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter valid description</span>";
			button.setAttribute("disabled","");
			return;
		}

	}
	
	</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>