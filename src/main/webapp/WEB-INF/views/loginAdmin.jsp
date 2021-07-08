<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="main">
	<div class="loginpage">
		<div class="row">
			<div class="login">
				<div class="login_pannel">
					<h1>Login as Administrator</h1>
					<p>Login now to access your account.</p>
					<form id="loginform" class="login_form" role="form" method="POST"
						action="">
						<div class="form-group">
							<label class="Lgin_Email"> Email <span class="required">*</span>
								:
							</label>
							<div class="login_in">
								<input id="email" class="form-control" type="text" value=""
									name="login_email">
							</div>
						</div>
						<div class="form-group">
							<label class="Login_pasword"> Password <span
								class="required">*</span> :
							</label>
							<div class="login_in">
								<input id="password" class="form-control" type="password"
									name="login_password">
							</div>
						</div>
						<div class="form-group">
							<span class="indicates"> <span class="required">*</span>Indicates
								required field
							</span>
						</div>
						<div class="form-group">
							<div class="btn">
								<button class="login_button" value="login" type="submit"
									name="logon_btn" onclick="return validate()">Login</button>

							</div>
							<span class="forgot_pass"> <a href="Forgot_pass.jsp">Forgot
									Password?</a>
							</span>
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
<script>
	var attempt = 3; // Variable to count number of attempts.

	// Below function Executes on click of login button.
	function validate() {
		var email = document.getElementById("email").value;
		var password = document.getElementById("password").value;
		var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

		if (email != '' && password != '') {
			//var address = document.getElementById[email].value;
			if (reg.test(email) == false) {
				alert('Invalid Email Address');
				return false;
			}
		}

		else if (email == '' && password != '')
			alert('Please enter your Email Address');
		else if (email != '' && password == '')
			alert('please enter your Password');
		else
			alert('please enter your Email Address and Password');
	}
</script>

