<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Random generator</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
	<link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
	<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
  </head>
  <body>
  <div class="mdl-grid">
  <div class="mdl-cell mdl-cell--4-col">
  	<form>
  	<div class="mdl-textfield mdl-js-textfield">
  	Min:
  	<input name="min" value="${min}" class="mdl-textfield__input" type="text" pattern="-?[0-9]*(\.[0-9]+)?">
    <span class="mdl-textfield__error">Input is not a number!</span>
  	</div>
  	<br>
  	<div class="mdl-textfield mdl-js-textfield">
  	Max:
  	<input name="max" value="${max}" class="mdl-textfield__input" type="text" pattern="-?[0-9]*(\.[0-9]+)?">
    <span class="mdl-textfield__error">Input is not a number!</span>
  	</div>
  	<br><br>
  	<button type="submit" class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent">
  		Generate
	</button>
  	</form>
  	</div>
  	<div class="mdl-cell mdl-cell--4-col">
    <h1>${randomNumber}</h1>
    </div>
    </div>
  </body>
</html>