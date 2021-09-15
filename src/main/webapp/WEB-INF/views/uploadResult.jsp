<%@ include file="common/header.jsp"%>
<nav class="main-nav">
	<ul class="main-nav-ul">
		<li><a href="classSchedule.jsp">Home</a></li>
		<li><a href="uploadResult.jsp">Profile</a></li>
		<li><a href="#">Take Attendance</a></li>
		<li><a href="#">Update Result</a></li>
		<li><a href="studentList.jsp">Student List</a></li>
	</ul>
	<ul class="main-nav-ul2">
		<li><a href="#">About us</a></li>
		<li><a href="#">Contact us</a></li>
	</ul>
</nav>
<div class="main">
	<div class="loginpage">
		<div class="row">
			<div class="signup">
				<div class="signup_pannel">
					<h1>Upload Result</h1>
					<p>Please fill the field below.</p>
					<form class="register_form" method="post" action="">
						<div class="form-group">
							<label class="first_name_label" for="email"> Student
								Name: </label>
							<div class="register_in">
								<input id="register_first_name" type="text" maxlength="100"
									name="">
							</div>
						</div>
						<div class="form-group">
							<label class="last_name_label"> Faculty Name: </label>
							<div class="register_in">
								<input id="register_last_name" type="text" maxlength="100"
									name="">
							</div>
						</div>
						<div class="form-group">
							<label class="mail-label"> Department Name: </label>
							<div class="register_in">
								<input id="register_email" type="text" maxlength="150" name="">
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Subject Name: </label>
							<div class="register_in">
								<input id="datepicker" class="form-control" type="text"
									maxlength="50" name="">
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Mid term: </label>
							<div class="register_in">
								<input id="datepicker" class="form-control" type="text"
									maxlength="50" name="">
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Final: </label>
							<div class="register_in">
								<input id="datepicker" class="form-control" type="text"
									maxlength="50" name="">
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Note: </label>
							<div class="register_in">
								<textarea name="addrtxt" cols="22" rows="3"> </textarea>
							</div>
						</div>

						<div class="form-group">
							<span class="indicates"> <span class="required">*</span>
								Indicates required field
							</span>
						</div>
						<div class="form-group">
							<div class="btn">
								<button class="register_button" value="Register" type="submit">Upload</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jsp"%>
<script>
	$(document).ready(function() {
		$("#datepicker").datepicker();
	});
</script>

