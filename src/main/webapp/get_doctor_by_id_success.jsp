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
   <form action="<%= request.getContextPath() %>/getDoctorByID?id=${id}" method="get">
     <td>Enter Doctor ID</td>
     <td><input type="text" name="id"  /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>