package com.manipal_hospital.Servlet;

import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.Service.UpdateDoctorService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateDoctorServlet extends HttpServlet {
    private static UpdateDoctorService service;

    @Override
    public void init() throws ServletException {
        service=new UpdateDoctorService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            DoctorDTO doctorDTO=new DoctorDTO();
            doctorDTO.setId(Integer.valueOf(req.getParameter("id")));
            doctorDTO.setName((String) req.getParameter("name"));
            doctorDTO.setAge(Integer.valueOf(req.getParameter("age")));
            doctorDTO.setContact(Integer.valueOf(req.getParameter("contact")));
            doctorDTO.setMail((String) req.getParameter("mail"));
            doctorDTO.setQualification((String) req.getParameter("qualification"));
            doctorDTO.setSpecialization((String) req.getParameter("specialization"));
            doctorDTO.setAddress((String) req.getParameter("address"));

            service.updateDoctor(doctorDTO);
            resp.sendRedirect("update_doctor_success.jsp");
        }catch (Exception e){
            System.out.println(e);
            resp.sendRedirect("update_doctor_failure.jsp");
        }
    }
}
