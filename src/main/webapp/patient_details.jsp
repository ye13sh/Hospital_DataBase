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
         <td><input type="text" name="id" value="${patientDTO.id}" /></td>
        </tr>
        <tr>
            <td>Patient Name</td>
            <td><input type="text" name="name" value="${patientDTO.name}" /></td>
           </tr>
        <tr>
               <td>Age</td>
               <td><input type="text" name="age" value="${patientDTO.age}" /></td>
               </tr>
         <tr>
             <td>Doctor Name</td>
              <td><input type="text" name="doctor_name" value="${patientDTO.doctor_name}" /></td>
              </tr>
       <tr>
           <td>Treatment</td>
           <td><input type="text" name="treatment" value="${patientDTO.treatment}" /></td>
            </tr>
       <tr>
              <td>Contact</td>
              <td><input type="text" name="contact" value="${patientDTO.contact}" /></td>
               </tr>
       <tr>
              <td>Address</td>
              <td><input type="text" name="address" value="${patientDTO.address}" /></td>
               </tr>

       <tr>
       <td><a href="<%= request.getContextPath() %>/updatePatient?id=${patientDTO.id}">Update Patient</a></td>
       <td><a href="<%= request.getContextPath() %>/deletePatient?id=${patientDTO.id}">Delete Patient</a></td>
       </tr>

       </table>
       <input type="submit" value="Submit" />
      </form>
     </div>
    </body>
    </html>