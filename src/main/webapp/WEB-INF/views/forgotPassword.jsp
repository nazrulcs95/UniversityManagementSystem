<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="main">
	<div class="loginpage">
		<div class="row">
			<div class="forgot_pass">
				<h1>Password Recovery</h1>
				<p>Enter the Email address you use to login.</p>
				<form class="forgot_pass_form" method="post" action="">
					<div class="forgot_pass_input">
						<input class="forgot_pass_in" type="text" maxlength="100" name="">
					</div>
					<div class="forgot_pass_btn">
						<button class="forgot_pass_button" value="Submit" type="submit">Submit</button>
					</div>
				</form>
			</div>
			<div class="forgot_pass">
				<img class="or_image" src="images/or-seperator.jpg" alt="" />
				<p>Enter the verification code you got by email.</p>
				<form class="verify_form" method="post" action="">
					<div class="forgot_pass_input">
						<input class="forgot_pass_in" type="text" maxlength="100" name="">
					</div>
					<div class="forgot_pass_btn">
						<button class="forgot_pass_button" value="Continue" type="submit">Continue</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jsp"%>


