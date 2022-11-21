<!DOCTYPE html>
<html>
	<head>
		<title>my love</title>
		<meta charset="utf-8">
		<style type="text/css">
			body { font-family: garamond; text-align: center; width: 1500px }
			header, footer, nav, aside, section { margin: 5px; padding: 10px }
			header { height: 20px; width: 1465px; padding: 8px; margin-bottom: 60px;  margin-top: 30px;
				font-size: 25pt; font-weight: bold; font-style: italic }
			header a:link { color: #616161; text-decoration: none }
			header a:visited { color: #616161; text-decoration: none }
			form { font-size: 10pt; padding: 10px }
			nav { width: 1465px; height: 40px }
			ul { list-style-type: none }
			ul:after { content:' '; display: block; clear: both }
			li { margin-left: 60px; margin-right: 60px; float: left; line-height: 30px; 
				vertical-align: middle; text-align: center }
			li a { display: block; text-align: center; padding: 16px; text-decoration: none;
				width: 200px; font-size: 15pt; font-weight: bold; background-color: #f7f7f7 }
			li a:hover { color: white; background-color: #787878 }
			audio { position: fixed; top: 650px; right: 10px; width: 200px; }
			section { margin-top: 50px; margin-bottom: 100px }
			section table { border-spacing: 20px }
			#click { color: #5b5b5b; margin-bottom: 40px }
			.form1 { color: #969696; font-size: 12pt; font-weight: bold; }
			.form2 { color: #5b5b5b; font-size: 12pt; font-weight: bold; }
			aside { width: 1470px; background-color: #f2f2f2; font-size: 12pt; font-weight: bold;
				 border-radius: 10px }
			#pic { font-size: 20pt; font-style: italic }
			footer { height: 50px; position: relative; clear: both; font-style: italic; font-size: 11pt; margin-top: 100px }
			a:link { text-decoration: none; color: #6e6e6e }
			a:visited { text-decoration: none; color: #6e6e6e }
			table { border-spacing: 5px }
			
		</style>
	</head>
	<body>
		<script type="text/javascript">
			function con() {
				return confirm("Are you curious about my food life?");
			}
		</script>
		<audio loop controls src="Snow White.mp3"></audio> 

		<header>
			<a href="main.html" title="HyunSeo">&nbsp;&nbsp;&nbsp; Hi, I'm HyunSeo.</a>
		</header>

		<center>
		<nav>
		<ul>
				<li><a href="nonogram.html" title="Nonogram">Nonogram</a></li>
				<li><a href="my love.html" title="My love">My love</a></li>
				<li><a href="my playlist.html" title="Playlist">Playlist</a></li>
				<li><a href="food.html" title="food"
					onclick="return con();">food</a></li>
			</ul>
		</nav>
		</center>

		<section>
			<article class="form1">
				<p>Of course!! No wonder anyone who sees Dongglee gets happy.</p><br>
				<p>If so, I'll tell you the site about the Dongglee and Botong you were curious about.</p><br>
				<p>Click the icon below to link to the site!</p><br><br>
				<?php
					$site = $_GET["site"];
				?>
				<?php
					if($site == "youtube") 
						print "<a href='https://www.youtube.com/channel/UCVA204vbrA11sV5ujqY_58Q'>
						<img src='youtube.png' alt='Youtube' width='100' height='100'></a>";
					if($site == "insta") 
						print "<a href='https://www.instagram.com/dongggeul/'>
						<img src='insta.png' alt='Youtube' width='100' height='100'></a>";
					if($site == "twitter") 
						print "<a href='https://twitter.com/dongggeul'>
						<img src='twitter.png' alt='Youtube' width='100' height='100'></a>";
				?>
			</article><br>
			<article>
				<center>
				<table border="0">
					<tr>
                    <th>Pork cutlet</th>
						<th>Baby cat</th>
						<th>Do you have eerosoda?</th>
					</tr>
					<<tr>
						<td><br><iframe width="450" height="253" 
						src="https://www.youtube.com/embed/2mh-_5QjSL0" frameborder="0" 
						allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
						</td>
						<td><br><iframe width="450" height="253" 
						src="https://www.youtube.com/embed/7c-UnQD_Svs" frameborder="0" 
						allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
						</td>
						<td><br><iframe width="450" height="253"
						src="https://www.youtube.com/embed/5pOYIbj6kfY" frameborder="0"
						allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
						</td>
					</tr>
					<tr>
						<th><br><br><br>fell in love at first sight</th>
						<th><br><br><br>toys and puppy</th>
						<th><br><br><br>a first bath</th>
					</tr>
					<tr>
						<td><br><iframe width="450" height="253" 
						src="https://www.youtube.com/embed/e6q8XjEfJLk" frameborder="0" 
						allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
						</td>
						<td><br><iframe width="450" height="253" 
						src="https://www.youtube.com/embed/oErUhP--iDE" frameborder="0" 
						allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
						</td>
						<td><br><iframe width="450" height="253" 
						src="https://www.youtube.com/embed/ujeftMtfvw8" frameborder="0" 
						allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
						</td>
					</tr>
				</table>
				</center>
			</article>
		</section>
		<aside>
			<P id="pic">lovely pictures</p>
			<center>
			<table border="0">
                    <tr>
                        <th><a href="https://www.instagram.com/p/CV5dg7vgHIE/?igshid=YmMyMTA2M2Y=">stretch</a></th>
                        <th><a href="https://www.instagram.com/p/CVR9dkCv34V/?igshid=YmMyMTA2M2Y=">jelly</a></th>
                        <th><a href="https://www.instagram.com/p/CVXFyHxPera/?igshid=YmMyMTA2M2Y=">a cute beast</a></th>
                        <th><a href="https://www.instagram.com/p/CYBxxnHPdlg/?igshid=YmMyMTA2M2Y=">house</a></th>
                        <th><a href="https://www.instagram.com/p/CcKrrF8vOyl/?igshid=YmMyMTA2M2Y=">flower</a></th>
                        <th><a href="https://www.instagram.com/p/CV0RyIFP2Yv/?igshid=YmMyMTA2M2Y=">point</a></th>
                        <th><a href="https://www.instagram.com/p/CWS91tnvTtv/?igshid=YmMyMTA2M2Y=">under</a></th>
                    </tr>
                    <tr>
                        <td><a href="https://www.instagram.com/p/CV5dg7vgHIE/?igshid=YmMyMTA2M2Y=">
                            <img src="cat1.jpg" alt="동글 기지개" 
                            width="200" height="200" aling="center"></a>
                        </td>
                        <td><a href="https://www.instagram.com/p/CVR9dkCv34V/?igshid=YmMyMTA2M2Y=">
                            <img src="cat2.jpg" alt="동글 젤리" 
                            width="200" height="200" aling="center"></a>
                        </td>
                        <td><a href="https://www.instagram.com/p/CVXFyHxPera/?igshid=YmMyMTA2M2Y=">
                            <img src="cat3.jpg" alt="아가 동글 맹수" 
                            width="200" height="200" aling="center"></a>
                        </td>
                        <td><a href="https://www.instagram.com/p/CYBxxnHPdlg/?igshid=YmMyMTA2M2Y=">
                            <img src="cat4.jpg" alt="동글이의 숨숨집" 
                            width="200" height="200" aling="center"></a>
                        </td>
                        <td><a href="https://www.instagram.com/p/CcKrrF8vOyl/?igshid=YmMyMTA2M2Y=">
                            <img src="cat5.jpg" alt="동글이와 꽃" 
                            width="200" height="200" aling="center"></a>
                        </td>
                        <td><a href="https://www.instagram.com/p/CV0RyIFP2Yv/?igshid=YmMyMTA2M2Y=">
                            <img src="cat6.jpg" alt="동글이의 시점" 
                            width="200" height="200" aling="center"></a>
                        </td>
                        <td><a href="https://www.instagram.com/p/CWS91tnvTtv/?igshid=YmMyMTA2M2Y=">
                            <img src="cat7.jpg" alt="동글 멀봐" 
                            width="200" height="200" aling="center"></a>
                        </td>
                    </tr>
                </table>
			</center>
		</aside>
		<footer>created by iioflul<br>
			<a href="https://www.instagram.com/iioflul/">@iioflul</a>
		</footer>
	</body>
</html>