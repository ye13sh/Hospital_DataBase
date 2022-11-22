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
      <h1>Get Patient By Using PatientId</h1>
       <table style="with: 80%">
         <td>Enter Patient ID</td>
         <td><input type="text" name="id" value="${patient.id}" /></td>
        </tr>
        <tr>
            <td>Patient Name</td>
            <td><input type="text" name="name" value="${patient.name}" /></td>
           </tr>
        <tr>
               <td>Age</td>
               <td><input type="text" name="age" value="${patient.age}" /></td>
               </tr>
         <tr>
             <td>Doctor Name</td>
              <td><input type="text" name="doctor_name" value="${patient.doctor_name}" /></td>
              </tr>
       <tr>
           <td>Treatment</td>
           <td><input type="text" name="treatment" value="${patient.treatment}" /></td>
            </tr>
       <tr>
              <td>Contact</td>
              <td><input type="text" name="contact" value="${patient.contact}" /></td>
               </tr>
       <tr>
              <td>Address</td>
              <td><input type="text" name="address" value="${patient.address}" /></td>
               </tr>

       <tr>
       <td><a href="update_patient.jsp" style="margin-right: 30px">AUpdate Patient</a></td>
       <td><a href="delete_patient.jsp">Delete Patient</a></td>
       </tr>

       </table>
       <input type="submit" value="Submit" />
      </form>
     </div>
    </body>
    </html>