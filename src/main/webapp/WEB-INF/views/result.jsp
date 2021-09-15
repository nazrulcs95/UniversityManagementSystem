<%@ include file="common/header.jsp"%>
        <nav class="main-nav">
            <ul class="main-nav-ul">
                <li><a href="studentPanel.jsp">Home</a></li>
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
                        	<tr>
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
<%@ include file="common/footer.jsp"%>

