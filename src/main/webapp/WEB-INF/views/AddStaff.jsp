<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>::..Open Staff Account..::</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/Database_CSS.css" rel="stylesheet" type="text/css"/>
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
                <li><a href="AdminPanel.php">Home</a></li>
                <li><a href="#">Profile</a></li>
                <li><a href="AddStudent.php">Add Student</a></li>
                <li><a href="AddTeacher.php">Add Teacher</a></li>
                <li><a href="AddStaff.php">Add Staff</a></li>
                <li><a href="#">Add Course</a></li>
                <li><a href="#">Update Payment</a></li>
                <li><a href="StudentListAdmin.php">Student List</a></li>
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
                            <h1> Open Staff Account </h1>
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
                                        <button class="register_button" value="Register" type="submit">Add Staff</button>
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
</html>

