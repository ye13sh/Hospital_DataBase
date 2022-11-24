package com.manipal_hospital.Servlet;

import com.manipal_hospital.DTO.PatientDTO;
import com.manipal_hospital.Service.UpdatePatientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdatePatientServlet extends HttpServlet {
    private static UpdatePatientService service;

    @Override
    public void init() throws ServletException {
        service=new UpdatePatientService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            PatientDTO patientDTO=new PatientDTO();
            patientDTO.setId(Integer.valueOf(req.getParameter("id")));
            patientDTO.setName((String) req.getParameter("name"));
            patientDTO.setAge(Integer.valueOf(req.getParameter("age")));
            patientDTO.setDoctor_name((String) req.getParameter("doctor_name"));
            patientDTO.setTreatment((String) req.getParameter("treatment"));
            patientDTO.setContact(Integer.valueOf(req.getParameter("contact")));
            patientDTO.setAddress((String) req.getParameter("address"));

            service.updatePatient(patientDTO);
            resp.sendRedirect("update_patient_success.jsp");
        }catch (Exception e){
            System.out.println(e);
            resp.sendRedirect("update_patient_failure.jsp");
        }
    }
}
