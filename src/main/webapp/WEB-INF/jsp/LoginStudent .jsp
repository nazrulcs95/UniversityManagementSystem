<?php
    session_start();
    $db=mysqli_connect("localhost","root","","Department");
    if(isset($_POST['login_btn'])){
        $email=$_POST['login_email'];
        $password=$_POST['login_password'];
        $sql = "SELECT id FROM admin WHERE username = '$email' and passcode = '$password'";
        
        $result = mysqli_query($db,$sql);
        $row = mysqli_fetch_array($result,MYSQLI_ASSOC);
        $active = $row['active'];

        $count = mysqli_num_rows($result);

        // If result matched $myusername and $mypassword, table row must be 1 row

        if($count == 1) {
           session_register("email");
           $_SESSION['login_user'] = $email;
           header("location: StudentPanel.php");
        }
    }
?>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>::....Login || Student....::</title>
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
                <b>language:</b><br>
                <select class="lang" name="#">
                <option value="#">English &nbsp; &nbsp; &nbsp; </option>
                <option value="#">বাংলা  </option>
            </select>
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
                            <h1> Login as Student</h1>
                            <p> Login now to access your account. </p>
                            <form id="loginform" class="login_form" role="form" method="POST" action="">
                                <div class="form-group">
                                    <label class="email">
                                        Email
                                        <span class="required">*</span>
                                        :
                                    </label>
                                    <div class="login_in">
                                        <input id="username" class="form-control" type="text" value="" name="login_email">
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
                                        <button class="login_button" value="login" type="submit" name="login_btn">Login</button>
                                        
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
</html>

