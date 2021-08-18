<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="main">
	<div class="loginpage">
		<div class="row">
			<div class="signup">
				<div class="signup_pannel">
					<h1>Register as ${role}</h1>
					<p>Please fill the field below.</p>
					<form class="register_form" method="post" action="">
						<div class="form-group">
							<label class="first_name_label" for="email"> First Name <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_first_name" type="text" maxlength="100"
									name="">
							</div>
						</div>
						<div class="form-group">
							<label class="last_name_label"> Last Name <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_last_name" type="text" maxlength="100"
									name="">
							</div>
						</div>
						<div class="form-group">
							<label class=""> Email <span class="required">*</span>
								:
							</label>
							<div class="register_in">
								<input id="register_email" type="text" maxlength="150" name="">
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Create Password <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_create_password" class="form-control"
									type="password" maxlength="50" name="">
							</div>
						</div>
						<div class="form-group">
							<label class="confirm_password_label"> Confirm Password <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_confirm_password" class="form-control"
									type="password" maxlength="50" name="">
							</div>
						</div>
						<div class="form-group">
							<label class=""> Faculty <span class="required">*</span>
								:
							</label>
							<div class="register_in">
								<select>
									<option>FSIT</option>
									<option>FBE</option>
									<option>FHSS</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class=""> Department <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<select>
									<option>CSE</option>
									<option>EEE</option>
									<option>ETE</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label class="create_password_label"> Gender: </label>
							<div class="register_in">
								<input class="radio" type="radio" name="gender" value="Male" />Male
								<input class="radio" type="radio" name="gender" value="Female" />Female
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Date Of Birth <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="datepicker" class="form-control" type="text"
									maxlength="50" name="">
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Address <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<textarea name="addrtxt" cols="22" rows="3"> </textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="create_password_label"> Phone <span
								class="required">*</span> :
							</label>
							<div class="register_in">
								<input id="register_create_password" class="form-control"
									type="text" maxlength="50" name="">
							</div>
						</div>
						
						<div class="form-group">
							<span class="indicates"> <span class="required">*</span>
								Indicates required field
							</span>
						</div>
						<div class="form-group">
							<div class="btn">
								<button class="register_button" value="Register" type="submit">Register</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jsp"%>

