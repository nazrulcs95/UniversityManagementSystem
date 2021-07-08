<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>::....Login || Admin....::</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/Database_CSS.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
    </head>
    <body>
        <header>
            <div class="logo">
                <a href="https://www.daffodilvarsity.edu.bd/">
                    <img src="image/DIU.png">
                </a>
            </div>
            <ul class="sub-nav-ul">
                <li><a href="LoginHome.php">Login</a></li>
                <li><a href="RegisterHome.php">Register</a></li> 
                <li>
                	<b>language:</b><br>
		            <select class="lang" name="#">
		                <option value="#">English &nbsp; &nbsp; &nbsp; </option>
		                <option value="#">বাংলা  </option>
		            </select>
            	</li>
            </ul>
        </header>
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
                    <div class="login">
                        <div class="login_pannel">
                            <h1> Login as Administrator</h1>
                            <p> Login now to access your account. </p>
                            <form id="loginform" class="login_form" role="form" method="POST" action="">
                                <div class="form-group">
                                    <label class="Lgin_Email">
                                        Email
                                        <span class="required">*</span>
                                        :
                                    </label>
                                    <div class="login_in">
                                        <input id="email" class="form-control" type="text" value="" name="login_email">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="Login_pasword">
                                        Password
                                        <span class="required">*</span>
                                        :
                                    </label>
                                    <div class="login_in">
                                        <input id="password" class="form-control" type="password" name="login_password">
                                    </div>
                                </div>
                                <div class="form-group">
                                        <span class="indicates"> <span class="required">*</span>Indicates required field</span>
                                </div>
                                <div class="form-group">
                                    <div class="btn">
                                        <button class="login_button" value="login" type="submit" name="logon_btn" onclick="return validate()">Login</button>
                                        
                                    </div>
                                    <span class="forgot_pass">
                                        <a href="Forgot_pass.php">Forgot Password?</a>
                                    </span>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer>
            <div class="footer-main">
                <p>Copyright@All rights reserved by Nazrul,Kafi,Sourov.</p>
            </div>
        </footer>
    </body>
    <script>
        $(document).ready(function() {
          $("#datepicker").datepicker();
        });
    </script>
    <script>
        var attempt = 3; // Variable to count number of attempts.
        
        // Below function Executes on click of login button.
        function validate(){
            var email = document.getElementById("email").value;
            var password = document.getElementById("password").value;
            var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
        
            if(email !='' && password !='')
            {    
                //var address = document.getElementById[email].value;
                if (reg.test(email) == false) 
                {
                    alert('Invalid Email Address');
                    return false;
                }
            }
            
            else if(email =='' && password !='')
                alert('Please enter your Email Address');
            else if(email !='' && password =='')
                alert('please enter your Password');
            else
                alert('please enter your Email Address and Password');
        }
    </script>
</html>

