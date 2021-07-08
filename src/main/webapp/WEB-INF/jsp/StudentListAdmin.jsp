<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>::..Student List..::</title>
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
            <h1>Teacher Panel</h1>
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
                    
                   <div class="score">
                        <table class="table_search">
                            <tr>
                                <td><a href="?tag=score_entry"><input type="button" title="Add new Scores" name="butAdd" value="Add New" id="button-search" /></a></td>
                                <td><input type="text" name="searchtxt" title="Enter name for search " class="search" autocomplete="off"/></td>
                                <td>
                                    <select class="search_by">
                                        <option selected>Search by</option>
                                        <option>ID</option>
                                        <option>Name</option>
                                        <option>Department</option>
                                        <option>Email</option>
                                        <option></option>
                                    </select>
                                </td>
                                <td><input type="submit" name="btnsearch" value="Search" id="button-search" title="Search Score" /></td>
                            </tr>
                        </table>
                    </div>
                    <br />

                    <div id="content-input">
                        <table class="table_list" border="1" width="1050px" align="center" cellpadding="3" class="mytable" cellspacing="0">
                            <tr>
                                <th>No</th>
                                <th>ID</th>
                                <th>Students Name </th>
                                <th>Gender</th>
                                <th>DOB</th>
                                <th>Email</th>
                                <th>Phone</th>
                                <th>Action</th>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td class="act_btn">
                                    <button class="act">Update</button>
                                    <button class="act">Delete</button>
                                </td>
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

