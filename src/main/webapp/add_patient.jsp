<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Details</title>
</head>
<body>
 <div align="center">
  <h1>Patient Details</h1>
  <form action="<%= request.getContextPath() %>/insertPatient" method="post">
   <table style="with: 80%">
     <td>Patient Name</td>
     <td><input type="text" name="name" /></td>
    </tr>
    <tr>
     <td>Age</td>
     <td><input type="text" name="age" /></td>
    </tr>
    <tr>
     <td>Doctor Name</td>
     <td><input type="text" name="doctor_name" /></td>
    </tr>
    <tr>
     <td>Treatment</td>
     <td><input type="text" name="treatment" /></td>
    </tr>
    <tr>
     <td>Contact</td>
     <td><input type="text" name="contact" /></td>
    </tr>
    <tr>
      <td>Address</td>
      <td><input type="text" name="address" /></td>
      </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>