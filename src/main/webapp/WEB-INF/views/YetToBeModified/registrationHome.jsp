<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
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
				<a href="registration?role=Teacher" class="sub2">Teacher</a> <a
					href="registration?role=Student" class="sub3">Student</a> <a
					href="registration?role=Staff" class="sub1">Staff</a>
			</div>

		</div>
	</div>
</div>
<%@ include file="common/footer.jsp"%>

