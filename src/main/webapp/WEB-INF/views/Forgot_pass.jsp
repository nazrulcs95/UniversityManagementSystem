<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>::Open Student Account::</title>
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
                <li><a href="#">Home</a></li>
            </ul>
            <ul class="main-nav-ul2">
                <li><a href="index.php">About us</a></li>
                <li><a href="#">Contact us</a></li>
            </ul>
        </nav>
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
                    <img class="or_image" src="image/or-seperator.jpg" alt=""/>
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
        <footer>
            <div class="footer-main">
                <p>Copyright@All rights reserved by Nazrul,Kafi,Sourov.</p>
            </div>
        </footer>
    </body>
</html>


