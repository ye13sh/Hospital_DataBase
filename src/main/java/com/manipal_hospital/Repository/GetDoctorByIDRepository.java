package com.manipal_hospital.Repository;

import com.manipal_hospital.Constants.QueryConstant;
import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetDoctorByIDRepository {
    private static Connection connection;
    private static ConnectionUtil util;
    private static PreparedStatement pstmt;

    public GetDoctorByIDRepository() {
        util=new ConnectionUtil();
    }
    //id,name,age,contact,mail,qualification,specialization,address
    public DoctorDTO getDoctor(int id)throws DB_ERROR_Exception {
       try {
           connection= util.getConnection();
           pstmt=connection.prepareStatement(QueryConstant.Get_Doctor_By_ID_query);
           pstmt.setInt(1,id);
           ResultSet rs=pstmt.executeQuery();

           while (rs.next()){
               DoctorDTO doctorDTO=new DoctorDTO();
               doctorDTO.setId(rs.getInt("id"));
               doctorDTO.setName(rs.getString("name"));
               doctorDTO.setAge(rs.getInt("age"));
               doctorDTO.setContact(rs.getInt("contact"));
               doctorDTO.setMail(rs.getString("mail"));
               doctorDTO.setQualification(rs.getString("qualification"));
               doctorDTO.setSpecialization(rs.getString("specialization"));
               doctorDTO.setAddress(rs.getString("address"));
               return doctorDTO;

           }

       }catch (Exception e){
           throw new DB_ERROR_Exception("Error while connecting getDoctor repository",e);
       }finally {
           try{
           connection.close();
           pstmt.close();
           }catch (Exception e){
               throw new DB_ERROR_Exception("Error while closing connection & pstmt",e);
           }

       }
       return null;

    }
}
