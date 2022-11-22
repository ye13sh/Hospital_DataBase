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
            connection= util.getConnection();
            pstmt=connection.prepareStatement(QueryConstant.Update_Doctor_query);
            pstmt.setInt(1,doctorDTO.getId());
            pstmt.setString(2, doctorDTO.getName());
            pstmt.setInt(3,doctorDTO.getAge());
            pstmt.setInt(4,doctorDTO.getContact());
            pstmt.setString(5,doctorDTO.getMail());
            pstmt.setString(6,doctorDTO.getQualification());
            pstmt.setString(7,doctorDTO.getSpecialization());
            pstmt.setString(8,doctorDTO.getAddress());

            pstmt.executeUpdate();

        }catch (Exception e){
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
