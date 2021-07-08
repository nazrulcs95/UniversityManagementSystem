<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="main">
	<div class="loginpage">
		<div class="row">
			<div class="signup">
				<div class="signup_pannel">
					<h1>Open Student Account</h1>
					<p>Please fill the field below to Open Student Account</p>
					<form class="register_form" method="post" action="">
						<div class="form-group">
							<label class="first_name_label" for="email"> First Name <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_first_name" type="text" maxlength="100"
									name="firstname">
							</div>
						</div>
						<div class="form-group">
							<label class="last_name_label"> Last Name <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_last_name" type="text" maxlength="100"
									name="lastname">
							</div>
						</div>
						<div class="form-group">
							<label class="last_name_label"> Username <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_last_name" type="text" maxlength="100"
									name="username">
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Create Password <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_create_password" class="form-control"
									type="password" maxlength="50" name="pass1">
							</div>
						</div>
						<div class="form-group">
							<label class="confirm_password_label"> Confirm Password <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_confirm_password" class="form-control"
									type="password" maxlength="50" name="pass2">
								<p id="alert"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="mail-label"> Email <span class="required">*</span>
								:
							</label>
							<div class="register_in">
								<input id="register_email" type="text" maxlength="150"
									name="email">
							</div>
						</div>
						<div class="form-group">
							<label class="mail-label"> Faculty <span class="required">*</span>
								:
							</label>
							<div class="register_in">
								<select name="faculty">
									<option value="FSIT" name="faculty">FSIT</option>
									<option value="FBE" name="faculty">FBE</option>
									<option value="FHSS" name="faculty">FHSS</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="mail-label"> Department <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<select name="department">
									<option value="CSE" name="department">CSE</option>
									<option value="EEE" name="department">EEE</option>
									<option value="ETE" name="department">ETE</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label> Gender: </label>
							<div class="register_in">
								<input class="radio" type="radio" name="gender" value="Male" />Male
								<input class="radio" type="radio" name="gender" value="Female" />Female
							</div>
						</div>
						<div class="form-group">
							<label> Date Of Birth <span class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="datepicker" class="form-control" type="text"
									maxlength="50" name="dob">
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Address <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<textarea name="address" cols="22" rows="3"> </textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Phone <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_create_password" class="form-control"
									type="text" maxlength="50" name="phone">
							</div>
						</div>

						<div class="form-group">
							<span class="indicates"> <span class="required">*</span>
								Indicates required field
							</span>
						</div>
						<div class="form-group">
							<div class="btn">
								<button class="register_button" value="Register" type="submit"
									name="register_btn">Register</button>
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

