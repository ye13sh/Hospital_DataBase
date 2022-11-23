package com.manipal_hospital.Servlet;

import com.manipal_hospital.DTO.PatientDTO;
import com.manipal_hospital.Service.InsertPatientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InsertPatientServlet extends HttpServlet {
    private static InsertPatientService service;

    @Override
    public void init() throws ServletException {
        service=new InsertPatientService();
    }
//id,name,age,doctor_name,treatment,contact,address
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //do not give id while inserting in servlet
            PatientDTO patientDTO=new PatientDTO();
            patientDTO.setName((String) req.getParameter("name"));
            patientDTO.setAge(Integer.valueOf(req.getParameter("age")));
            patientDTO.setDoctor_name((String) req.getParameter("doctor_name"));
            patientDTO.setTreatment((String) req.getParameter("treatment"));
            patientDTO.setContact(Integer.valueOf(req.getParameter("contact")));
            patientDTO.setAddress((String) req.getParameter("address"));

            service.insertPatient(patientDTO);
            resp.sendRedirect("insert_patient_success.jsp");
        }catch (Exception e){
            resp.sendRedirect("insert_patient_failure.jsp");
        }
    }
}
