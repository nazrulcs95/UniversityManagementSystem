<%@ include file="common/header.jsp"%>
	<nav class="main-nav">
		<ul class="main-nav-ul">
			<li><a href="index.php">Home</a></li>
		</ul>
		<ul class="main-nav-ul2">
			<li><a href="#">About us</a></li>
			<li><a href="#">Contact us</a></li>
		</ul>
	</nav>
	<div class="main">
		<div class="loginpage">
			<div class="row">
				<h1 class="home_h1">Welcome To Our University Management System</h1>
			</div>
		</div>
	</div>
	<%@ include file="common/footer.jsp"%>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#datepicker").datepicker();
		});
	</script>