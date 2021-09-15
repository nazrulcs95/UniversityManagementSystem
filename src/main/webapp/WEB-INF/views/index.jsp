<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="main">
	<div class="loginpage">
		<div class="row">
			<h1 class="home_h1">Welcome To Our University Management System</h1>
			<a href="loginHome" class="sub1">Login</a> 
			<a href="registrationHome" class="sub2">Registration</a>
		</div>
	</div>
</div>
<%@ include file="common/footer.jsp"%>
<script type="text/javascript">
	$(document).ready(function() {
		$("#datepicker").datepicker();
	});
</script>