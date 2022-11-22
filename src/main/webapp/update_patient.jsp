<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Update</title>
</head>
<body>
 <div align="center">
  <h1>Patient Update Form</h1>
  <form method="post" action="<%= request.getContextPath() %>/updatePatient">
  <input type="hidden" name="_METHOD" value="PUT"/>
   <table style="with: 80%">
   <tr>
        <td>Patient ID</td>
        <td><input type="text" name="id"  value="${patientDTO.id}"/></td>
       </tr>
   <tr>
     <td>Patient Name</td>
     <td><input type="text" name="name"  value="${patientDTO.name}"/></td>
    </tr>
    <tr>
     <td>Age</td>
     <td><input type="text" name="age" value="${patientDTO.age}" /></td>
    </tr>
    <tr>
     <td>Doctor Name</td>
     <td><input type="text" name="Doctor_name" value="${patientDTO.Doctor_name}" /></td>
    </tr>
    <tr>
     <td>Treatment</td>
     <td><input type="text" name="treatment" value="${patientDTO.treatment}" /></td>
    </tr>
    <tr>
     <td>Contact</td>
     <td><input type="text" name="contact" value="${patientDTO.contact}"  /></td>
    </tr>
    <tr>
         <td>Address</td>
         <td><input type="text" name="address" value="${patientDTO.address}"/></td>
        </tr>
   </table>
   <input type="submit" value="Update" />
  </form>
  <table align="center">
  <tr>
     <td><a href="addstudent.jsp" style="margin-right: 30px">Add Student</a></td>
     <td><a href="index.jsp">Home</a></td>
     </tr>
     </table>
 </div>
</body>
</html>