package com.manipal_hospital.Repository;

import com.manipal_hospital.Constants.QueryConstant;
import com.manipal_hospital.DTO.PatientDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdatePatientRepository {
    private static Connection connection;
    private static ConnectionUtil util;
    private static PreparedStatement pstmt;

    public UpdatePatientRepository() {
        util=new ConnectionUtil();
    }

    public void updatePatient(PatientDTO patientDTO)throws DB_ERROR_Exception{
        try {
            //id is down because in QueryConstant in PATIENT it is written in that way
            //But in .jsp page and servlet class you can start writing from id
            connection= util.getConnection();
            pstmt=connection.prepareStatement(QueryConstant.Update_Patient_query);
            pstmt.setString(1, patientDTO.getName());
            pstmt.setInt(2, patientDTO.getAge());
            pstmt.setString(3, patientDTO.getDoctor_name());
            pstmt.setString(4, patientDTO.getTreatment());
            pstmt.setInt(5, patientDTO.getContact());
            pstmt.setString(6, patientDTO.getAddress());
            pstmt.setInt(7,patientDTO.getId());

            pstmt.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
            throw new DB_ERROR_Exception("Error while connecting updatePatient repository",e);
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
