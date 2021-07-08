<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>::..Result..::</title>
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
            <h1>Result</h1>
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
                <li><a href="StudentPanel.php">Home</a></li>
                <li><a href="#">Profile</a></li>
                <li><a href="#">Course Registration</a></li>
                <li><a href="#">Result</a></li>
                <li><a href="#">Payment</a></li>
                <li><a href="#">Teaching Evaluation</a></li>
            </ul>
            <ul class="main-nav-ul2">
                <li><a href="#">About us</a></li>
                <li><a href="#">Contact us</a></li>
            </ul>
        </nav>
        <div class="main">
            <div class="login_home_page">
                <div class="row">
                    <div class="score">
                        <table width="755">
                                
                                <td><input type="text" name="searchtxt" title="Enter name for search " class="search" autocomplete="off"/></td>
                                <td style="float:right"><input type="submit" name="btnsearch" value="Search" id="button-search" title="Search Score" /></td>
                            </tr>
                        </table>
                    </div>
                    <br />

                    <div id="content-input">
                        <table class="table" border="1" width="1050px" align="center" cellpadding="3" class="mytable" cellspacing="0">
                            <tr>
                                <th>No</th>
                                <th>Students ID </th>
                                <th>Faculties ID</th>
                                <th>Subjecst ID </th>
                                <th>Mid-Term</th>
                                <th>Final</th>
                                <th>Total</th>
                                <th>Grade</th>
                                <th>SGPA</th>
                                
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                        </table>
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

