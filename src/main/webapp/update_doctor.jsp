
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Update</title>
</head>
<body>
 <div align="center">
  <h1>Doctor Update Form</h1>
  <form method="post" action="<%= request.getContextPath() %>/updateDoctor">
  <input type="hidden" name="_METHOD" value="PUT"/>
   <table style="with: 80%">
   <tr>
        <td>Doctor ID</td>
        <td><input type="text" name="id"  value="${doctorDTO.id}"/></td>
       </tr>
   <tr>
     <td>Doctor Name</td>
     <td><input type="text" name="name"  value="${doctorDTO.name}"/></td>
    </tr>
    <tr>
     <td>Age</td>
     <td><input type="text" name="age" value="${doctorDTO.age}" /></td>
    </tr>
    <tr>
     <td>Contact</td>
     <td><input type="text" name="contact" value="${doctorDTO.contact}" /></td>
    </tr>
    <tr>
     <td>Mail</td>
     <td><input type="text" name="mail" value="${doctorDTO.mail}" /></td>
    </tr>
    <tr>
     <td>Qualification</td>
     <td><input type="text" name="qualification" value="${doctorDTO.qualification}"  /></td>
    </tr>
    <tr>
     <td>Specialization</td>
     <td><input type="text" name="specialization" value="${doctorDTO.specialization}"/></td>
    </tr>
    <tr>
         <td>Address</td>
         <td><input type="text" name="address" value="${doctorDTO.address}"/></td>
        </tr>
   </table>
   <input type="submit" value="Update" />
  </form>
  <table align="center">
  <tr>
     <td><a href="add_doctor.jsp" style="margin-right: 30px">Add Doctor</a></td>
     <td><a href="index.jsp">Home</a></td>
     </tr>
     </table>
 </div>
</body>
</html>