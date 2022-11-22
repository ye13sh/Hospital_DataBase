<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lecturer Register Form</title>
</head>
<body>
 <div align="center">
  <h1>Doctor Details</h1>
  <form action="<%= request.getContextPath() %>/insertDoctor" method="post">
   <table style="with: 80%">
   <tr>
     <td>Doctor Name</td>
     <td><input type="text" name="name" /></td>
    </tr>
    <tr>
     <td>Age</td>
     <td><input type="text" name="age" /></td>
    </tr>
    <tr>
     <td>Contact</td>
     <td><input type="text" name="contact" /></td>
    </tr>
    <tr>
     <td>Mail</td>
     <td><input type="text" name="mail" /></td>
    </tr>
    <tr>
         <td>Qualification</td>
         <td><input type="text" name="qualification" /></td>
      </tr>
    <tr>
         <td>Specialization</td>
         <td><input type="text" name="specialization" /></td>
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