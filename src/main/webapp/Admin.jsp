<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

<!-- <!-- <body background="assets/images/docter 2.jpg"/>  --> 
<div class="container">
 
  <img src="assets/images/docter 2.jpg" class="img-responsive" alt="Cinque Terre" width="1366" height="768"> 
</div> 
<h2>PharmacyAPP</h2>
<form action="Admin" method="post" >
  <!-- Form is always used below the head and ends above the body -->
AdminLogin :  <br>
Enter Name: <input type="text" name="name" placeholder="Enter Name" required autofocus/><br/>
Enter Password: <input type="password" name="password" placeholder="Enter password" required /><br/>
<button type="submit">submit</button><br/>
</form>
</body>
</html>