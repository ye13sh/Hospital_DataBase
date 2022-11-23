package com.manipal_hospital.Servlet;

import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.Service.GetDoctorByIDService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetDoctorByIDServlet extends HttpServlet {
    private static GetDoctorByIDService service;

    @Override
    public void init() throws ServletException {
        service=new GetDoctorByIDService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            System.out.println("request coming to servlet");
            int id=Integer.valueOf(req.getParameter("id"));
            DoctorDTO doctorDTO=service.getDoctorByID(id);
            if(null !=doctorDTO) {
                req.setAttribute("doctorDTO", doctorDTO);
                RequestDispatcher dispatcher = req.getRequestDispatcher("doctor_details.jsp");
                dispatcher.forward(req, resp);

            }
            else {
                resp.sendRedirect("doctor_id_not_found.jsp");
            }

        }catch (Exception e){
            System.out.println(e);
            resp.sendRedirect("get_doctor_by_id_failure.jsp");
        }

    }
}
