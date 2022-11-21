<!DOCTYPE html>
<html>
	<head>
		<title>HS</title>
		<meta charset="utf-8">
		<style type="text/css">
			body { font-family: garamond; text-align: center; width: 1500px }
			header, footer, nav, aside, section { margin: 5px; padding: 10px }
			header { height: 20px; width: 1465px; padding: 8px; margin-bottom: 60px; margin-top: 30px;
				font-size: 25pt; font-weight: bold; font-style: italic; color: #616161 }
			form { font-size: 10pt; padding: 10px }
			nav { width: 1465px; height: 40px }
			ul { list-style-type: none }
			ul:after { content:' '; display: block; clear: both }
			li { margin-left: 60px; margin-right: 60px; float: left; line-height: 30px; 
				vertical-align: middle; text-align: center }
			li a { display: block; text-align: center; padding: 16px; text-decoration: none;
				width: 200px; font-size: 15pt; font-weight: bold; background-color: #f7f7f7 }
			li a:hover { color: white; background-color: #787878 }
			section { margin-top: 50px }
			#click { color: #5b5b5b }
			#you { color: #000000; font-weight: bold; font-size: 12pt; font-style: italic }
			#box1 { position: relative; width: 1000px; margin-top: 20px; margin-left: 250px; margin-right: 250px }
			aside { width: 260px; background-color: #f2f2f2; font-size: 15pt; font-weight: bold;
				 border-radius: 10px }
			#another { font-size: 8pt; font-style: italic }
			footer { height: 50px; position: relative; clear: both; font-style: italic; font-size: 11pt; }
			a:link { text-decoration: none; color: #6e6e6e }
			a:visited { text-decoration: none; color: #6e6e6e }
			
		</style>
	</head>
	<body>
		<script type="text/javascript">
			function con() {
				return confirm("Are you curious about my food life?");
			}
		</script>

		<header>
			<a href="main.html" title="HyunSeo">&nbsp;&nbsp;&nbsp; Hi, I'm HyunSeo.</a>
		</header>

		<nav>
			<ul>
				<li><a href="nonogram.html" title="Nonogram">Nonogram</a></li>
				<li><a href="my love.html" title="My love">My love</a></li>
				<li><a href="my playlist2.html" title="Playlist">Playlist</a></li>
				<li><a href="food.html" title="Food"
					onclick="return con();">Food</a></li>
			</ul>
		</nav>
		<section>
			<article>
				<?php
					$name = $_POST["name"];
				?>
				<p id="click">Congratulations. 
					<span id="you"><?php print $name;?></span> can now join me now.</p>
			</article>
			<article>
				<div id="box1">
					<img src="sky.jpg" alt="sky img" width=1000>
				</div>
			</article>
		</section>
		<footer>created by iioflul<br>
			<a href="https://www.instagram.com/iioflul/">@iioflul</a>
		</footer>
	</body>
</html>