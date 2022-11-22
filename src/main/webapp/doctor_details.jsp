<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
 <tr>
  <h1>Get Doctor By Using DoctorID</h1>
   <table style="with: 80%">
     <td>Enter Doctor ID</td>
     <td><input type="text" name="id" value="${doctor.id}" /></td>
    </tr>
    <tr>
       <td>Doctor Name</td>
       <td><input type="text" name="name" value="${doctor.name}" /></td>
       </tr>
    <tr>
        <td>Age</td>
        <td><input type="text" name="age" value="${doctor.age}" /></td>
        </tr>
    <tr>
        <td>Contact</td>
        <td><input type="text" name="contact" value="${doctor.contact}" /></td>
         </tr>
    <tr>
         <td>Mail</td>
          <td><input type="text" name="mail" value="${doctor.mail}" /></td>
            </tr>
    <tr>
            <td>Qualification</td>
            <td><input type="text" name="qualification" value="${doctor.qualification}" /></td>
            </tr>
    <tr>
            <td>Specialization</td>
            <td><input type="text" name="specialization" value="${doctor.specialization}" /></td>
            </tr>
    <tr>
            <td>Address</td>
            <td><input type="text" name="address" value="${doctor.address}" /></td>
            </tr>
    <tr>
    <td><a href="update_doctor.jsp" style="margin-right: 30px">Update Doctor</a></td>
    <td><a href="delete_doctor.jsp">Delete Doctor</a></td>
    </tr>

   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>