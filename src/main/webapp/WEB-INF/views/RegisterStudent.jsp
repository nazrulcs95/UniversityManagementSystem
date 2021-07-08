<?php
    session_start();
    $db=mysqli_connect("localhost","root","","Department");
    if(isset($_POST['register_btn'])){
        $name=$_POST['firstname'+''+'lastname'];
        $username=$_POST['username'];
        $pass1=$_POST['pass1'];
        $pass2=$_POST['pass2'];
        $email=$_POST['email'];
        $faculty=$_POST['faculty'];
        $department=$_POST['department'];
        $gender=$_POST['gender'];
        $dob=$_POST['dob'];
        $address=$_POST['address'];
        $phone=$_POST['phone'];
        function test_input($data) {
            $data = trim($data);
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
        }
        if($pass1==$pass2){
            $password=md5($pass1);
            $sql="INSERT INTO students(Name,Username,Email,Password,Faculty,Department,Gender,DOB,Address,Phone)
                 VALUES('$name','$username','$email','$password','$faculty','$department','$gender','$dob','$address','$phone')";
            mysqli_query($db,$sql);
            echo "Your request has been sent to admin to aprove.";
            header("location:RegisterHome.php");
        }else{
            echo "Passwords do not match.";
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
        <title>::...Open Student Account...::</title>
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
                    <div class="signup">
                        <div class="signup_pannel">
                            <h1> Open Student Account </h1>
                            <p>Please fill the field below to Open Student Account</p>
                            <form class="register_form" method="post" action="">
                                <div class="form-group">
                                    <label class="first_name_label" for="email">
                                        First Name
                                        <span class="required">*</span>
                                        :
                                    </label>
                                    <div class="register_in">
                                        <input id="register_first_name" type="text" maxlength="100" name="firstname">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="last_name_label">
                                    Last Name
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_last_name" type="text" maxlength="100" name="lastname">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="last_name_label">
                                    Username
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_last_name" type="text" maxlength="100" name="username">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="create_password_label">
                                    Create Password
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_create_password" class="form-control" type="password" maxlength="50" name="pass1">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="confirm_password_label">
                                    Confirm Password
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_confirm_password" class="form-control" type="password" maxlength="50" name="pass2">
                                    <p id="alert"></p>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="mail-label">
                                    Email
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_email" type="text" maxlength="150" name="email">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="mail-label">
                                    Faculty
                                    <span class="required">*</span>
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
                                    <label class="mail-label">
                                    Department
                                    <span class="required">*</span>
                                    :
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
                                    <label>
                                        Gender:
                                    </label>
                                    <div class="register_in">
                                        <input class="radio" type="radio" name="gender" value="Male"/>Male
                                        <input class="radio" type="radio" name="gender" value="Female" />Female
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>
                                        Date Of Birth
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                        <input id="datepicker" class="form-control" type="text" maxlength="50" name="dob">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="create_password_label">
                                        Address
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                        <textarea name="address" cols="22" rows="3"> </textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="create_password_label">
                                        Phone
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_create_password" class="form-control" type="text" maxlength="50" name="phone">
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                        <span class="indicates"> <span class="required">*</span> Indicates required field</span>
                                </div>
                                <div class="form-group">
                                    <div class="btn">
                                        <button class="register_button" value="Register" type="submit" name="register_btn">Register</button>
                                    </div>
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
        
    </script>
</html>

