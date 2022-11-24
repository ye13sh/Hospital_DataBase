package com.manipal_hospital.Repository;

import com.manipal_hospital.Constants.QueryConstant;
import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateDoctorRepository {
    private static Connection connection;
    private static ConnectionUtil util;
    private static PreparedStatement pstmt;

    public UpdateDoctorRepository() {
        util=new ConnectionUtil();
    }

    public void updateDoctor(DoctorDTO doctorDTO)throws DB_ERROR_Exception {
        try {
            //id is down because in QueryConstant in DOCTOR it is written in that way
            //But in .jsp page and servlet class you can start writing from id
            connection= util.getConnection();
            pstmt=connection.prepareStatement(QueryConstant.Update_Doctor_query);
            pstmt.setString(1, doctorDTO.getName());
            pstmt.setInt(2,doctorDTO.getAge());
            pstmt.setInt(3,doctorDTO.getContact());
            pstmt.setString(4,doctorDTO.getMail());
            pstmt.setString(5,doctorDTO.getQualification());
            pstmt.setString(6,doctorDTO.getSpecialization());
            pstmt.setString(7,doctorDTO.getAddress());
            pstmt.setInt(8,doctorDTO.getId());

            pstmt.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
            throw new DB_ERROR_Exception("Error while connecting updateDoctor repository",e);
        }finally {
            try {
                connection.close();
                pstmt.close();
            }catch (Exception e){
                throw new DB_ERROR_Exception("Error while closing connection & pstmt",e);
            }

        }
    }
}
