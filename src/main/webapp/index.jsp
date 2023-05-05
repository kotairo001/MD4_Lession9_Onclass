<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form method="post" action="/display-discount">
    <label>Product Description: </label><br/>
    <input type="text" name="description" placeholder="Description" width="30"/><br/>
    <label>List Price: </label><br/>
    <input type="text" name="price" placeholder="List Price" value="0"/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="percent" placeholder="Discount Percent" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>