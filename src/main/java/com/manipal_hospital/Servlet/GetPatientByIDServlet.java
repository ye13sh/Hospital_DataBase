package com.manipal_hospital.Servlet;

import com.manipal_hospital.DTO.PatientDTO;
import com.manipal_hospital.Service.GetPatientByIDService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetPatientByIDServlet extends HttpServlet {
    private static GetPatientByIDService service;

    @Override
    public void init() throws ServletException {
        service=new GetPatientByIDService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id=Integer.valueOf(req.getParameter("id"));
            PatientDTO patientDTO=service.getPatientByID(id);
            if(null !=patientDTO) {
                req.setAttribute("patientDTO", patientDTO);
                RequestDispatcher dispatcher = req.getRequestDispatcher("patient_details.jsp");
                dispatcher.forward(req, resp);
            }
            else {
                resp.sendRedirect("patient_id_not_found.jsp");
            }
        }catch (Exception e){
            System.out.println(e);
            resp.sendRedirect("get_patient_by_id_failure.jsp");
        }
    }
}
