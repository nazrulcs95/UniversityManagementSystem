<%@ include file="common/header.jsp"%>
        <nav class="main-nav">
            <ul class="main-nav-ul">
                <li><a href="TeacherPanel.php">Home</a></li>
                <li><a href="#">Profile</a></li>
                <li><a href="#">Take Attendance</a></li>
                <li><a href="#">Update Result</a></li>
                <li><a href="#">Student List</a></li>
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
                            <tr>
                                <td><a href="?tag=score_entry"><input type="button" title="Add new Scores" name="butAdd" value="Add New" id="button-search" /></a></td>
                                <td><input type="text" name="searchtxt" title="Enter name for search " class="search" autocomplete="off"/></td>
                                <td style="float:right" height="40px">
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
                        <table class="table" border="1" width="1050px" align="center" cellpadding="3" class="mytable" cellspacing="0">
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
                                <td></td>
                            </tr>
                        </table>
                    </div>
                    
                </div>
            </div>
        </div>
<%@ include file="common/footer.jsp"%>

