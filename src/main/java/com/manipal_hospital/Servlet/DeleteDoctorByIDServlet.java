package com.manipal_hospital.Servlet;

import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Service.DeleteDoctorByIDService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteDoctorByIDServlet extends HttpServlet {
    private static DeleteDoctorByIDService service;

    @Override
    public void init() throws ServletException {
        service=new DeleteDoctorByIDService();
    }
//id,name,age,contact,mail,qualification,specialization,address
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       try {
          int id=Integer.valueOf(req.getParameter("id"));
          service.deleteDoctor(id);
           resp.sendRedirect("delete_doctor_success.jsp");
       }catch (Exception e){
           resp.sendRedirect("delete_doctor_failure.jsp");
       }

    }
}
