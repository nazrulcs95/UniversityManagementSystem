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
            $sql="INSERT INTO teachers(Name,Username,Email,Password,Faculty,Department,Gender,DOB,Address,Phone)
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
        <title>::..Open Teacher Account..::</title>
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
                            <h1> Register as Teacher </h1>
                            <p>Please fill the field below.</p>
                            <form class="register_form" method="post" action="">
                                <div class="form-group">
                                    <label class="first_name_label" for="email">
                                        First Name
                                        <span class="required">*</span>
                                        :
                                    </label>
                                    <div class="register_in">
                                        <input id="register_first_name" type="text" maxlength="100" name="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="last_name_label">
                                    Last Name
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_last_name" type="text" maxlength="100" name="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="last_name_label">
                                    Username
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_last_name" type="text" maxlength="100" name="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="mail-label">
                                    Email
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_email" type="text" maxlength="150" name="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="mail-label">
                                    Faculty
                                    <span class="required">*</span>
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
                                    <label class="mail-label">
                                    Department
                                    <span class="required">*</span>
                                    :
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
                                    <label class="mail-label">
                                    Department
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                        <select>
                                            <option>Professor</option>
                                            <option>Ass. Professor</option>
                                            <option>Sr. Lecturer</option>
                                            <option>Lecturer</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="create_password_label">
                                        Gender:
                                    </label>
                                    <div class="register_in">
                                        <input class="radio"  type="radio" name="gender" value="Male"/>Male
                                        <input class="radio" type="radio" name="gender" value="Female" />Female
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="create_password_label">
                                        Date Of Birth
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                        <input id="datepicker" class="form-control" type="text" maxlength="50" name="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="create_password_label">
                                        Address
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                        <textarea name="addrtxt" cols="22" rows="3"> </textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="create_password_label">
                                        Phone
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_create_password" class="form-control" type="text" maxlength="50" name="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="create_password_label">
                                    Create Password
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_create_password" class="form-control" type="password" maxlength="50" name="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="confirm_password_label">
                                    Confirm Password
                                    <span class="required">*</span>
                                    :
                                    </label>
                                    <div class="register_in">
                                    <input id="register_confirm_password" class="form-control" type="password" maxlength="50" name="">
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
</html>
