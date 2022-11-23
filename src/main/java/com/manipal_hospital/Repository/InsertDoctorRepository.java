package com.manipal_hospital.Repository;

import com.manipal_hospital.Constants.QueryConstant;
import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDoctorRepository {
    private static Connection connection;
    private static ConnectionUtil util;
    private static PreparedStatement pstmt;

    public InsertDoctorRepository() {
        util=new ConnectionUtil();
    }
    //id,name,age,contact,mail,qualification,specialization,address
    public void insertDoctor(DoctorDTO doctorDTO)throws DB_ERROR_Exception {
        try{
            System.out.println("request coming to repo");
        connection= util.getConnection();
        pstmt=connection.prepareStatement(QueryConstant.Insert_Doctor_query);
        pstmt.setInt(1,getLastId()+1);
        pstmt.setString(2,doctorDTO.getName());
        pstmt.setInt(3,doctorDTO.getAge());
        pstmt.setInt(4,doctorDTO.getContact());
        pstmt.setString(5,doctorDTO.getMail());
        pstmt.setString(6,doctorDTO.getQualification());
        pstmt.setString(7,doctorDTO.getSpecialization());
        pstmt.setString(8,doctorDTO.getAddress());

        pstmt.executeUpdate();
            System.out.println("inserted success");
        }catch (Exception e){
            System.out.println(e);
            throw new DB_ERROR_Exception("Error while connecting insertDoctor repository",e);
        }finally {
            try {
                connection.close();
                pstmt.close();
            }catch (Exception e){
                throw new DB_ERROR_Exception("Error while closing connection & pstmt",e);
            }
        }

    }
    private int getLastId() throws DB_ERROR_Exception{

        try {
            connection = util.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM DOCTOR ORDER BY id DESC LIMIT 1");
            while (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            System.out.println(e);
            throw  new DB_ERROR_Exception(" Exception Occurred while getting the last record primary ID",e);
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                throw new DB_ERROR_Exception("Exception Occurred while closing the Connection",e);
            }
        }
        return 0;
    }
}
