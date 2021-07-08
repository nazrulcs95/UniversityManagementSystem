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
	<div class="login_home_page">
		<div class="row">

			<div class="massage">
				<h4>
					<?php echo $_SESSION['massage']; ?>
				</h4>
			</div>
			<div class="register_home">
				<h1>Register as :</h1>
				<a href="RegisterTeacher.php" class="sub2">Teacher</a> <a
					href="RegisterStudent.php" class="sub3">Student</a> <a
					href="RegisterStaff.php" class="sub1">Staff</a>
			</div>

		</div>
	</div>
</div>
<%@ include file="common/footer.jsp"%>

