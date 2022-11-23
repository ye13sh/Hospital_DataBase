package com.manipal_hospital.Servlet;

import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.DTO.PatientDTO;
import com.manipal_hospital.Service.DeletePatientByIDService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeletePatientByIDServlet extends HttpServlet {
    private static DeletePatientByIDService service;

    @Override
    public void init() throws ServletException {
        service=new DeletePatientByIDService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            System.out.println("request came to servlet");
            int id=Integer.valueOf(req.getParameter("id"));
            service.deletePatient(id);
            resp.sendRedirect("delete_patient_success.jsp");

        }catch (Exception e){
            System.out.println(e);
            resp.sendRedirect("delete_patient_failure.jsp");
        }
    }
}
