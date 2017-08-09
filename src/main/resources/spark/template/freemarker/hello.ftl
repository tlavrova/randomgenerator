<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Random generator</title>
  </head>
  <style>
  	h1 {
  		font-size: 15pt;
  	}
  </style>
  <body>
  	<form>
  	Min:<br>
  	<input type="number" name="min" value="${min}">
  	<br>
  	Max:<br>
  	<input type="number" name="max" value="${max}">
  	<br><br>
  	<input type="submit" value="Generate">
  	</form>
    <h1>${randomNumber}</h1>
  </body>
</html>