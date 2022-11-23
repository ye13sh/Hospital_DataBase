package com.manipal_hospital.Servlet;

import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.Service.InsertDoctorService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InsertDoctorServlet extends HttpServlet {
    private static InsertDoctorService service;

    @Override
    public void init() throws ServletException {
        service=new InsertDoctorService();
    }
//id,name,age,contact,mail,qualification,specialization,address
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //do not give id while inserting in servlet
            DoctorDTO doctorDTO=new DoctorDTO();
            doctorDTO.setName((String) req.getParameter("name"));
            doctorDTO.setAge(Integer.valueOf(req.getParameter("age")));
            doctorDTO.setContact(Integer.valueOf(req.getParameter("contact")));
            doctorDTO.setMail((String) req.getParameter("mail"));
            doctorDTO.setQualification((String) req.getParameter("qualification"));
            doctorDTO.setSpecialization((String) req.getParameter("specialization"));
            doctorDTO.setAddress((String) req.getParameter("address"));

            service.insertDoctor(doctorDTO);
            resp.sendRedirect("insert_doctor_success.jsp");
        }catch (Exception e){
            System.out.println(e);
            resp.sendRedirect("insert_doctor_failure.jsp");
        }
    }
}
