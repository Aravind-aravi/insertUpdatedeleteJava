<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
</head>
<body>
	<form method="post" action="iudServlet">
		<table style="background-color:Skyblue; margin-left:20px; margin-right:20px; width:50%">
		<tr><td>
		<caption><b>Enter the resturant details</b></caption>
		</td>
		</tr>
			<tr>
				<td><label for="url"><b>Url </b></label></td>
				<td><input type="text" name="url" placeholder="Enter the url"
					size="20"><br></td>
			</tr>
			<tr>
				<td><label for="name"><b>Name </b></label></td>
				<td><input type="text" name="name" placeholder="Enter the name"
					size="20"><br></td>
			</tr>
			<tr>
				<td><label for="address"><b>Address </b></label></td><td> <input type="text"
					name="address" placeholder="Enter the address" size="20"><br></td>
			</tr>
			<tr>
				<td><label for="location"><b>Location </b></label> </td><td><input type="text"
					name="location" placeholder="Enter the location" size="20"><br></td>
			</tr>
			<tr>
				<td><label for="cusine"><b>Cusine </b></label></td><td><input type="text"
					name="cusine" placeholder="Enter the cusine" size="20"><br></td>
			</tr>
			<tr>
				<td><label for="dishes"><b>Dishes </b></label></td><td><input type="text"
					name="dishes" placeholder="Enter the dishes" size="20"><br></td>
			</tr>
			<tr>
				<td><label for="price"><b>Price </b></label></td><td> <input type="text"
					name="price" placeholder=" Enter the price" size="20"><br></td>
			</tr>
			<tr>
				<td><label for="ratings"><b>Ratings </b></label></td><td> <input type="text"
					name="ratings" placeholder=" Enter the ratings" size="20"><br></td>
			</tr>
			<tr>
				<td><label for="Votes"><b>Votes </b></label></td><td> <input type="text"
					name="votes" placeholder=" Enter the votes" size="20"><br></td>
			</tr>
			<tr>
				<td><label for="uniquekey"><b>Unique Key </b></label></td><td> <input type="text"
					name="uqkey" placeholder=" Enter the unique key" size="20"><br></td>
			</tr>
			<tr>
				<td><input type="submit" value="insert" name="submit"><br></td>
				<td><input type="submit" value="update" name="submit"><br></td>
				<td><input type="submit" value="delete" name="submit"><br></td>
			</tr>
		</table>
	</form>
</body>
</html>