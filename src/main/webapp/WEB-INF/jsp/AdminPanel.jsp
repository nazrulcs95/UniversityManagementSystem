<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>::..Admin Panrl..::</title>
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
            <h1>Administrator Panel</h1>
            <ul class="sub-nav-ul">
                <li><a href="LoginHome.php">Logout</a></li>
                <li><a href="#">Settings</a></li> 
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
            <div class="login_home_page">
                <div class="row">
                    
                    <div class="register_home">
                        <a href="AddTeacher.php" class="sub2">Add Teacher</a>
                        <a href="AddStudent.php" class="sub3">Add Student</a>
                        <a href="AddStaff.php" class="sub1">Add Staff</a>
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

